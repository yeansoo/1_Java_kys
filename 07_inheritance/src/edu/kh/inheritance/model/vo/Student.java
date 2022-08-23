package edu.kh.inheritance.model.vo;

public class Student extends Person {

	// 자식 Student 클래스에 
	// 부모 Person 클래스의 멤버(필드, 메서드)를 상속

	// extends : 확장하다
	// -> 자식이 자기의 멤버 + 부모의 멤버를 가지게 되어
	//    몸집이 커짐(확장됨)

//	private String name;
//	private int age;

	private int grade; // 학년
	private int classroom; // 반

	public Student() {	
		
		// Person(); // 부모 생성자 상속X
		
		
		
	}
	
	public Student(String name, int age, int grade, int classRoom) {
		// 상속받은 자식도 부모의 private필드 직접 접근 불가
		
		// 방법 1 . 부모의 getter/setter이용
//		setName(name);
//		setAge(age);
		
		// 방법2. super()생성자 이용
		//super(name,age);
		
		super(name,age); // super 생성자
		
		// 부모의 생성자를 참조하기 위해서 사용하는 생성자
		// 자식 생성자 내부 첫번째 줄에만 작성 가능
				
		// -> 자식객체 생성시 내부에 부모객체를 생성할 때 사용한다. 
				
		// -> 자식 생성자 첫번째 줄에
		// super() 작성자 미 작성시 컴파일러가 자동 추가
		
		this.grade=grade;
		this.classroom=classRoom;
	}
	
	

	// alt + shift + s -> r
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	// Person으로 부터 상속 받은 introduce() 메서드 오버라이딩
	
	@Override
	public void introduce() {
//		System.out.println("이름 : "+super.getName());
//		System.out.println("나이 : "+super.getAge());
		
		super.introduce();
		// 오버라이딩 되지 않은 부모의 introduce 메서드 호출
		
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classroom);
	}
	
	/* Annotation(@) : 컴파일러용 주석
	 * -> 컴파일러에게 해당 코드가 무엇을 의미하는지
	 * 아니면 해당 코드를 수행하기 전에 무엇을 해야하는지 등을 알려줌
	 * 
	 *  @Override
	 *   1) 컴파일러에게 해당 메서드는 오버라이딩 되었음을 알려줌
	 *   2) 오버라이딩이 가능한지, 
	 * 
	 */



}