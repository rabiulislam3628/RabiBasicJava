package OOOPSConceptspart1;
//if i call no static method , must i have to create an object and  inside the objcet all method are inclued

public class FunctionaInJava {

	public static void main(String[] args) {
		
		FunctionaInJava obj =new FunctionaInJava();
		
//one object will be created,obj is the reference variable, reference to this object	
//afer creating the object, the copy of all non static methods will be given to this object		
	obj.test();
	int l = obj.pqr();
	System.out.println(l);
	
	String s1 =obj.qa();
	System.out.println(s1);
	
	int div = obj.divsion(30,10);
	System.out.println(div);
	
	
	}
//Function and method are same thing
		
//non static methods
	
	
//return type =void	,void means does not return any values
public void test(){ //no input ,no output   //here is test method name 		
System.out.println("test method");
}
//return type is = int ,because pqr method return c and c is int data type so it will be follow the data type
public int pqr() { //no input ,some output
System.out.println("pqr method");	
int a=10;
int b=20;
int c=a+b;
return c;
}
//return type is string 
public String qa() {//no input , some output
	System.out.println("qa method");
	String s ="selenium";
	
	return s;


	}
//x,y ---is a input parameter/arguments
//return type is int
public int divsion(int x, int y) {
	System.out.println("division method ");
	int d=x/y;
	return d;
}

}
