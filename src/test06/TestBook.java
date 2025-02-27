package test06;

//import lab06.Book;
import lab06.Magazine;

public class TestBook {

	public static void main(String[] args) {
		
		Magazine m = new Magazine("RO News", "COMP", -1, -1);
		System.out.println(m);
		System.out.printf("Yearly Subscription: %,d\n", m.getYearlySubscriptionPrice());
		System.out.println();

		Magazine n = new Magazine();
		System.out.println(n);

	}

}
