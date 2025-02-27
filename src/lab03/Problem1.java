package lab03;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = scan.nextLine();
		int countstr = 1;
		for(int i=0;i<text.length();i++) {
			char x = text.charAt(i);
			if(x ==' ' || x =='.' || x=='\n') {
				char y = text.charAt(i-1);
				if(y == ' ' || y=='.'|| y=='\n') {
					Character.isWhitespace(y);
					countstr++;
				}
			}
		}
		System.out.printf("Number of words: %d",countstr);
		scan.close();	

	}

}
