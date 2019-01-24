package ListConceptJavaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
//non Generic : it is could be primitive or non premitive data type 
	public static void main(String[] args) {
		
int i[]=new int[3]; //static array // we don`t used static array in when design the framwork /dynamic app because its size is fixed	
// To over come above problem we used dynamic arrayList because it is not size limit 
//properties of ArrayList :
//1. it is Dynamic array (not a size fixed 
//2. it can contain duplicate value/ elements  but set not allows the dublicate value 
//3. it is not synchronized 
//4. it is allows random access to petch the elements because it stores the values on the basic of index 

//Non Generic arraylist object example below: different type of data we can store in here 

ArrayList ar=new ArrayList(); //ArrayList is default class and create an object here
  ar.add(10); 
  ar.add('A'); 
  ar.add("Rizvan");//same way I can add n number of methods 
  ar.add(20.33); 
  
  System.out.println(ar.size());//find out size of the arraylist 
  
  System.out.println(ar); //print all the value by ar reference variable
  System.out.println(ar.get(2)); //print the 2th position value (random acces ) to get the value form index
  
  //to print all the values of arrayList/array  used for loop or iterator  because store the values of index basis 
  
  for(int j=0;j<ar.size();j++) {
	  System.out.println(ar.get(j));
  }
  //Non generic vs Generic
  
  //Generic arraylist  below exampe:
  ArrayList<Integer> obj=new ArrayList<Integer>();// it is allow only integer data type becaue I mention only the integer 
  
  obj.add(12); 
  obj.add(266);
//  obj.add("Sume"); not allow because it is string data type
  
  ArrayList<Boolean>obj1 =new ArrayList<Boolean>();
  obj1.add(true);
  
  ArrayList<String> obj2 =new ArrayList<String>();
  obj2.add("Islam");
  
 // ArrayList<E>obj3 =new ArrayList<E>(); //when i am not sure what type of data type then used E
  
  //System.out.println(obj1.get(6));//IndexOutOfBoundsException error :because it is not listed in index
  
  //Enhance the for loop //learn later 
	//for (Object abc:obj1) {
		//System.out.println("Value are " +abc);
	//}
  
  Iterator itr=obj1.iterator();  //iterator will responsible to iterator my list 
	// Read more iterator 
	

	}

}
