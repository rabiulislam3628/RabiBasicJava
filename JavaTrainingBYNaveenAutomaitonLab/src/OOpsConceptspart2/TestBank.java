package OOpsConceptspart2;

public class TestBank {

	public static void main(String[] args) {
		
	System.out.println(USBank.min_bal); //// variable value will not be changed --its final /constant in nature
	
		HSBCBank hs =new HSBCBank();
		hs.credit();
		hs.debit();
		hs.tranferManey();
		hs.educationLoan();
		hs.carLoan();
//dynamic polymorphism
//Child class object can be referred by parent interface variable		
	
	USBank b=new HSBCBank();
	b.credit();
	b.debit();
	b.tranferManey();
//only overriding method should be call	

	}

}
