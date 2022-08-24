package edu.kh.poly.ex2.model.vo;

public class Person extends Animal{

	public String name;
	private int age;
	
	public Person() {
		super();// 미작성시 컴파일러가 자동 추가
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void breath() {
		// TODO Auto-generated method stub
			System.out.println("코와 입으로 숨을 쉽니다");
	}

	

	
}
