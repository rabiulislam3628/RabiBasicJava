package Modifier1;

public class ModifierTestClass {

	public static void main(String[] args) {
	
//private modifier: any private methods or constracter  is only accessable within the same class 
		
//it is accessable everywher in the projct ,like one package to another 

//protected modifier: it is accessable in different class within same pacakage but it is also accessable if i create  inhered the particular (extends) class
	
//Default modifier : when i did not diclare any access modifier then it is called defult , it is accessable only the within the same package .
		
AClassModifier ob =new AClassModifier();
		
	ob.display();

	}

}
