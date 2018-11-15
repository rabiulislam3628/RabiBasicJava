package OOOPSConceptspart1;

public class Car {
	//class /Global variable 
	int mod;//model
	int wheel;

	public static void main(String[] args) {
		
//new Car();--is the object of Car class, and who is represent the car class? a is represt the car class
//a here reference variable 
//new keyword/operator used to create the object	
//a,b,c ---object reference variable 		
		
   Car a =new Car(); //new car(); object here
   Car b =new Car();
   Car c =new Car();
   
   a.mod=2015;
   a.wheel=4;
   
   b.mod=2014;
   b.wheel=4;
   
   c.mod=2013;
   c.wheel=4;
   
   System.out.println("before assinging the references");
  System.out.println(a.mod);
  System.out.println(c.wheel);
	
  System.out.println("after shift teh reference");
  
  a=b;
  b=c;
  c=a;
  a.mod =10;
  System.out.println(a.mod);
  c.mod=20;
  System.out.println(a.mod);
  System.out.println(c.mod);
  
		
	}

}
