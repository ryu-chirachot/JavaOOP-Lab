package lab07;

public class RentCar extends Vehicle {
	private int id;
	private String name;
	private int rPrice;

	public RentCar(String type, int price, String name, int rPrice) {
		super(type, price);
		setName(name);
		setrPrice(rPrice);
		getId();
		
		
	}

	public int getId() {
		this.id = Vehicle.count;
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == "") {
			this.name = "undefined name";
		}else this.name = name;
	}

	public int getrPrice() {
		return rPrice;
	}

	public void setrPrice(int rPrice) {
		if(rPrice < 0) {
			this.rPrice = 500;
		}else this.rPrice = rPrice;
	}
	public int calCost() {
		return rPrice*7;
	}
	public int calCost(int day) {
		return rPrice*day;
	}
	public float calDeteriorate(int year) {
		float x = (float) ((5.0/100.0)*getPrice());
		float y = (getPrice()-x)/year;
		return y;
	}

	@Override
	public String toString() {
		return "RentCar [id=" + getId() +  ", name=" + getName() + ", type=" + super.type + ", price=" + super.price + ", rPrice=" + getrPrice()
				+ "]";
	}
	
	
}
