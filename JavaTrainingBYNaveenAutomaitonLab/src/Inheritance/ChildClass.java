package Inheritance;

public class ChildClass extends BassClass{

	public static void main(String[] args) {
// 4 scenearios: 1. Child class reference and child class object ---this will allow 
		//to access all the methods of base class and child class	
		
		ChildClass obj =new ChildClass();
		obj.add();
		obj.sub();
		obj.div();
		obj.mul();
		
		
	}
		public void mul() {
			System.out.println("hello I am sub  or supar class and multiplication is 2500");
		}
	
		public void div() {
			System.out.println("hello I am sub or supar class and divition is 50");
		}

}
