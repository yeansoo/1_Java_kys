package edu.kh.inheritance.model.vo;

import java.net.MulticastSocket;

public class Person extends Object{

	private String name;
	private int age;
	
	// ctrl + space bar + enter -> 기본 생성자 
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// alt + s -> o 또는 alt + shift + s -> o
	// Generate Constructor using fields...
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	// 자기소개 기능
	public void introduce() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
}
