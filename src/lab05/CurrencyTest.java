package lab05;

public class CurrencyTest {

	public static void main(String[] args) {
		Currency cr = new Currency();
		cr.Rate = 35.33;
		//cr.convertToTHB(1000);
		System.out.printf("USD Rate: $1 = %.2f\n",cr.Rate);
		System.out.printf("1,000 Bath = $%.2f\n",cr.convertToUSD(1000));
		System.out.printf("$25.5 = %.2f Bath",cr.convertToTHB(25.5));
	}

}
