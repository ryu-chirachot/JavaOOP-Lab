package lab01;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter height (cm): ");
		float h = scan.nextFloat();
		float hmeter = (h/100);
		System.out.print("Enter weight (kg): ");
		int w = scan.nextInt();
		float bmi = w/(hmeter*hmeter);
		System.out.printf("Your BMI is %.2f",bmi);
		scan.close();

	}

}
