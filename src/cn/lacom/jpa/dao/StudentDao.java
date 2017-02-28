package cn.lacom.jpa.dao;

import java.util.List;

import cn.lacom.jpa.entity.*;

public interface StudentDao {

	/**
	 * 查找所有student记录
	 * @return
	 * @throws Exception
	 */
	public List<Student> findAll() throws Exception;

	/**
	 * 根据id查找学生记录
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Student findStuById(String id) throws Exception;

	/**
	 * 添加新的student记录
	 * @param student
	 * @throws Exception
	 */
	public void insertStu(Student student) throws Exception;

	/**
	 * 删除一个student记录
	 * @param id
	 * @throws Exception
	 */
	public void deleteStu(String id) throws Exception;

	/**
	 * 更新一个student记录
	 * @param student
	 * @throws Exception
	 */
	public void updateStu(Student student) throws Exception;
	
	/**
	 * 根据id和name查找一个student记录 
	 * @param id
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<Student> findByIdAndName(String id,String name) throws Exception;
	
	/**
	 * 根据teacher的id查找student的id和name
	 * @return
	 * @throws Exception
	 */
	public List<Object[]> findByTSid() throws Exception;

}
