package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class SetService {

	/* Set(집합)
	 * - 순서를 유지하지 않음(인덱스X)
	 * - 중복 데이터 저장 불가(null도 1개만 저장 가능)
	 */
	
	public void ex1() {
		Set<String> set=new HashSet<String>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		
		
		System.out.println(set);
		
		// remove(String value) : Set에 저장된 객체 중 value가 같은 객체 제거
		// -> boolean 반환
		// 		제거 되면 true / 안되면 false
		set.remove("직방");
		
		// Set에 저장된 요소 하나씩 얻어오기
		
		// 1. Iterator (반복자)
		// - 컬랙션에서 제공하는 컬렉션 객체 반복 접근자
		// -> 컬렉션에 저장된 객체를 임의의 순서로 하나씩 꺼내는 역할
		
		Iterator<String> it=set.iterator();
		
		// Set.iterator();
		// Set에 저장된 객체를 이용해서 Iterator 객체를 만들어 반환
		
		while(it.hasNext()) {
			//hasNext() : 다음값이 존재하면 true
			
			String temp=it.next();
			//next() : 다음값을 얻어옴
			
			System.out.println(temp);
		}
		
		System.out.println("-------------------------");
		
		// 2. 향상된 for문
		
		for(String temp:set) {
			System.out.println(temp);
		}
	}
	
	public void ex2() {
		
		/* Set에 저장된 객체가 중복임을 판단하는 방법
		 * 
		 * - 필드에 저장된 값이 모두 일치하면 중복으로 판단
		 * -> 중복 판단에 사용하는 메서드
		 * 		Object.equals() 메서드의 오버라이딩된 메서드
		 * 		-> Students 오버라이딩
		 * 
		 * 
		 * Hash라는 단어가 붙은 컬렉션이 중복을 판단하는 방법
		 * -> Object.hashCode() 오버라이딩
		 * 
		 * Hash 함수 : 입력된 단어를 지정된 길이의 무작위 문자열로 변환하는 함수
		 * 
		 * hashCode() : 객체에 저장된 필드를 이용해서 만들어진 정수를 반환
		 * 
		 * HashSet -> equals, hashCode() 둘 다 오버라이딩 되어 있어야 함
		 * 
		 * -> equals 또는 hashCode() 를 오버라이딩 하면 
		 *		나머지 하나도 반드시 오버라이딩을 진행해라!
		 *
		 */
		
		Set<Student> set=new HashSet<Student>();
		
		set.add(new Student("홍길동", 20, "서울시 중구", 'M', 80));
		set.add(new Student("김길순", 70, "서울시 종로구", 'F', 100));
		set.add(new Student("홍길동", 20, "서울시 중구", 'M', 80));
		
		Student s1=new Student("김길순", 70, "서울시 종로구", 'F', 100);
		Student s2=new Student("김길순", 70, "서울시 종로구", 'F', 80);
		
		System.out.println(s1.equals(s2));
		
		for(Student s:set) {
			System.out.println(s);
		}
	}
	
	public void ex3() {
		// TreeSet : 오름차순으로 정렬되고 중복이 제거되는 Set
		
		// Wrapper Class 
		// * 컬렉션은 객체만 저장 가능(기본 자료형 X)
		// -> 컬렉션에 기본 자료형도 저장할 수 있는 방법 필요
		// --> 기본 자료형을 포장하여 객체로 만듬
		
//		boolean -> Boolean
//		byte	-> Byte
//		short	-> Short
//		int 	-> Integer
//		long 	-> Long
//		short	-> Short
//		double 	-> Double
//		char	-> Char
		
		// Wrapper 클래스는 기본 자료형 값 + 추가 필드, 메서드 제공
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int num=Integer.parseInt("123");
		// 문자열이지만 내용이 모두 숫자인 문자열이 존재
		// -> Wrapper 클래스의 parseXXX() 를 이용하면 숫자로 변경 가능
		
		System.out.println(num+111);
		
		Set<Integer> lotto=new TreeSet<Integer>();
		// Integer -> int의 Wrapper Class
		
		while(lotto.size()<6) {
			int ran= (int)(Math.random()*45+1); // 1~45 난수
			lotto.add(ran);
			
		}
		System.out.println(lotto);
		
		
	}
}
