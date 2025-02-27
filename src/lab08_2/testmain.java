package lab08_2;

public class testmain {

	public static void main(String[] args) {
		Customer cs = new Customer("Isaac Newton","Member");
		System.out.println(cs);
		
		Invoice iv = new Invoice("00001",cs,150.0f);
		iv.getInvoice();
		
	}

}
