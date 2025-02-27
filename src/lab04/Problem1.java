package lab04;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
	
	public static ArrayList<String> uniquenum(String number1, String number2) {
		String[] num1 = number1.split(" ");
		String[] num2 = number2.split(" ");
		ArrayList<String> x = new ArrayList<String>();
		//String unique;
		
		for(int j=0;j<num1.length;j++) {
			x.add(num1[j]);
		}
		for(int k=0;k<num2.length;k++) {
			x.add(num2[k]);
		}
	
		return x;
		//System.out.printf("Unique numbers: %s",unique);
		}
	public static void numberX(ArrayList<String> z) {
		for(int i=0;i<z.size();i++) {
			 
			System.out.println(z);
			
		}
	}
		
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st list of numbers:");
		String n1 = scan.nextLine();
		System.out.print("Enter 2nd list of numbers:");
		String n2 = scan.nextLine();
		uniquenum(n1,n2);
		numberX(x);
		scan.close();

	}

}
