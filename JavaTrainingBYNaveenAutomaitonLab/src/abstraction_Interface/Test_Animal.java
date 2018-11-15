package abstraction_Interface;

public class Test_Animal {

	public static void main(String[] args) {
//Important : I can not create an object of interface ,below to exampe 
		
		Dog_Animal obj= new Dog_Animal();//object  of dog_Animal class 
		obj.eat();
		
//Animal obj=new Animal(); //I can not create objcet because it is interface
		Cat_Animal c=new Cat_Animal();
		
		c.eat();
			
		
		
	}

	
	
}
