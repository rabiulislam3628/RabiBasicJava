package OOOPSConceptspart1;

public class MethodOverloading {

	public static void main(String[] args) {
			
		MethodOverloading obj =new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
}

//Interview question: can we overloading the main method ? yes ,main method can be overloaded 
	
//you can not create a method inside a method 	
//Method overloading--when the method name is same with  different argurment or input parameter within the same class
//Duplicate methods --- i.e same method name with same number of argumets are not allows 	
//we can overloaded main method also
	
public void sum() {//0 input parameter 
	System.out.println("sum method ---zero parameter ");
	
}
public void sum(int i) { //1 input parametr 
	System.out.println("sum method 1 input ***********parameter");
	System.out.println(i);
	
}
public void sum(int k, int l) { //2 input parametr
	System.out.println("sum method 2 input **********parameter ");
	System.out.println(k+l);
	
}


}
