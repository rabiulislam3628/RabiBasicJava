//Abstract class and Abstract methods
package abstraction_Interface;

public class AbDemo {
// let say porject manager give us overal project details he does not give us any defination ,he only give us methods name and our responsibility is impliments all the methods 
	public static void main(String[] args) {
		
//MahesPhone obj=new MahesPhone(); // I can not create object in abstract class 
//MahesPhone obj	=new RameshPhone();//I can not create object in abstract class 
//obj.call();

// now i cna create abject SureshPhone class
// I can not create object in abstract class but i can create reference variable of abstract class then I can call of sub class object by super or parents class reference variable 	
	MahesPhone obj=	new SureshPhone();	
	obj.call();
	obj.cook();
	obj.dance();
	obj.move();
	
	
	}

}
//Abstract class
 abstract class MahesPhone{  //he knows how to define the call in call methods but 
	//he does not how to implement or define the move,dance and cook methods ,he just declare it  
	public void call() {  
		System.out.println("calling----");
	}
	public abstract  void move(); //he does not know how to implement or do not defien the implement part then it will be abstract methods  below 3 methods 
	public  abstract void dance(); // this 3 is abstract methods so class should be abstract  
	public abstract void cook();
}
abstract class RameshPhone extends MahesPhone{ // Abstract class  //ramesh has 4 methods but he implinent 1 rest 2 is abstract so I have to change abstract class
	public void move() {
		System.out.println("Movenig -----");
	}
}
class SureshPhone extends RameshPhone{  //it is concrete class // Suresh impliment all 2 methods 
	public void dance() {
		System.out.println("Dancing ");
	}
	public void cook() {
		System.out.println("Cooking---");
	}
}
