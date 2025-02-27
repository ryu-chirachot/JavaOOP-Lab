package lab05;

public class Employee {
	
	private String name;
	private int Salary;
	
	public Employee() {
		this.name = "";
		this.Salary = 15000;
	}
	
	public Employee(String name, int salary) {
		
		setName(name);
		setSalary(salary);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public int getYearSalary() {
		return Salary*12;
	}
	
	public void predict(double percent) {
		if(percent >=1 && percent <=100) 
		{
			double x = ((percent/100.0)*Salary)+Salary;
			System.out.printf("If salary is raised %.0f%%, the salary will be %,.2f bath/month.",percent,x);
		}
		else System.out.printf("%.0f is invalid percent.",percent);
		
	}
	

}
