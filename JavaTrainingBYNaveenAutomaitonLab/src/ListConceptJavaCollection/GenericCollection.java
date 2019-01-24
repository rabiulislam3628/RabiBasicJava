//Generic in Collection

//1. 
package ListConceptJavaCollection;

import java.util.ArrayList;

public class GenericCollection {

	public static void main(String[] args) {
		
	// also used list<String> obj1=new ArrayList<String>(); but we don`t use collection 
		ArrayList<String> obj1=new ArrayList<String>(); //this is arraylist with generic
		
		obj1.add("Rizven");
		obj1.add("Selenium for Java");
	//	obj1.addAll("12");  here all have to string because I already declar string type 
		obj1.add("Rabiul");
		
for (String value:obj1) {
	System.out.println(value);
}
	}

}
