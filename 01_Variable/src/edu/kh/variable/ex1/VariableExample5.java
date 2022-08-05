package edu.kh.variable.ex1;

public class VariableExample5 {
		
	public static void main(String[] argc) {
		
			//ctrl + alt + 방향키 위 /아래
		
			/* 출력 메서드
			 * 
			 *  System.out.print("내용");
			 *  -> () 안의 내용을 출력 ( 줄바꿈 X )
			 *  
			 *  System.out.println("내용");
			 *  -> () 안의 내용을 출력 ( 줄바꿈 O )
			 *  
			 *  System.out.printf("내용+패턴", 패턴에 들어갈 값);
			 *  
			 *  
			 */
		
		System.out.print("aaaaaaaa");
		System.out.print("bbbbbbb");
		System.out.println("lllllll");
		System.out.println("dddddddddd");
		
		String name="김연수";
		
		int age=25;
		
		char gender='여';
		
		double height=169.8;
		
		boolean tf=true;
		
		System.out.println(name +"님은 "+age+"세 "+gender+"성이고 "+height+"cm입니다 (" + tf + ")" );
		
		
		System.out.printf("%s님은 %d세 %c성이고 %.1fcm입니다 (%b)\n",name,age,gender,height,tf);
		// \n : 줄바꿈(개행)을 나타내는 탈출(escape) 문자
		
		System.out.println("줄 바낌?");
		
		
		
		System.out.println("내가 추가한 내용");
		
		
		
		}
}
