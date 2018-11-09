package OOpsConceptspart2;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void tranferManey();
	
//interview question what is interface ? ans below
	
//only method declaration 
//no method body -only method prototype 
//in interface, we can declare the variablrd , and variables are by default static nature 
// variable value will not be changed --its final /constant in nature
//no static method in interface 
//no main method in interface 
//we can not create the object of interface 
//interface is abstract in nature	

}
