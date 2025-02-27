package lab01;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of square (cm): ");
		float num = scan.nextFloat();
		float value = num*num;
		System.out.printf("Square's Area is %.2f",value);
		scan.close();
		

	}

}
