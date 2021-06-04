package week8;

import java.util.Scanner;

public class carData2Array {

	
		public static void main(String[] args) {
			// create an array and load mileage into it then process it.

			int index=0;
			int arraySize=0;
			int total=0;
			int average=0;
			
			Scanner  in1=new Scanner(System.in);
			
			
			System.out.print("How many vehicles were used this week?");
			arraySize=in1.nextInt();
			
			int[] miles=new int[arraySize];
			// load values from the user
				
			
			total=totalArray(miles);
			
			
			// dump the content of the array
			System.out.println(java.util.Arrays.toString(miles));
			
			average=total/arraySize;
			System.out.println("average miles driven is : " + average);
			
		
		
	}//
 public static int totalArray(int[] mil)
 {
 Scanner  in1=new Scanner(System.in);
	 int tot=0;
	 for(int i=0; i<mil.length; i++)
		{
		 	 
		System.out.print("Enter the miles for vehicle number # " + (i+1));
		mil[i]=in1.nextInt();
		tot = tot+mil[i];
		System.out.println(mil[i]);
		
		}
	 return tot;
 }//
}//
