package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1(){
		int[] arr=new int[9];
		int evensum=0;
		
		for(int i=0;i<9;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			if(i%2==0)
				evensum+=arr[i];
		}
		System.out.println("\n짝수 번째 인덱스 합 : "+evensum);
	}
	
	public void practice2(){
		int[] arr=new int[9];
		int oddsum=0;
		
		for(int i=8;i>=0;i--) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			if(i%2!=0)
				oddsum+=arr[i];
		}
		System.out.println("\n짝수 번째 인덱스 합 : "+oddsum);
	}
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input=sc.nextInt();
		
		int[] arr=new int[input];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("입력 "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int find=sc.nextInt();
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++) {
			if(find==arr[i]) {
				System.out.println("인덱스 : "+i);
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input=sc.next();
		
		System.out.print("문자 : ");
		char find=sc.next().charAt(0);
		int sum=0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",input,find);
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==find) {
				System.out.print(i+" ");
				sum++;
			}
		}
		System.out.printf("\n%c 개수 : %d",find,sum);
	}
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input=sc.nextInt();
		int arr[]=new int[input];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println("\n총 합 : "+sum);
	}
	
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		
		char[] rrnum=new char[14];
		System.out.print("주민등록번호(-포함) : ");
		String rrnuminput=sc.next();
		
		for(int i=0;i<rrnum.length;i++) {
			if(i<=8)
				rrnum[i]=rrnuminput.charAt(i);
			else 
				rrnum[i]='*';
		}
		
		for(int i=0;i<rrnum.length;i++) {
			System.out.print(rrnum[i]);
		}
		
	}
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int input=sc.nextInt();
			if(input<3||input%2==0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			else {
				for(int i=0;i<input;i++) {
					if(i>input/2)
						System.out.print(input-i+" ");
					else
						System.out.print(i+1+" ");
				}
				break;
			}
				
		}
	
	}
	
	public void practice9(){
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		System.out.print("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice10(){
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		
		int max=arr[0],min=arr[0];
		
		System.out.print("발생한 난수 : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}
	
	public void practice11(){
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}	
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12(){
		int arr[]=new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}	
			}
		}
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice13(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		
		String input=sc.next();
		char[] arr=new char[input.length()];
		
		// 중복하면 안넣는다!
		int num = 0;
		int tmp=0;
		for(int i=0;i<arr.length;i++) {
			num=i;
			if(tmp==input.length())
				break;
			arr[i]=input.charAt(tmp++);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]){
					i--;
				}	
			}
			
		}//배열에 문자하나씩 넣음

		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]!=0) {
				System.out.print(arr[i]+", ");
				
			}
			else
				System.out.print(arr[i]+ "");
		}
		System.out.println("\n문자 개수 : "+num);
			
	}
	
	public void practice14(){		Scanner sc = new Scanner(System.in);
		
		int add=0;
		int num=1;
		
			System.out.print("배열의 크기를 입력하세요 : ");
			
			int input=sc.nextInt();// 여기서 원본 배열의 크기가 결정됨
			
			int i=0;
			
			//String bigArr[]=new String[input+add];
			
			
			String temp[]=new String[input+add];
			String arr[]=new String[input+add];
			
			for(;i<arr.length;i++) {// 원본
				System.out.print(num++ + "번째 문자열 : ");
				arr[i]=sc.next();
			}
			
			while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char yn=sc.next().charAt(0);
			
			if(yn=='y') {// 더 값을 입력한다면
				System.out.print("더 입력하고 싶은 개수 : ");
				add=sc.nextInt();
					String bigArr[]=new String[input+add];
				//깊은 복사로 하나 만들고
				
				
				
				
				
				System.arraycopy(arr, 0, bigArr, 0, arr.length);//원본을 여기 넣어줬지?
				// 위에서 또 넣고 추가해야겠지?
				
				for(;i<bigArr.length;i++) {// 복사본에 추가
					System.out.print(num++ + "번째 문자열 : ");
					bigArr[i]=sc.next();
					
				}

				continue;
			}
			else {
				//System.out.println(Arrays.toString(bigArr));
				break;
			}
				
		}
	}
	
	public void practice15(){
		String[][] arr=new String[3][3];
		
		for(int row=0;row<arr.length;row++)
			for(int col=0;col<arr[0].length;col++)
				arr[row][col]="("+row+", "+col+")";
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++)
				System.out.print(arr[row][col]);
				System.out.println();
		}
			
	}
	
	public void practice16(){
		int[][] arr=new int[4][4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=i*arr[0].length+j+1;
			}
		}

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice17(){
		int[][] arr=new int[4][4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=(4-i)*arr[0].length-j;
			}
		}

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice18(){
		int arr[][]=new int[4][4];
		
		for(int row=0;row<arr.length-1;row++) {
			for(int col=0;col<arr[0].length-1;col++) {
				int ran=(int)(Math.random()*10+1);
				arr[row][col]=ran;
				
				arr[row][arr[row].length-1]+=ran;
				
				// 각 열의 마지막 행
				arr[arr.length-1][col]+=ran;
				
				// 마지막 행, 마지막 열
				arr[arr.length-1][arr[row].length-1] +=ran;
			}
		}
		
		
		// 출력용
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
		
	}
	
	public void practice19(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row=sc.nextInt();
		
		System.out.print("열 크기 : ");
		int col=sc.nextInt();
		
		char[][] arr=new char[row][col];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				int temp=(int)(Math.random()*26+65);
				arr[i][j]=(char)temp;
			}	
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice20(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row=sc.nextInt();
		
		char arr[][]=new char[row][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"열의 크기 : ");
			int col=sc.nextInt();
			arr[i]=new char[col];
		}
		
		char temp='a';
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=temp++;
			}	
		}
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%c ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice21(){
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1=new String[3][2];
		String[][] arr2=new String[3][2];
		
		String temp;
		int tmp=0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				temp=students[tmp++];
				arr1[i][j]=temp;
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				temp=students[tmp++];
				arr2[i][j]=temp;
			}
		}
		
		System.out.println("== 1분단 ==");
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=0;j<arr1[i].length;j++) {
				System.out.printf("%s ",arr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0;i<arr2.length;i++) {
			
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("%s ",arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice22(){
		Scanner sc = new Scanner(System.in);
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][][] arr=new String[2][3][2];
		
		String temp;
		int tmp=0;
		for(int k=0;k<arr.length;k++) {
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr[0][0].length;j++) {
					temp=students[tmp++];
					arr[k][i][j]=temp;
				}
			}
		}
		
		
		
		for(int k=0;k<arr.length;k++) {
			System.out.println("== "+(k+1)+"분단 ==");
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr[0][0].length;j++) {
					System.out.printf("%s ",arr[k][i][j]);
				}
				System.out.println();
			}
		}
		System.out.println("================");
		System.out.print("검색할 학생을 입력하세요 : ");
		String search=sc.next();
		
		for(int k=0;k<arr.length;k++) {
			for(int i=0;i<arr[0].length;i++) {
				for(int j=0;j<arr[0][0].length;j++) {
					if(arr[k][i][j].equals(search)) {
						System.out.printf("검색하신 %s 학생은 %d분단 %d줄 %s에 있습니다.",
								search,k+1,i+1,j==0?"왼쪽":"오른쪽");
					}
				}
			}
		}
	}
	
	public void practice23(){
		Scanner sc = new Scanner(System.in);
		
		String[][] arr=new String[6][6];
		
		System.out.print("행 인덱스 입력 : ");
		int row=sc.nextInt()+1;
		System.out.print("열 인덱스 입력 : ");
		int col=sc.nextInt()+1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i==row&&j==col) {
					System.out.printf("%3c",'X');
				}
			else if(i==0&&j==0) {
					System.out.print("  ");
				}
				else if(i==0) {
					System.out.printf("%3d",j-1);
					
	
					}
				else if(j==0) {
					System.out.printf("%3d",i-1);
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	
	public void practice24(){
		Scanner sc = new Scanner(System.in);
		
		String[][] arr=new String[6][6];
		boolean[][] arr1=new boolean[6][6];
		while(true) {
			int num=0;
			System.out.print("행 인덱스 입력 : ");
			int row=sc.nextInt();
			if(row==99) {
				System.out.println("프로그램 종료");
				break;
			}
			row++;
			System.out.print("열 인덱스 입력 : ");
			int col=sc.nextInt()+1;
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(i==row&&j==col||arr1[i][j]) {
						arr[i][j]="X";
						arr1[i][j]=true;
					}
					else if(i==0&&j==0) {
						arr[i][j]=" ";
					}
					else if(i==0) {
						arr[i][j]=Integer.toString(j-1);
						}
					else if(j==0) {
						arr[i][j]=Integer.toString(i-1);
					}
					else
						arr[i][j]=" ";
				}
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			num++;
		}
	}
	
	
	
}
