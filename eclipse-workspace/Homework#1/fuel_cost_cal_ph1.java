



import javax.swing.JOptionPane;



public class fuel_cost_cal_ph1 {

	public static void main(String[] args) {
		
		// Homework#1/a
		// Radia Smail
		// 09-08-2020
		
		
		// This program will calculate and display a user’s fuel cost
		
	// Declare variables
	
	
	String vName = null;	
	int distance = 0;
	int mpg = 0;
	float gasPrice = (float)0.0;
	String member = null;
	final double DISC = 0.05;
	float cost = (float)0.0;

	
// Welcome the user 
	
	JOptionPane.showMessageDialog(null,"Welcome to Cost Claculator 2020");
	
	
// Ask the user for inputs using dialog box	
		
    vName = JOptionPane.showInputDialog(null,"what is your vehicle name");
    System.out.println(vName);
    
   distance = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the distance"));
   System.out.println(distance);
   
   mpg =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your car MPG"));
   System.out.println(mpg);
   
   gasPrice = Float.parseFloat(JOptionPane.showInputDialog(null," Enter gas price per gallon"));
   System.out.println(gasPrice);
   
   
   member = JOptionPane.showInputDialog(null,"Are you a club member? yes/no ");
   System.out.println(member);
   
   
   
   if (member.equalsIgnoreCase("yes"))
   { cost = (float)((float)((distance/mpg)*gasPrice)-(DISC*distance));
   }
   else
   {  cost = (distance/mpg )*gasPrice;
   }
   
   System.out.printf("$%.2f\n",cost);
   
   }
	
   
	}


