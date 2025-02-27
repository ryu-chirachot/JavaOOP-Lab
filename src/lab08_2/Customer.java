package lab08_2;

public class Customer {
	private String fullname;
	private String type;
	
	public Customer(String fullname, String type) {
		this.fullname = fullname;
		this.type = type;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [fullname=" + fullname + ", type=" + type + "]";
	}
	
	

}
