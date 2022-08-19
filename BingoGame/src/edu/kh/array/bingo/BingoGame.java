package edu.kh.array.bingo;

import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.print("빙고판 크기 지정 : ");
		
		int input=sc.nextInt();
		int bingonum=0;
		
		int[][] bingoarr=new int[input][input];
		
		bingoarr=makeBingo(input);// 그럼 이게 얕은복사..?
		
		printBingo(bingoarr);
		
		System.out.println("\n=======빙고게임 시작=======");
		
		while(true){
			System.out.print("정수를 입력하시오 : ");
			
			int num=sc.nextInt();
			
			bingoinput(bingoarr,num);
			
			int temp=bingoCheck(bingoarr,bingonum);
			
			printBingo(bingoarr);
			
			System.out.println("현재 "+temp+"빙고\n");
			
			if(temp==3) {
				System.out.println("****** BINGO!!! ******");
				break;
			}
			
		}
		
	}
	
	public void bingoinput(int[][] arr,int num) {//입력된 정수의 칸을 -1로바꿔줌
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(arr[i][j]==num)
					arr[i][j]=-1;
		}
	}
	
	public int bingoCheck(int[][] arr,int bingonum) {//빙고인지 체크하는함수
	
		//flag를 만들어서 -1인거 체크하고
		// flag가 fasle 이면 하나라도 -1이 아닌게 섞여있는거
		
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;//한줄마다 체크해야댐
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]!=-1)
					flag=false;		
			}
			if(flag) {
				bingonum++;
			}
			
		}// 가로줄 빙고 확인
		
		for(int j=0;j<arr.length;j++){
			boolean flag=true;//한줄마다 체크해야댐
			 for(int i=0;i<arr.length;i++){
				if(arr[i][j]!=-1)
					flag=false;		
			}
			if(flag) {
				bingonum++;
			}//세로줄 빙고 확인
			
		}
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			int j=i;
			
			if(arr[i][j]!=-1)
				flag=false;
		}
		if(flag)
			bingonum++;
		
		
		flag=true;
		for(int i=0;i<arr.length;i++) {
			int j=arr.length-1-i;
			
			if(arr[i][j]!=-1)
				flag=false;
		}
		if(flag)
			bingonum++;
			
		//대각선 빙고는 어떻게 처리하는가
		
		
		return bingonum;
	}
	
	
	public void printBingo(int[][] arr) { // 빙고판 출력 함수
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==-1)
					System.out.printf("%4c",'★');
				else
					System.out.printf("%4d",arr[i][j]);
			}
				
			System.out.println();
		}
	}
	
	public int[][] makeBingo(int input) { // 중복되지 않은 난수를 생성해서 1차원배열에 우선 넣은 후에 2차원배열에 대입함
		int[][] bingoarr=new int[input][input];
		int[] tmparr=new int[input*input];
		int temp;
		
		for(int i=0;i<tmparr.length;i++) {
			temp=(int)(Math.random()*tmparr.length+1);
			tmparr[i]=temp;
			for(int j=0;j<i;j++) {
				if(tmparr[j]==temp) {
					i--;
					break;
				}
			}
		}
		
		int num=0;
		
		for(int i=0;i<bingoarr.length;i++) {
			for(int j=0;j<bingoarr.length;j++) {
				bingoarr[i][j]=tmparr[num++];
			}
		}
		
		return bingoarr;
	}
}
