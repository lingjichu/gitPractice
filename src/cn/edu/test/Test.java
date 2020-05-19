package cn.edu.test;

public class Test {
	public static void main(String[] args) {
		// 无参的构造方法进行实例化
		BeanzCar beanzCar1 = new BeanzCar();
		beanzCar1.setColor(1);
		beanzCar1.setPrice(200.00);
		beanzCar1.setTyreNum(2);
		System.out.println(beanzCar1);
		
		// 有参的构造方法进行实例化
		int color = 0;
		int tyreNum = 2;
		double price = 100.00;
		BeanzCar beanzCar2=new BeanzCar(color, tyreNum, price);
		System.out.println(beanzCar2);
		System.out.println("=========================================");
		beanzCar1.fullFilling();
		beanzCar1.lauch();
		beanzCar1.selectGear();
		beanzCar1.stepAccelerator();
		beanzCar1.turnSteeringWheel();
		beanzCar1.run();
		beanzCar1.autoPilot();
		beanzCar1.autoHold();
		System.out.println("=========================================");
		beanzCar2.fullFilling();
		beanzCar2.lauch();
		beanzCar2.selectGear();
		beanzCar2.stepAccelerator();
		beanzCar2.turnSteeringWheel();
		beanzCar2.run();
		beanzCar2.autoPilot();
		beanzCar2.autoHold();
		
	}
}
