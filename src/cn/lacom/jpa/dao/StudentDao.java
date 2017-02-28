package cn.lacom.jpa.dao;

import java.util.List;

import cn.lacom.jpa.entity.*;

public interface StudentDao {

	/**
	 * ��������student��¼
	 * @return
	 * @throws Exception
	 */
	public List<Student> findAll() throws Exception;

	/**
	 * ����id����ѧ����¼
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Student findStuById(String id) throws Exception;

	/**
	 * ����µ�student��¼
	 * @param student
	 * @throws Exception
	 */
	public void insertStu(Student student) throws Exception;

	/**
	 * ɾ��һ��student��¼
	 * @param id
	 * @throws Exception
	 */
	public void deleteStu(String id) throws Exception;

	/**
	 * ����һ��student��¼
	 * @param student
	 * @throws Exception
	 */
	public void updateStu(Student student) throws Exception;
	
	/**
	 * ����id��name����һ��student��¼ 
	 * @param id
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<Student> findByIdAndName(String id,String name) throws Exception;
	
	/**
	 * ����teacher��id����student��id��name
	 * @return
	 * @throws Exception
	 */
	public List<Object[]> findByTSid() throws Exception;

}
