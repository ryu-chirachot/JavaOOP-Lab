package lab08_2;

public class Invoice {
	private String id;
	private Customer customer;
	private double totalPrice;
	
	public Invoice(String id, Customer customer, double totalPrice) {
		this.id = id;
		this.customer = customer;
		this.totalPrice = totalPrice;
		
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public double getTotalPrice() {
		return totalPrice;
	}

	public void getInvoice() {
		System.out.println("=== INVOICE ===");
		System.out.printf("ID: %s\n",getId());
		System.out.printf("Customer name: %s\n",getCustomer().getFullname());
		System.out.printf("Customer Type: %s\n",getCustomer().getType());
		System.out.printf("Total Price: $%.1f\n",getTotalPrice());
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + customer + ", totalPrice=" + totalPrice + "]";
	}
	
	

}
