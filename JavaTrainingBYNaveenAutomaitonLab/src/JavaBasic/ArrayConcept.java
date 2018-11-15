package JavaBasic;

public class ArrayConcept {
	//Array is same as a variable but it contains same kinds of datatype ,ex 10 inter value all should be int vlue not other data type like-double.
	//int []myintarray= {1,3,2,4,5};(is this the elements of the array and it is contain 5 elements and it is also indicate position thst is called index, it is start from /*	
// An array is a type of variable that can store multiple values. It is like a list of items but it always contains similar data type values.
	public static void main(String[] args) {
	//array: to store similar data type values in a array variable 	
//1. int array
//lowest bound/index=0
//upper bound/index=n-1(n is size of array (4-1)=3
		
//below all one/single  dimention array		
		int i[] =new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;  // i can not store like-40.33 because it is not int
		System.out.println(i[3]); // print 40
		System.out.println(i[2]);
		System.out.println(i[1]);
		
	//	System.out.println(i[4]);//ArrayIndexOutOfBoundsException
//intrview question: data size of array is 4 and maximum index =n-1=3 so here 0,1,2,3 total 4 values if try to access 5th value that does not exist so answer is I can not access the 5th value becaues it is not exist			
		
	System.out.println(i.length); //here i = variable and .length will give you size of array
		
//when print all the vlues of array	,used for loop or while loop function 	
		
for(int j=0;j<i.length;j++)	{
	System.out.println(i[j]);
}
		
		//*********
		System.out.println("another way do array **************");
		
		int []myintarray= {100,33,30,4,5};
		//array position start form 0
			// output is 30 because 2 indicate the position of index ,ex-System.out.println(myintarray[2]); 
			// if i want to print all the array value then i used while loop 
			
			int index =0;
			while(index <5) {
				System.out.println(myintarray[index]);  
				index++;
			}
//2.double array
double d[]=new double[3];
d[0]=10.22;
d[1]=11.22;
d[2]=52.33;
System.out.println(d[2]);//52.33

//3.char array
char c[]=new char[3];
c[0]='q';
c[1]='A';
c[2]='3';
System.out.println(c[2]);

//4.boolean array
boolean b[]=new boolean[2];
b[0]=true;
b[1]=false;
System.out.println(b[1]);
		
//5.string array
String s[]=new String[3];
s[0]="test";
s[1]="Hellow";
s[2]="world";

System.out.println(s.length);

//Summary of array: 
// if i want to print all the array value then i used while loop or for loop
//how to get size or length of the array :  .length will give you size of array			
//if i try to print that index does not exit ,in that case (ArrayIndexOutOfBoundsException	error)	

//advantage of array: i can store  multiple values in a single variable 


//2 disadvantage of array : 1) size is fixed  -- it is called static array---To over come this problem --I can used collections --arraylist, Hashtable.(it called dynamic array)
//2) stores only similar  data types--- To over come this problem---we used object array.

//6.object array  //object is super class --it is store different data types value

Object ob[]=new Object[6]; //hear n= 6 so,n-1=5 
ob[0]="Rizvan";
ob[1]=1;
ob[2]=12.33;
ob[3]='M';
ob[4]=05/31/2018;
ob[5]="Bangladesh";
System.out.println(ob[0]);
System.out.println(ob.length);

//any array i can used for loop 



	}

}
