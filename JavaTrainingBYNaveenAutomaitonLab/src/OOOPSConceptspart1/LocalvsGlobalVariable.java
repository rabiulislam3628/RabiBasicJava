package OOOPSConceptspart1;

public class LocalvsGlobalVariable {
	
//Global variable/class variable 
//Global variable i can used through out the program but it is name and age then crate an object	
	
	String name="Rabiul"; //global variable
	int age =35;
	
	public static void main(String[] args) {
		int i =10; //local variable for main method 
		System.out.println(i);
		
LocalvsGlobalVariable obj =new LocalvsGlobalVariable();
System.out.println(obj.name);
System.out.println(obj.age);

	}
	
	public void sum() {
		int i=10;//i and j variable for sum method
		int j=20;
	
		
	}

}
