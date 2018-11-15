package abstraction_Interface;
//Creating relatinonship between parent interface and child class by implements key words 

//If a class is implementing any interfance ,then its mandatary to define/overriding all the methods of interface

public class HSBCBank implements USBank, BrazilBank{ // we are achieving muliple inheritance //2 parent class and 1 child class 
	

	
public void credit() {
	System.out.println("HSBC*****credit ");
}
	
	public void debit() {
		System.out.println("HSBc *************debit ");
	}
	
	public void tranferMany() {
		System.out.println("HSBS *******tranfermany");
	}

	public void educationLoan() {
		System.out.println("HSBC *********his won ****************method ");
		

	}
public void carLoan() {
	System.out.println("HSBC*****************his won ****************method ");
}

	//braizal bank 
public void mutualFund() {
	System.out.println("Braizl bank******************************");
}


	
}
