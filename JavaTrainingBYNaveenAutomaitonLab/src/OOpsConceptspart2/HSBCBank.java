package OOpsConceptspart2;
public class HSBCBank implements USBank,BarizlBank {  //we are achiving multipul inheritance (means many parents ther but inheretance not like this one 
//here HSBS is child bannk and USBank is interface 
// is a relationship (for interface )
//if a class is implementing only interface ,then its mandatory to define/overiding all the methods of interface 	
//start here overriding from USBank
	public void credit() {
		System.out.println("hsbc*********credit");
	}

	public void debit() {
		System.out.println("hsbc********debit");
	}
	
	public void tranferManey() {
		System.out.println("hsbc********tranferManey");
	}
//separate methods of HSBC class	
	public void educationLoan() {
		System.out.println("hsbc----------------educationlLoan");
	}
	public void carLoan() {
		System.out.println("hsbc----------------carLoan");
	}
	
	//brazialBank method ,overriding form brazil bank
	public void mutualFund() {
		System.out.println("hsbc mutual fund ");
	}
	
	
	
	
}
