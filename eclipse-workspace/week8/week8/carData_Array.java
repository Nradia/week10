
package week8;

import java.util.Scanner;

public class carData_Array {

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
			
		
		for(int i=0; i<miles.length; i++)
		{	
		System.out.print("Enter the miles for vehicle number # " + (i+1));
		miles[i]=in1.nextInt();
		}
		
		for(int i=0; i<arraySize; i++)
		{	
		total = total+miles[i];
		System.out.println(miles[i]);
		}
		// dump the content of the array
		System.out.println(java.util.Arrays.toString(miles));
		
		average=total/arraySize;
		System.out.println("average miles driven is : " + average);
		
		
		
	}//

}//
