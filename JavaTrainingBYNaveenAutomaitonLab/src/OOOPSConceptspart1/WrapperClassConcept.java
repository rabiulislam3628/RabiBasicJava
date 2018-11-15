package OOOPSConceptspart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
  // String x= "100";//"100"  is the string value because  it under the "";
 //  System.out.println(x+20);// 10020 it is not a (100+0) =120 .it is the string concatination 

  //data conversion: String to int: 
   String x="100";
   int i=Integer.parseInt(x);//integer.parseInt(x) : convert string to int
   System.out.println(i+20);//120
   
  //wrapper class: integer, Double,charcter, Boolean
 
  //String to double conversion
    String y="12.33"; 
double d= Double.parseDouble(y);
System.out.println(d+12.33);//22.33

//String to boolean
String k="true";
boolean b= Boolean.parseBoolean(k);
System.out.println(b);

//int to String conversion:
int j=200;
System.out.println(j);
String s= String.valueOf(j);
System.out.println(s+20);//"20020"

//Interview queston : How to convert string to integer :Ans: parseInt()

 //data conversion: String to int: 
//Famous interview quesiton : if you want to convert string to int value but your integer value is not pure int or newmarick ?
//Ans : i will get numberFormatException error 
 String u="100A";//it is should be pure int value othersie you will get numberFormateExecption error
 Integer.parseInt(u);
 
	}

}
