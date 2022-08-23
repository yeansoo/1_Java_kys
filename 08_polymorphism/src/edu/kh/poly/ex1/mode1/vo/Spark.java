package edu.kh.poly.ex1.mode1.vo;

public class Spark extends Car {
	private double discountOffer;
	
	public Spark() {}

	public Spark(int wheel, int seat, String fuel, double discount) {
		super(wheel, seat, fuel);
		this.discountOffer = discountOffer;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "/ 할인혜택 : "+discountOffer;
	}
}
