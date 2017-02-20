import java.util.*;   //奈斯
public class EmployeeTest
{
	public static void main(String args[]){
		Employee staff[] = new Employee[3];
		staff[0] = new Employee("C",7777,1984,5,6);
		staff[1] = new Employee("A",2222,1984,6,5);
		staff[2] = new Employee("B",2222,1984,7,8);
		for(Employee e : staff)
			e.getRaise(5);
		for(Employee e : staff)
		{
			System.out.println("name = " + e.getName() + "     " +
			                   "salary = " + e.getSalary() + "     " +
			                   "hireday =" + e.getHireday() + "     " );
			System.out.println();
		}
	}
}
class Employee
{
	private String name;
	private double salary;
	private Date hireday;
	public Employee(String name,double salary,int year,int day,int month){
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year,month - 1,day);
		hireday  = calendar.getTime();
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public Date getHireday(){
		return hireday;
	}
	public void getRaise(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise; 
	}
}
