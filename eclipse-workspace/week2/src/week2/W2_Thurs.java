package week2;

import  java.util.Scanner;



public class W2_Thurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weight = 0;
		int height = 0;
		double bmi = 0.0;
		String name = null;
		
		// create input scanner object
		
		// name = JOptionpane.showInputDialog(null," enter your name ")
		Scanner key1 = new Scanner (System.in);
		
		
        System.out.print("enter your weight");
        weight = key1.nextInt();
        		
       System.out.print("enter height in inches");
        height = key1.nextInt();
        
        bmi = (weight*703)/(Math.pow(height,2));
        
        System.out.printf(" your BMI is %2.2f \n", bmi);
        
        if(bmi > 25)
        {
        	System.out.println(" you are OVERWEIGHT");
        	
        }
        else if (bmi > 19.5)
        { 
        	System.out.println(" you are avregae");
        }
        else
        { 
        	System.out.print("you are under weight");
        }
        
        
        
        
	}

}
