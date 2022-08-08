package edu.kh.op.ex;

public class OperatorExample4 {
		public static void main(String[] args) {
			
			
			// 논리 연산자 : &&(AND), ||(OR)
			
			// &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
			// ~와, 그리고(~이고), ~이면서(~면서), ~부터 ~까지, ~사이
			
			int a=101;
			
			// a는 100이상 이면서 짝수인가?
			
			boolean result1=(a>=100); // true
			
			boolean result2=(a%2==0); // false
			
			System.out.println("a는 100 이상 이면서 짝수인가? "+(result1&&result2));
			System.out.println((a>=100)&&(a%2==0));// false
			
			int b=5;
			
			// b는 1부터 10 사이의 정수인가?
			
			boolean result3=(b>=1); // true
			
			boolean result4=(b<=10); // false
			System.out.println("b는 1부터 10 사이의 정수인가? "+ (result3&&result4));
			
			System.out.println("b는 1부터 10 사이의 정수인가? "+ ((b>=1)&&(b<=10)));
			
			// ||(OR) 연산자 : 둘 다 false이면 false, 나머진 true (AND의 반대)
			// 또는, ~거나, ~이거나
			
			int c=10;
			
			// c는 홀수 이거나 10을 초과한 수인가?
			
			System.out.print("c는 홀수 이거나 10을 초과한 수인가? : ");
			System.out.println((c%10!=0)||(c>10));
			
			int d=20;
			
			// d는 1 부터 100 사이 숫자 또는 음수인가?
			
			boolean result5=(d>=1)&&(d<=100)||d<0;// true
			
			System.out.println("d는 1 부터 100 사이 숫자 또는 음수인가? : "+result5);
			
			
			// 논리 부정 연산자 : ! (NOT)
			// 논리값을 반대로 바꾸는 연산자
			
			System.out.println("!result5 : "+!result5);
			
			
			
			int e=3;
			
			boolean result6 = e>=1 && e<5 ; // e는 1이상이고, 5미만인가? true
			
			// e는 미만 또는 5이상인가?
			boolean result7 = e<1 || e>=5 ;
			//result6 과 7의 서로 반대
			
			
			System.out.println( !result6 == result7);
		}


}

