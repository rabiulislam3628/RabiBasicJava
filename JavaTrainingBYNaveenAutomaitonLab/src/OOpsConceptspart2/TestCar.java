package OOpsConceptspart2;

public class TestCar {
//when method is present in parent class as well as child class
//with the same name and number of arguments , is called method overriding 
	//and 
///Method overloading--when the method name is same with  different argurment
	//or input parameter within the same class ,it called method overloadding
	
	public static void main(String[] args) { //overriden method 
		
	//static polymorphism -----or compile polymorphism (java decide which methods need to call
	//polymorphism: means meany methosd with some number of arguments in parents class and child class 	
		BMW obj=new BMW();
		obj.start();  //this method is overriding methods
		obj.stop();  // this method take form parents class
		obj.refuel();//  ""
		obj.theSafety();  // this method own BMW it self
		obj.engine();
		
System.out.println("***************************");		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
System.out.println("******************");
//below I create just a object of child class wihtout any reference 

// it is also called Top Casting
  Car c1 =new BMW();//Child class object can be referred by parents reference variable it is called dynamic polymrphism or Run-time polymorphism
c1.start(); //override method only allaw : comman method and parentds calass method 
c1.stop();
c1.refuel();

 //Down Casting : down casting is not allow in Run-time polymorphism , it will show ClassCastExecpeiotn run time error 

 //parant class can not take child class reference veriable
	}

}
