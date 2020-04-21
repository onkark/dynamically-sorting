import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeSort {
	
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(null,"B",3000,10000000,'c',12.46));
		list.add(new Employee("Z","D",7000,610000000,'z',112.46));
		list.add(new Employee("F","Q",1000,510000000,'b',12.453246));
		list.add(new Employee("Y","VGBB",3000,140000000,'a',12.4600));
		list.add(new Employee("I","BR",4500,150000000,'e',12.4698));
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "salary", 0);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "salary", 1);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "firstName", 0);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "firstName", 1);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "band", 0);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "band", 1);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "deposit", 0);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try{
			Comparator c1 = CustomComparator.getComparator("Employee", "deposit", 1);
			Collections.sort(list, c1);
			for(Employee e : list){
				System.out.println(e.getFirstName() + "," + e.getLastName() + "," + e.getSalary() + "," + e.getNumber() + "," + 
						e.getBand() + "," + e.getDeposit());
			}
			System.out.println();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
