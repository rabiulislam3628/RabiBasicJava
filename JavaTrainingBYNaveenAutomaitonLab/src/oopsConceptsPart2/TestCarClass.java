package oopsConceptsPart2;

public class TestCarClass {
//Method overriding : when same  method is present in parent class as well as in child 
	//class with same name and arguments ,it is called method overriding
	
	public static void main(String[] args) {
		BMWClass obj=new BMWClass();  //create object on BMWclass
//Static polymorphism -----Compile  run -time polymorphism	(becaue java took all comman and child method )	
		obj.start(); //when method are similar to the child and parents casll ,java take child class method 
		obj.stop();
		obj.refuel();
		obj.theftsafety();
		
//polymorphism: means 1 to many ,many method like- method overriding when same methods and aruments between parents and cild class ,		

     CarClass obj1 =new CarClass();
     obj1.start();
     obj1.stop();
     obj1.refuel();
    //parents class can not access in child class method but Child class can access in all  parents class method
		
		
		
	}

}
