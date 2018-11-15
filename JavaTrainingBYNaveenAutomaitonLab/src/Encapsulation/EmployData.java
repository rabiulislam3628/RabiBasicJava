package Encapsulation;

public class EmployData {
//how to implement Encapsulation?
//First make the instance vairabe as a private so that they can not it access direcely form outside of the class  	
	
	
//step 1. private data  variable : so that these variable can not accessed direcely form outside the class
	
	private int ssn;
	private String empName;
	private int empAge;
	
// step 2.getter and setter methods : create getter and setter methods , just right click on the screen --source--getter and setter --then select variable and access modifier --public	
//to set the value  and get the vlues of the fileds
	public static void main(String[] args) {
//step 3. create object because it is non static methods 
//step 4 : call the object and pass the argument 
//step 5; finally run the test get the vlue 
		
 		EmployData obj =new EmployData();
		
		obj.setEmpName("Rizven Islam");
		obj.setEmpAge(1);
		obj.setSsn(123456);
		
	System.out.println("Employee name is: "+ obj.getEmpName());	
	System.out.println("Employee age is: "+ obj.getEmpAge());
	System.out.println("Employee SSN is:"+obj.getSsn());
		
		
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	//Summary of Encapsulation : I have to declare private variable 
	//and getter and setter should be public so that outside of the class we will call the public get methods and call the public set methods to set the value and again call to get the value
	//Advantage: Data Hiding – Encapsulation in Java, provides the programmer to hide the inner classes and the user to give access only to the desired codes. It allows the programmer to not allow the user to know how variables and data store.
	//Flexibility – With Java encapsulation, we can make the data as read-only or write-only as we require it to be.
	//Reusability – It allows the user to a programmer to use the program again and again.
	//Testing of the code – Ease of testing becomes eas
}
