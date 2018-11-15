package Inheritance;

public class ChildClass2 extends BassClass{

	public static void main(String[] args) {
//vvvvvv: Sceneario 3: BassClass reference and child class objcet----This will allow to access all the 
//methods of base class only and not child class methods.
		
	//	below BassClass obj  --is bassClass reference
	//object of child class --new ChildClass2
		
//I can not access the child class object -if I have not reference of
//bassclass, java say reference matter is lots -reference is pointing to bassClass so,i can call only baseClass methods 		
	BassClass obj =new ChildClass2();
	obj.add();
	obj.sub();
	
		

	}

}
