package lab07;

public class Vehicle {
	protected String type;
	protected int price;
	static int count;
	//constructor
	public Vehicle(String type, int price) {
		setType(type);
		setPrice(price);
		setCount();
	}
	//method
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type == "") {
			this.type = "undefined type";
		}else this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) {
			this.price = 50000;
		}else this.price = price;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount() {
		count++;
	}
	public float calDeteriorate(int year){
		float z = getPrice();
		float x = (float) ((10.0/100.0)*z);
		float y = (z-x)/year;
		return y;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + getType() + ", price=" + getPrice() + ", count=" + getCount() + "]";
	}
	

}
