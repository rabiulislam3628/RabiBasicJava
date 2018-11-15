package abstraction_Interface;

public class TestBank {

	public static void main(String[] args) {
	
		HSBCBank hs=new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.tranferMany();
		hs.educationLoan();
		hs.carLoan();
		
//dynaic polymorphism :
//Child class object can be referred by parent interface reference variable 		
		
	USBank obj =new HSBCBank();	
	obj.credit();
	obj.debit();
	obj.tranferMany();
	
		
		
		
	}

}
