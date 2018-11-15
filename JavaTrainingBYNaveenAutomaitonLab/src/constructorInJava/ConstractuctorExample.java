package constructorInJava;
// Role of the constructor is object creation 
//Constructor mainly used for create object without constructor we can not crete object of class and when we did not create any constractor java compiler
//take it as a defult constractor in the class

public class ConstractuctorExample {
//below is the default constructor because  no argument 
	public ConstractuctorExample() { //create a constractor same as class name 
		System.out.println("ConstractuctorExample()");
	}
	
	public ConstractuctorExample(int a ) { // this one is parameterized constrouctor 
		System.out.println("ConstractuctorExample(int a )");
		
	}
	public static void main(String[] args) {
		
		ConstractuctorExample obj =new ConstractuctorExample(); //create object of constructor 
		ConstractuctorExample obj1=new ConstractuctorExample(5 );
	}
}
/*Constructor is a special type of method that is used to initialize the object.
////	Properties of constructor ----Constructor has the same name as that of the class name
//	It has no return type not even void 
//	It is called automatically 
//	2 types of constructor 1)Default constructor (no parameter) 2)parameterized  constructor */

