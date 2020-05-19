package cn.edu.test;

public class BeanzCar extends Car implements automobile {

	@Override
	public void lauch() {
		System.out.println("打火");
	}

	@Override
	public void turnSteeringWheel() {
		System.out.println("转动方向盘");
		
	}

	@Override
	public void run() {
		System.out.println("行驶");
	}

	@Override
	public void fullFilling() {
		System.out.println("加油");
		
	}
	//自动停车
	public void autoHold() {
		System.out.println("自动停车。。。");
	}
	
	public void autoPilot() {
		System.out.println("导航。。。。");
	}

	public BeanzCar() {
		super();
	}

	public BeanzCar(int color, int tyreNum, double price) {
		super(color, tyreNum, price);
	}

	@Override
	public String toString() {
		return "BeanzCar [getColor()=" + getColor() + ", getTyreNum()=" + getTyreNum() + ", getPrice()=" + getPrice()
				+ "]";
	}
	
 
}
