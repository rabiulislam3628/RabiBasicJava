package Encapsulation;

//there are 4 types of accessmodifier in java:
//private int age; //private member
//int age; //default member
//protected int age;  //protected member
//public int age; //public member 

public class PersonBangla {
	
	// 2nd way :Protecting data by declaring them as private 
   String name;
    int age;
   
    public static void main(String[] args) {
    	
    	PersonBangla pa=new PersonBangla();
    	pa.setAge(30);
    	pa.setName("Sume");
    	
    	
    	System.out.println("employee name is: "+pa.getName());
    	System.out.println("Employee age is: "+ pa.getAge());
    	
    }
    
    
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

   







}
