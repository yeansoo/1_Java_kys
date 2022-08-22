package edu.kh.objectarray.model.service;

import edu.kh.objectarray.model.vo.Student;

// model : 비즈니스 로직(데이터 가공, 관리, db, 연결 등)
// service : 회원가입, 로그인, 등록하기 등 기능 제공용 클래스
public class StudentManagementService {

	// Student 참조변수 5칸 객체 배열 생성
	private Student[] stdArr=new Student[5];
	
	// 기본 생성자
	public StudentManagementService() {
		stdArr[0]= new Student(3, 5, 17, "홍길동", 100, 30, 70);
		stdArr[1]= new Student(2, 7, 7, "신짱구", 10, 60, 90);
		stdArr[2]= new Student(2, 3, 6, "최미래", 80, 40, 60);
		stdArr[3]= new Student(1, 6, 22, "홍길동", 40, 20, 100);
	}
	
	/** 학생 추가 서비스 메서드
	 * @param grade
	 * @param classRoom
	 * @param number
	 * @param name
	 * @return 0(null 인덱스 없음) 또는 1(null인 인덱스가 있어서 학생 객체의 주소를 추가함)
	 */
	public int addStudent(int grade, int classRoom, int number, String name) {
		
		// 배열 요소 중 아무것도 참조하지 않는 (null) 인덱스 찾기
		// 단, 모든 인덱스가 참조중인 경우 
		
		// null인 인덱스 O -> 해당 인덱스에 객체 주소 대입 후 1 반환
		// null인 인덱스 X -> 0 반환
		
		// null 인덱스 찾기
		int idx=-1;
		
		for(int i=0;i<stdArr.length;i++) {
			if(stdArr[i]==null) { // 새로운 학생이 추가될 수 있는 자리가 있는 경우
				idx=i;
				break;
			}
		}
		
		if(idx==-1) {// null인 인덱스가 없는 경우
			return 0;// 현재 메서드를 종료하고 호출한 곳으로 0을 가지고 돌아감
		}
		
		// null인 인덱스에 학생 객체를 생성해서 주소를 대입
			
		stdArr[idx]=new Student(grade, classRoom, number,name);
		return 1;
		
	}
	
	// stdArr의 getter
	public Student[] getStdArr() {
		return stdArr;
	}
	
	/**
	 * @param idx(검색할 인덱스 번호)
	 * @return idx값에 따른 결과 문자열
	 */
	public String selectIndex(int idx) {
		
		//stdArr의 인덱스 범위 : 0~4
		
		if(idx<0 || idx>= stdArr.length) {// 범위 초과시
			return "입력된 값이 인데스 범위를 초과했습니다. ";
		}else {
			if(stdArr[idx]==null) {// null을 참조하는 인덱스인 경우
				return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
			}else {// 범위초과 X, null X -> 학생 정보 존재
				
				String str="이름 : "+stdArr[idx].getName();
				str+="\n학년 : "+stdArr[idx].getGrade();
				str+="\n  반 : "+stdArr[idx].getClassRoom();
				str+="\n번호 : "+stdArr[idx].getNumber();
				str+="\n국어 : "+stdArr[idx].getKor();
				str+="\n영어 : "+stdArr[idx].getEng();
				str+="\n수학 : "+stdArr[idx].getMath();
				
				return str;
			}
		}
//		System.out.println("|  학년  |  반  |  번호  |   이름   |  국어  |  영어  |  수학  |");
//		System.out.println("----------------------------------------------------------------");
//		
//		System.out.printf("|  %2d    |  %2d  |   %2d   |  %s  |  %3d   |  %3d   |  %3d   |\n"
//				,stdArr[idx].getGrade(),stdArr[idx].getClassRoom(),stdArr[idx].getNumber(),stdArr[idx].getName()
//				,stdArr[idx].getKor(),stdArr[idx].getEng(),stdArr[idx].getMath());
	}
	
	/** 학생 정보 수정 서비스 메서드
	 * @param idx
	 * @param kor
	 * @param eng
	 * @param math
	 * @return
	 * -1 : idx가 stdArr 배열의 범위를 초과하는 경우
	 *  0 : stdArr[idx]가 null을 참조하는 경우
	 *  1 : 정상적으로 수정이 된 경우
	 */
	public int updateStudent(int idx, int kor, int eng, int math) {
		//stdArr의 인덱스 범위 : 0~4
		
			if(idx<0 || idx>= stdArr.length) {// 범위 초과시
				return -1;
			}else {
				if(stdArr[idx]==null) {// null을 참조하는 인덱스인 경우
					return 0;
				}else {// 범위초과 X, null X -> 학생 정보 존재
					stdArr[idx].setKor(kor);	
					stdArr[idx].setEng(eng);	
					stdArr[idx].setMath(math);	
					return 1;
				}
			}
	}
	
	public String searchStudent(String name) {//혼자 한거.. 이건 배열안에 같은 이름이 없을때만 가능하다..

		int idx=-1;
		for(int i=0;i<stdArr.length && stdArr[i]!=null;i++) {
			if(name.equals(stdArr[i].getName())) {//이름이 같으면
				idx=i;
			}
		}
		
		if(idx==-1) {
			return "존재하지 않는 이름입니다.";
		}else {
			String str="이름 : "+stdArr[idx].getName();
			str+="\n학년 : "+stdArr[idx].getGrade();
			str+="\n  반 : "+stdArr[idx].getClassRoom();
			str+="\n번호 : "+stdArr[idx].getNumber();
			str+="\n국어 : "+stdArr[idx].getKor();
			str+="\n영어 : "+stdArr[idx].getEng();
			str+="\n수학 : "+stdArr[idx].getMath();
			
			return str;
		}
		
			
	}
	
	/**
	 * @param name
	 * @return
	 */
	public Student[] selectName(String name) {
		
		// stdArr 객체 배열의 각 인덱스가 참조하는 Student 객체가 있음
		// Student 개체의 필드 값 중 name과 입력받은 name이 일치하면
		// 해당 Student 객체의 주소를 별도 객체 배열에 저장해서 
		// 메서드 종료시 반환
		
		Student[] resultArr=new Student[stdArr.length];
		
		// resultArr에서 값을 대입할 인덱스 번호를 나타내는 변수
		int resultIdx=0;
		
		// stdArr배열에 순차 접근
		for(int i=0;i<stdArr.length;i++) {
			if(stdArr[i]==null) {
				break;// 반복 종료
			}
			
			// 학생이름 == 입력 이름 같으면
			if(stdArr[i].getName().equals(name)) {
				resultArr[resultIdx]=stdArr[i];
				
				resultIdx++; // 대입되는 인덱스를 다음으로 이동
			}
			
		}
		if(resultIdx==0) {
			return null;
		}
		else 
			return resultArr;
	}
}


