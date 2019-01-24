package JavaBasic;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String y[][]=new String[3][5]; //here 3 rows and 5 cloums
		
		System.out.println(y.length);// 3 is total no of rows 

		System.out.println(y[0].length);//5 is total no of cloums 
	
// N.B please see the two and one dimention array table java and selenium practics folder
		
//Ist rows
	y[0][0]="A";
	y[0][1]="B";
	y[0][2]="C";
	y[0][3]="D";
	y[0][4]="E";
	
	//2nd rows
	y[1][0]="A1";
	y[1][1]="B1";
	y[1][2]="C1";
	y[1][3]="D1";
	y[1][4]="E1";
	
	//3rd rows
	y[2][0]="A2";
	y[2][1]="B2";
	y[2][2]="C2";
	y[2][3]="D2";
	y[2][4]="E2";
	
	
	
System.out.println(y[0][4]);//E
System.out.println(y[1][2]);//c1
System.out.println(y[2][4]);//E2

//to print all the values of 2 dim arrray : use for loop
//row =0, col= 0to 4
//row =1, col= 0 to 4
//row =2, col = 0 to 4

	System.out.println("for loop tart here***************");
	
	for (int row=0;row<y.length;row++) {  //y.length here total no of rows
		for(int col=0;col<y[0].length;col++) { //y[0].length here no of colums
			System.out.println(y[row][col]);		
			}
System.out.println("another way for loop**************");		
		
		for(int b=0;b<=y.length;b++) { 
			System.out.println(b);
		}
		
//summary: two dim has 2 []	[] but one dim has []	
		
		
	}

		
		
		
		
	
	}

}
