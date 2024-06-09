package main;

class Person {

   private String name;
   private int age;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
   
   
}



class Employee extends Person {
	private String id;
	private int salary;
	
	Employee(String id,int salary,String name,int age){
		super(name,age);
		this.id=id;
		this.salary=salary;
		
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}





	public static void main(String[] args) {
		
		Employee myEmployee = new Employee("i123",20000,"uday",25);
		System.out.println(myEmployee);
	}
	
	
   }
