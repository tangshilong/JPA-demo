package cn.lacom.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cn.lacom.jpa.dao.StudentDao;
import cn.lacom.jpa.entity.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<Student> findAll() throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<Student> list = entityManager.createQuery("from Student").getResultList();
		entityManager.close();
		entityManagerFactory.close();
		return list;
	}
	 
	

	@Override
	public Student findStuById(String id) throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student student=entityManager.find(Student.class, id);
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("this is a test 1!");
	    return student;
	}

	@Override
	public void insertStu(Student student) throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
	}

	@Override
	public void deleteStu(String id) throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Student student=entityManager.find(Student.class,id);
		entityManager.remove(student);
		entityManager.getTransaction().commit();
	}

	@Override
	public void updateStu(Student student) throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(student);
		entityManager.getTransaction().commit();
	}

	@Override
	public List<Student> findByIdAndName(String id,String name) throws Exception {
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	   EntityManager entityManager = entityManagerFactory.createEntityManager();
	   String jpql = "from Student"
			   +" where stu_id =:id and stu_name =:name";
	   Query query = entityManager.createQuery(jpql);
	   query.setParameter("id", id);
	   query.setParameter("name",name);
	   List<Student> list = query.getResultList();
	   entityManager.close();
	   entityManagerFactory.close();
//	   System.out.println("this is a test 2 !");
//	   System.out.println(list.get(0).getStu_id());
//	   System.out.println(list.get(0).getStu_name());
	   return list;
	}

	@Override
	public List<Object[]> findByTSid() throws Exception{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = " select s.stu_id,s.stu_name,s.stu_age,s.stu_major,t.t_name,t.t_major"
			      	+ " from Student s,Teacher t"
					+ " where s.stu_id = t.stu_id";
		Query query = entityManager.createQuery(jpql);
		List<Object[]> list = query.getResultList();
		entityManager.close();
		entityManagerFactory.close();
//		System.out.println("this is a test 3 !");
//		System.out.println(list.get(0)[0]);
//		System.out.println(list.get(0)[1]);
		return list;
	}
		
	}

