package edu.kh.poly.ex1.mode1.vo;

public class Truck extends Car {
	private double weight;

	public Truck() {
		// super(); // super 생성자 미작성시 컴파일러가 추가
	}

	public Truck(int wheel, int seat, String fuel, double weight) {
		super(wheel,seat,fuel);
		
		this.weight=weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/ 적재중량 : "+weight;
	}
	
	public void laoding() {
		System.out.println("물건을 실을 수 있다.");
	}
}
