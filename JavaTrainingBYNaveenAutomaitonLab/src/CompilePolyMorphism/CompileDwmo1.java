package CompilePolyMorphism;
//compile time polymorphism  : example- method overloading

public class CompileDwmo1 {
//Method overloading : method can be overloading if method name is same but with different signature/ input parameter /arguramet

//method name is same but signature is different : like- 
	
//1. number of argument : 2 or 3 passing argument 
//2. type of argument : data type -int or double 
//3. order of argument : same method and same data type but order of argument is different --ex-change the site like-(int a, double  b) and (double c, int d) 	
	public static void main(String[] args) {
		
		CompileDwmo1 co=new CompileDwmo1();
		co.add(10, 15);
		co.add(30, 10, 10);
		

	}

	public void add(int a, int b) {
		int c=a+b;
		System.out.println("sum of the number is: "+ c);
	}
	
	//compile time polymorphism :  whic mathod should be call it will machig with argument .
	
	public void add(int a, int b, int d ) {
		int c=a+b+d;
		System.out.println("sum of the number is: "+ c);
	}
	
}
