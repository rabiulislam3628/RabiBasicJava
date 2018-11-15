package ParameterDwmo;

public class PassParameter2 {

	public static void main(String[] args) {
		
		PassParameter2 obj=new PassParameter2();
		int sum=obj.add(10, 20);
		System.out.println("sum result is "+sum);
		
		
		obj.sub(22.20, 33.30);
		
		
		
//Q6.How to pass the parameter? Ans: when I call the method with object then java asking pass
//the parameter then run the program and get the result 
		
	}

	
	public int add(int a,int b) {
		int c=a+b;
		
		return c;
		
	}
	
  public void sub(double x,double y) {
	  double result=y-x;
	  System.out.println("this is the vlue "+result);
	  
	  
  }
}


