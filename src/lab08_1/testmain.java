package lab08_1;

public class testmain {

	public static void main(String[] args) {
		Book bk1 = new TextBook();
		Book bk2 = new Fiction();
		System.out.println(bk1.getContent());
		System.out.println(bk2.getContent());

	}

}
