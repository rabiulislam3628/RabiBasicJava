package Inheritance;

public class ChildClass1 extends BassClass{

	public static void main(String[] args) {
		
//Scenarious 2.: Base class reference and base calss object ----This will allow to access all the 
		//methods of base class only.
		
		BassClass obj =new BassClass();
		obj.add();
		obj.sub();
		
	}

}
