public class StaticTest
{
	public static void main(String args[]){
		Employee staff[] = new Employee[3];
		staff[0] = new Employee("tom",10000);
		staff[1] = new Employee("bod",51121);
		staff[2] = new Employee("dick",78454);
		for(Employee e : staff){
			e.setId();
			System.out.println("name = " + e.getName() + 
				                ",id = " + e.getNextId() + 
				                ",salary =" + e.getSalary());
		}
		int n = Employee.getNextId();
		System.out.println("Next available id =" + n);
	}
}
class Employee
{
	private static int nextId = 0;
	private String name;
	private double salary;
	private int id;
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		id = 0;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public void setId(){
		id = nextId;
		nextId++;
	}
	public static int getNextId(){
		return nextId;
	}
	public static void main(String args[]){
		Employee e = new Employee("harry",50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
