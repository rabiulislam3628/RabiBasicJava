package ParameterDwmo;

public class PassParameter {

	public static void main(String[] args) {
		
		PassParameter obj=new PassParameter();
		obj.add(10, 20);
		obj.sub(22.20, 33.30);
		
		
//Q6.How to pass the parameter? Ans: when I call the method with object then java asking pass
//the parameter then run the program and get the result 
		
	}

	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("this is the result is "+c );
		
	}
	
  public void sub(double x,double y) {
	  double result=y-x;
	  System.out.println("this is the vlue "+result);
	  
	  
  }
}


