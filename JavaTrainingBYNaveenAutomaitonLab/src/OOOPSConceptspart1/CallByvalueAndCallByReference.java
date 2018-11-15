package OOOPSConceptspart1;

public class CallByvalueAndCallByReference {

	public static void main(String[] args) {
		
		CallByvalueAndCallByReference obj =new CallByvalueAndCallByReference();	
		int x=10;
		int y=20;
		obj.testSum(x, y);//call by value ro pass by value
		
		
	//N B ::sudy more for next time	,this topic
		
	}

public int testSum(int a,int b) {
	int c= a+b;
	return c;
}
	
	
	
	
}
