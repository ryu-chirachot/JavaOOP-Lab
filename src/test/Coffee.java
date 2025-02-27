package test;

public class Coffee implements Sugar, Water {
	public int spoon;
	public Coffee() {
		
	}
	
	
	public Coffee(int spoon) {
		super();
		this.spoon = spoon;
	}
	public int getSpoon() {
		return spoon;
	}
	public void setSpoon(int spoon) {
		this.spoon = spoon;
	}
	
	public void putCoffee() {
		System.out.println("Put coffee 1 spoon.");
	}
	
	public void putCoffee(int spoon) {
		System.out.println("Put coffee "+spoon+" spoon.");
	}
	@Override
	public void putWater() {
		System.out.println("Put water 10 ml.");

	}

	@Override
	public void putWater(int it) {
		System.out.println("Put water "+it+" ml.");

	}

	@Override
	public void putSugar() {
		System.out.println("Put sugar 1 spoon");

	}

	@Override
	public void putSugar(int spoon) {
		System.out.println("Put sugar "+spoon+" spoon.");

	}

}
