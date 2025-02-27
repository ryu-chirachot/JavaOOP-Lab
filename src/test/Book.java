package test;

public class Book {
	private String name;
	private Author bookauthor;
	private int price;
	
	public Book(String name, Author bookauthor, int price) {
		this.name = name;
		this.bookauthor = bookauthor;
		this.price = price;
	}
	
	

	public Author getBookauthor() {
		return bookauthor;
	}



	@Override
	public String toString() {
		return "Book [name=" + name + ", bookauthor=" + bookauthor + ", price=" + price + "]";
	}



	
	
	

}
