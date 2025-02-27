package lab02;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter width (cm): ");
		int width = scan.nextInt();
		System.out.print("Enter length (cm): ");
		int lenght = scan.nextInt();
		int result = (width*2)+(lenght*2);
		if(width==lenght) {
			System.out.printf("Perimeter of Square is %d.\n",result);
		}else if(width<lenght) {
			System.out.printf("Perimeter of vertical rectangle is %d.\n",result);
		}else if(width>lenght) {
			System.out.printf("Perimeter of horizontal rectangle is %d.\n",result);
		}
		scan.close();

	}

}
