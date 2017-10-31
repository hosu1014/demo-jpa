package com.example.demo_jpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 정윤호
 *
 */
@Entity
public class Member  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String Id;
	@Column
	private String name;
	@Column
	private Integer age;
	
	public Member() {}
	public Member(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return String.format("name [%s], age : [%d]", this.name, this.age);
				
	}
	
}
