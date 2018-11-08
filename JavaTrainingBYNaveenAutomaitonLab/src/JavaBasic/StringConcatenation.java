package JavaBasic;

import java.util.concurrent.SynchronousQueue;

public class StringConcatenation {

	public static void main(String[] args) {
//+ : is concatenation operator 
// println - is used to print on the console with a new line
// print -  is just used to print on the console 
int a= 100;
int b= 200;
String x="Hello";
String y= "word";
System.out.println(a+b);
System.out.println(x+y);
System.out.println(a+b+x+y);
System.out.println(x+y+a+b);
System.out.println(x+y+(a+b));
		
	double c =12.33;
	double d= 10.33;
	System.out.println(c+d);
	System.out.println(x+y+c+d);
	
	System.out.println("the value a is "+ a);
	System.out.println("the additon of a and b is " +(a+b));
	//what is the System.out.print: it is print the out put 
	
	System.out.print("Hello selenium");  //ln : ln print the next line  ex:
	System.out.println("Hello Rizvan");
	
	}

}
