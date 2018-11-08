package JavaBasic;

public class LoopsStatement {

	public static void main(String[] args) {
		 //while loop will eecute if condition is true , if it is not meet it will break 
	     //here a= 0 and 0 is less then 10  = so,when we execute the code again again untille statement is meet or true at that time we used while loop
	     //while (a<=10)
	     //first initialize the value ,then it check it condition if it is meet then it execute again and again ,if it is not meet than it will break 
//dis advantage of while loop : it will generate infinite loop if I don`t give increment/decrement part   
		// while loop
		int i=0; //initializaton part
		while(i<=20) {  //conditional part 
			System.out.println(i);
			i++; //if do not add increment or decrement it will execute againg and again infinite loop
		}
		System.out.println("*************************");
		
//j++ means j=j+1		}
//for loop  
//print 1 to 10 		
		for(int j=1;j<=10;j++) { 
			System.out.println(j);
		}
		
		//another example of for loop
		//first initialize the value ,give the condition for loop run,third select increment/decreement 
				//if i want to see a page more then less then 100 times, in that situation I used foor loop
				
				
				for(int a=1; a<100; a++){  //if i declear a value is 110 it is not execute because 110 is gater then 100
					
					System.out.println(a);
					
//	print 10 to 1
//k--meanis k=k-1
//10 9 8 7 6 5 4 3 2 1
    for (int k=10;k>=1;k--)	{
    	System.out.println(k);
    }
					
				}
				
				//do while loop
				
				//do while loop it will execute the statement first and later it check the condition 
				//in do while loop initializaion ,condition and iteraion (increment/decrement )can not placed in placs
			//Only difference between these two loops is that, in while loops, test expression is checked at first but, in do...while loop code is executed at first then the condition is checked. So, the code are executed at least once in do...while loops.
//				it is same as while loop but in this loop code or logic will execute at least once.
				
				System.out.println("*****************do while loop*********");
				
					int a=10;
					
					do 
					{
						System.out.println(a);
						a++;
						
				    }while (a<=10);
								
				
		
	}

}
