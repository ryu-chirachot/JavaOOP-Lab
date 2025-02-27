package lab05;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee em = new Employee("Soju",20000);
		System.out.printf("%s's salary is %,d bath/month (%d bath/year).\n",em.getName(),em.getSalary(),em.getYearSalary());
		em.predict(5);
	}

}
