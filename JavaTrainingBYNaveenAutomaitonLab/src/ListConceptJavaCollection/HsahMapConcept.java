package ListConceptJavaCollection;
//HashMap
import java.util.HashMap;
import java.util.Map.Entry;

//HashMap : HashMap using multi threading applicaiton to improve the performance 
public class HsahMapConcept {
//interview question :about HashMap ?	
//HashMap is a class which implements Map interface 
//it extends with AbstractMap 
//it contains only unique elements 
//it`s store the value --key -values farmet 
//it may have one null key allowed multiple null values 
//it does not maintains execution  order 
//HashMap is non -synchronised ---not thread safe 	but HashTable is synchronised (thread safe)
//concurrent modification execption --means --Fail -fast condition
//Fail- fast condition : when I  calling particulr hashmap any modication is happing (adding,removing key and value by the other therads) at that time concurrent modification exception showing
	
	public static void main(String[] args) {
		
HashMap<Integer,String>hm=new HashMap<Integer,String>(); //first creat a object of Hm
hm.put(1, "Selenium");
hm.put(2, "QTP");
hm.put(3, "Test");
hm.put(4, "Testing world");

System.out.println(hm.get(2));
System.out.println(hm.get(4)); //null because I did not put the key and values , it is did not show me outofexecption error 

//if I want to print all the HashMap value used For loop

for (Entry m:hm.entrySet()) {
	System.out.println(m.getKey() +"   "   + m.getValue());
	
//Remove values 
	hm.remove(3);
	System.out.println(hm); //remove any particular key and values 
		
}
	
HashMap<Integer,Employee>emp=new HashMap<Integer,Employee>();
Employee e1=new Employee("Tom",25,"admin");
Employee e2=new Employee("Rizvan",1,"QA");
Employee e3=new Employee("Rabiul",26,"Dev");

 emp.put(1, e1);
 emp.put(2, e2);
 emp.put(3, e3);
 //traverse the hashMap by for loop
 for(Entry<Integer,Employee> m :emp.entrySet()) {
	int key =m.getKey();
	Employee e=m.getValue();
	System.out.println(key +"info");
	System.out.println(e.name +"" +e.age +"" +e.dept);
	
	
 }


	}

}
