package lab03;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numday = 1;
		while(true) {
			System.out.print("Enter month number [1-12]: ");
			int user1 = sc.nextInt();
			if(user1 < 1 || user1 >12) {
				System.out.println("Invalid month number. Please enter number between 1 and 12.");
				continue;
			}
			else if(user1 == 4||user1 ==6||user1 ==9 || user1== 11) {
				numday = 30;
				
			}else if(user1 == 2) {
				numday =28;
			} else numday = 31;
			
			int start = 3;
			System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			for(int i=1 ;i<=numday+start;i++) {
				if(i<start+1) {
					System.out.printf("    ");
				}else {
					if(i<13) {//i ตอนนี้คือมันถึง 12 แต่ start มันคือ 3
						System.out.printf("  %d ",i-start);
					} else {
						System.out.printf(" %d ",i-start);
					}if(i%7==0) {
						System.out.println();
					}
				}
				
			}
			sc.close();
			break;
		
		}
		
	}
}