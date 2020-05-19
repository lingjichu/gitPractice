package cn.edu.test;
 
public abstract class Car implements automobile {
	
	private int color;//颜色
	private int tyreNum;//轮胎数量
	private double price;//价格
	
	public void stepAccelerator() {
		System.out.println("踩油门踏板。。。。");
	}

	public void selectGear() {
		System.out.println("挂挡。。。。");
	}

	public Car(int color, int tyreNum, double price) {
		super();
		this.color = color;
		this.tyreNum = tyreNum;
		this.price = price;
	}

	public Car() {
		super();
	}

	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the tyreNum
	 */
	public int getTyreNum() {
		return tyreNum;
	}

	/**
	 * @param tyreNum the tyreNum to set
	 */
	public void setTyreNum(int tyreNum) {
		this.tyreNum = tyreNum;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [color=" + color + ", tyreNum=" + tyreNum + ", price=" + price + "]";
	}
	

}
