package abstraction_Interface;

public class TestBangla {
//I can not create objcet in abstract (super class) but I can create reference variable of super class(Mobiloe )
	public static void main(String[] args) {
	
		MobileUserBangla obj; //reference variable of super class

		obj = new RizvenBangla(); //creating the sub class obj by supper class reference varible 
		obj.sendMessage();
		
	obj.new SumeBangla();
	obj.sendMessage();
		
	// not finish 
	
	}

}
