package ListConceptJavaCollection;
//Linked list by Naveen automation lab
import java.util.Iterator;
import java.util.LinkedList;

//LinkedList : it is  class
public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String>ll=new LinkedList<String>();  //it is Generic 
		
	//add methods
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("Rabiul");
		ll.add("Rizven");
	System.out.println("content of linkedlist:"+ ll);  //pront all the linkedlist value 
		
//addfirst
	ll.addFirst("test");  //it is pirnt the first value of the row 
//addlast
	ll.addLast("isla"); //addlast methods print last value 
	System.out.println(ll);
//get methods
	System.out.println(ll.get(0)); //print 0th index position value
	System.out.println(ll.get(1)); //print 1th index position value
	System.out.println(ll.get(2));//print 2th index position value
	System.out.println(ll.get(3));//print 3th index position value
	
//set methods
	ll.set(0, "Tom"); // insert new data in linkedlist ,before it was test now i will print Tom,
	System.out.println(ll.get(0));
	
//Remove first and last elements
	
	ll.removeFirst();
	ll.removeLast();
	System.out.println("content of linkedlist:"+ ll);
	ll.remove(2);
	System.out.println("content of linkedlist:"+ ll);
	
//how to print all the value of LinkedList (***interview question)
//for loop , advance for loop, while loop and iterator  used to print the elements linkedList 	
	
	System.out.println("*************using for loop");
//for loop	
	for(int n=0;n<ll.size();n++) {
		System.out.println(ll.get(n));
	}
//advance for loop	
	System.out.println("************Advance  for loop");
	for(String str :ll) {
		System.out.println(str);
	//Iterator 	
		System.out.println("***********using for Iterator");
	Iterator<String>it=ll.iterator(); //if in this particular iterator next elements is available print it 
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	System.out.println("*************While loop");
	
//while loop
	int num=0;
	while(ll.size()>num) {
		System.out.println(ll.get(num));
		num++;
	}
	
	}
		
	}

}
