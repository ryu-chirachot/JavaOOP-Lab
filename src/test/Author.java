package test;

public class Author {
	private String name;
	private String email;
	
	public Author(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public void getWord() {
		System.out.println("Hello "+name);
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
