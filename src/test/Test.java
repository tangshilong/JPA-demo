package test;

import cn.lacom.jpa.dao.StudentDao;
import cn.lacom.jpa.impl.StudentDaoImpl;

public class Test {
	
	public static void main(String[] args) throws Exception {
		StudentDao studentDao = new StudentDaoImpl();
//		Student student = new Student();
//		student.setStu_id(UUID.randomUUID().toString());
//		student.setStu_name("baijw");
//		student.setStu_major("¼ÆËã»ú");
//		student.setStu_age(12);
//		studentDao.insertStu(student);
		studentDao.findStuById("43b53a64-71a3-4734-ad76-681a63e3b9b6");
//		studentDao.updateStu(student);
//		studentDao.deleteStu("72db8700-67e9-44f4-bdfe-a84afc154a37");
		studentDao.findAll();
		studentDao.findByIdAndName("7798276c-f666-438b-8567-f60d59570906","ÌÀÊ¿Áú");
		studentDao.findByTSid();

	}
	

}
