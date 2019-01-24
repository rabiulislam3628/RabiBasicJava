//ArrayList 
package ListConceptJavaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	String name;
	int age;
	String dept;

//create a contractor here it is same as a class name
	
	Employee(String name,int age, String dept){
		this.name=name;  //when globe variable and local variable are same then used this key word 
		this.age=age;
		this.dept=dept;
		
//create 3  employee class object 
		Employee e1=new Employee("Rabiul",30,"Performace Testing1");	
		Employee e2=new Employee("Rizven",01,"QA");	
		Employee e3=new Employee("Sume",25,"BA");	
//Create a arrayList 
		ArrayList<Employee> ar1 =new ArrayList<Employee>();
	
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
	//for loop take the index value but iterator take next iterator so,if i need to print all value of iterator then used while loop only not for loop	
	//iterator to traverse the value
		
		Iterator<Employee>it =ar1.iterator(); //while 
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println("emp.name");
			System.out.println("emp.age");
			System.out.println("emp.dept");
		}
		
		//addall();   addall methods
		ArrayList<String>ar5 =new ArrayList<String>();
		
		ar5.add("test");
		ar5.add("Name");
		
		ArrayList<String>ar6 =new ArrayList<String>();
		
		ar6.add("java");
		ar6.add("Bangla");
		
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
	}
	
}
