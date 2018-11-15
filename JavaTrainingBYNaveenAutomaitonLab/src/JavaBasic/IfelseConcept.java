package JavaBasic;
//if else : if condition true then execute if block or execute else block
public class IfelseConcept {
	public static void main(String[] args) {
		
/* java basic operators
 * Arithmetic Operators  ----( +, -,*, /,%modular,++,--,)
		Relational Operators--- ( < lessthen ,  gaterthen >,<=,>=,==,!=,)
		Bitwise Operators ---(Bitwise operator works on bits and performs bit-by-bit operation. 
		Logical Operators---( && (logical and),   || (logical or), ! (logical not)
		Assignment Operators---(=,+=,-=,*=,/=,%=,
			*/	
		
		//comparison operators/Relational operator
		//<>,<=,>=,==,!=,
		int c=40;
		int d=40;
		if (c==d) {
			System.out.println("c and d are equal ");
		}
		else {
			System.out.println("c and d are not equal ");
		}
			
		
		int x =100;
		int y= 300;
		if (x>y) {
			System.out.println("x gater then y ");
		
		}
		else {
			System.out.println("Y is gater then x");
			
			//Another  way if else ---------------statement 
			
			System.out.println("test start");
			
			String browser="Chrome";
			
			if (browser.equalsIgnoreCase("Chrome")) {
				System.out.println("Test case execute on Chrome");
				}
		else
			
		{
			System.out.println("Test case execute on Firefox");
				
			}
			System.out.println("test end");
			
			//write a logic to find out the highest number
			//used nested if -else 
			
			int a1 = 400;
			int b1=200;
			int c1= 300;
			
			//nested if -else statement 
			if (a1>b1 & a1>c1){//false & false= false
				//true &false =false
				//true & true = true
				System.out.println("a1 is the greatest");
			}
			else if(b1>c1){
				System.out.println("b1 is the greatest");
			}
			else {
				System.out.println("c1 is the greatest");
				
			}
			
		}
		
		
	//	&& (logical and)	Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.	(A && B) is false
	//	|| (logical or)	Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.	(A || B) is true
	//  ! (logical not)	Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.	!(A && B) is true	
		
	}

}
