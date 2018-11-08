package OOOPSConceptspart1;

public class StaticAndNonStaticConcept {
//global variable: the scope of globle var will be available across all functions with some conditions  
	
	String name="Rabiul";  //non static global variable
	static int age =30;  //static global variable

		public static void main(String[] args) {
			
//how to call static method  and  ?? interview question
// 2 way we can call static method : 1. directing clling with method name 
			sum();
	//2.another one is calling by class name
			StaticAndNonStaticConcept.sum();
			
//how to call static variable ?
//ans : direct used this    System.out.println(age); or 
//call staic variable by call name			
	System.out.println(age);
	System.out.println(StaticAndNonStaticConcept.age);

//how to call non static method or variable ?
//
	StaticAndNonStaticConcept obj =new StaticAndNonStaticConcept();
	
	System.out.println(obj.name);//another way call staic method 
	obj.sendMail();  //one way call staic method 

//interview quesiton ? Can i access static methods by using object referece? yes but warning will be given  
//	
	obj.sum(); //warning will be given 
	
		


	}

	public void sendMail() {//not static method
		System.out.println("send mail method ");
	}
	public static void sum() {//static method 
		System.out.println("sum method ");
		
	}
	
}
