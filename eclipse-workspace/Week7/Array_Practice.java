import java.util.Scanner;

public class Array_Practice {

	public static void main(String[] args) {
		
		
		Scanner in1=new Scanner (System.in);
		
		
		int index=0;
		int arraySize=5;
		int total=0;
		int average=0;
		
		int[] salary=new int[arraySize];
		
		
		for(int i=0; i<arraySize; i++)
		{
		System.out.print("enter the salary here for employee #"+(i+1)+" ");
		salary[i]=in1.nextInt();
		total=total+salary[i];
		
		}
		System.out.println("total is "+ total);
		
		System.out.println(java.util.Arrays.toString(salary));
		
		
		//average=total/arraySize;
		//System.out.print("average is "+average);
		average=avage(total);
		//System.out.print("This is the average from the method " + average);
				
	}//
    public static int avage(int tot)
{
	int inx=5;
	int avg=0;
	avg=tot/inx;
 System.out.print(avg);
 return avg;
}
   

}//
