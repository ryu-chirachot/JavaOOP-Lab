package lab06;

public class Magazine extends Book {
	//Attribute
	private int issueNumber;
	private int price;
	
	
	public Magazine() {
		super();
		this.issueNumber = 1;
		this.price = 30;
	}
	
	public Magazine(String title, String publisher, int issueNumber, int price) {
		super(title,publisher);
		setIssueNumber(issueNumber);
		setPrice(price);
	}

	//method
	public int getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(int issueNumber) {
		if(issueNumber <= 0) {
			this.issueNumber = 1;
		}else this.issueNumber = issueNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <= 0) {
			this.price = 30;
		}else this.price = price;
	}
	
	public int getYearlySubscriptionPrice() {
		return price*12 ;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + super.title + ", publisher=" + super.publisher + ", issueNumber=" + getIssueNumber() + ", price="
				+ getPrice() + "]";
	}
	

}
