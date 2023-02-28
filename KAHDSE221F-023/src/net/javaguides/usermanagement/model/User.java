package net.javaguides.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="instructor")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	protected int id;
	
	@Column(name="name")
	protected String name;
	
	@Column(name="department")
	protected String email;
	
	@Column(name="doj")
	protected String country;
	
	public User() {
	}
	
	public User(String name, String department, String doj) {
		super();
		this.name = name;
		this.department = department;
		this.doj = doj;
	}

	public User(int id, String name, String department, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
}
