package JavaBasic;

//when we doing multipul condition checking ,then we used switch statment insted  of if else statement
//Data type should be same for comparision ,if select int all vlue should be int
//we can have multipule case 
//break is optional but if I not provided break, it will check all cses till the end 
public class SwitchStatment1 {

	public static void main(String[] args) {
	
int score = 100;
		
		//it is could be byte,short,int,or char
		
		switch(score)
	
		{
		//when doing many case without break 
		case 100:
		case 95:
		case 90:
			System.out.println("very good");
		break;
		
		case 60:
			System.out.println("good");
		break;
		case 40:
			System.out.println("ok");
		break;
		
		//I can execute  N umber of case statement 
		default:
			System.out.println("the grade are not defined");
			break;
					
		}		
		
		
		
		
		
		
		

	}

}
