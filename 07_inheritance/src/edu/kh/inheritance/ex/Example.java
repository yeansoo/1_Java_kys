package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class Example {	

	public void ex1() {
		// 상속 확인

		// Student 자식 객체 생성
		Student s1 = new Student();

		// 자식만의 기능/필드  (grade, classRoom)
		s1.setGrade(2);    // setGrade(int grade) : void  - Student (Student의 메서드)
		s1.setClassroom(3); // - Student (Student의 메서드)

		s1.setName("김"); // setName(String name) : void  - Person (Person의 메서드)
						  // -> 부모인 Person으로 부터 상속 받은 메서드라는 뜻

		s1.setAge(19);

		// int edu.kh.inheritance.model.vo.Student.getGrade()
		System.out.println(s1.getGrade());
		System.out.println(s1.getClassroom());


		// String edu.kh.inheritance.model.vo.Person.getName()
		System.out.println(s1.getName());
		System.out.println(s1.getGrade());


		// Object
		
		Person p1=new Person();
		
		// int java.lang.Object.hashCode()
		System.out.println(p1.hashCode());
		
		// -> Object 클래스는 모든 클래스의 최상위 부모
		// == 모든 클래스는 Object 클래스의 후손
		
		// int java.lang.Object.
		System.out.println(s1.hashCode());
		
		Student s2=new Student("김학생",17,1,3);
		
		System.out.println(s2.getGrade());
		System.out.println(s2.getClassroom());
		System.out.println(s2.getName());
		System.out.println(s2.getGrade());
	}
	
	public void ex2() {
		// 오버라이딩 : 재정의
		
		Person p1=new Person("홍길동", 15);
		Student s1=new Student("김학생",1, 2, 3);
		
		p1.introduce();
		s1.introduce();
		
		// -> 오버라이딩 진행 시 Student의 메서드로 인식됨
	}

}