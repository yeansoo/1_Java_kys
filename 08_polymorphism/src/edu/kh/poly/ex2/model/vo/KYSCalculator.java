package edu.kh.poly.ex2.model.vo;

public class KYSCalculator implements Calculator{

	@Override
	public int plus(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public double divide(int num1, int num2) {
		return num1/(double)num2;
	}

	@Override
	public double areaOfCircle(double r) {
		return r*r*Calculator.PI;
	}

	@Override
	public double pow(double a, int b) {
		int sum=1;
		for(int i=0;i<b;i++)
			sum*=a;
		return sum;
	}
	
}
