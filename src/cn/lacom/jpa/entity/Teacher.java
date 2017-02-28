package cn.lacom.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	private String t_id;
	private String t_name;
	private int t_age;
	private String t_major;
	private String stu_id;

	public Teacher() {
	}

	@Id
	public String getT_id() {
		return t_id;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public int getT_age() {
		return t_age;
	}

	public void setT_age(int t_age) {
		this.t_age = t_age;
	}

	public String getT_major() {
		return t_major;
	}

	public void setT_major(String t_major) {
		this.t_major = t_major;
	}

}
