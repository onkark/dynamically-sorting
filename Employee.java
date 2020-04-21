
public class Employee {

	private String firstName;
	private String lastName;
	private int salary;
	private long number;
	private char band;
	private double deposit;
	
	public Employee(String firstName, String lastName, int salary, long number, char band, double deposit){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.number = number;
		this.band = band;
		this.deposit = deposit;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public char getBand() {
		return band;
	}

	public void setBand(char band) {
		this.band = band;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
}
