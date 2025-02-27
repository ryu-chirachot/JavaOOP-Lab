package test;

public class Main {

	public static void main(String[] args) {
		Author x = new Author("chirachot","ch.l@gmail.com");
		System.out.println(x);
		
		Book b1 = new Book("Java 01",x,120);
		System.out.println(b1);
		b1.getBookauthor().getWord();
	}

}
