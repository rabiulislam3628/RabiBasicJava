package ListConceptJavaCollection;

import java.util.Hashtable;

//HashTable
public class HashTableConcept {
//HashTable is similar to hashmap but it is synchronised 
//Synchronised means thread safe --its means at a time only one object can be accessable by thread/user ,if thread 1 is working on particular objec ,at that time any other thred can not be access ,it is one by one access or syncrosied 
//but in the hashTable many threads can be acessable at the same time what `s why it called the non -synchronised --or -not thread safe because many threads working on the same trheads at a time as a result they
//	did not get right out put (one persion update value "A" in the particular object but same time another persin get "A " but he expect different value like-"C", this is the resion for concurrent modification execption
//it`s store the value on the basis of key  and value 
//hashtable has a specific object that used as a key and each object has a --hashcode --and that hashcode contain the value 

	public static void main(String[] args) {
		Hashtable h1=new Hashtable();
	h1.put(1, "Rizven");
	h1.put(2, "Rizven2");
	h1.put(3, "Rizven3");
	
	//create a clone compy /hallow copy of hashTable
	Hashtable h2 =new Hashtable();
	h2=(Hashtable)h1.clone();
	
	System.out.println("the vlaues of h1"+ h1);
	System.out.println("the vlaues of h2"+ h2);
	
//below method to used for print all the vlues of hashtable :		
//print all the vlues of the hashtable used --Enumerator --elements ()		
//print all the vlues of the hashtable used --entrySet--set of hashtable values
//Check both hashtable are equeal or not used if statement 	
	}

}
