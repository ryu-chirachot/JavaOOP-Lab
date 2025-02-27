package lab02;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Salary: ");
		int salary = scan.nextInt();
		int result = salary*12;
		int mao = 100000;
		int total = result - mao; 
		
		if(total <= 150000) {
				System.out.println("Your tax is exemption.");
		}else if(total > 150000 && total <= 300000) {
			float tvat =  (float)(total*0.05);
			System.out.print("Tax rate is 5%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}else if(total > 300000 && total <= 500000) {
			float tvat =  (float)(total*0.10);
			System.out.print("Tax rate is 10%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}else if(total > 500000 && total <= 750000) {
			float tvat =  (float)(total*0.15);
			System.out.print("Tax rate is 15%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}else if(total > 750000 && total <= 1000000) {
			float tvat =  (float)(total*0.20);
			System.out.print("Tax rate is 20%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}else if(total > 1000000 && total <= 2000000) {
			float tvat =  (float)(total*0.25);
			System.out.print("Tax rate is 25%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}else if(total > 2000000 && total <= 5000000) {
			float tvat =  (float)(total*0.30);
			System.out.print("Tax rate is 30%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}else if(total >= 5000000) {
			float tvat =  (float)(total*0.35);
			System.out.print("Tax rate is 35%.\n");
			System.out.printf("Your tax is %,d bath.\n",(int)(tvat));
		}
		scan.close();
	}

}
