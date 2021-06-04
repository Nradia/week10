
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Review {

	public static void main(String[] args) {
		
		
		
		Scanner in1 = new Scanner(System.in);


		String answer = null;
		int attempts = 0;
		
		JOptionPane.showMessageDialog(null, " Welcome to  WORD Definition Game ");
	
		do
		{
		answer=JOptionPane.showInputDialog(null, "What is the definition of TRADITTLE?   \n 1- a joke.  \n 2- a sweet snack.  \n 3- a silly person. \n 4-  a lie .   ");
	
		while(!answer.equals("1") && !answer.equals("2") && !answer.equals("3") && !answer.equals("4"))

		{

			 answer = JOptionPane.showInputDialog(null, " Please enter a number 1-4 ");
 }
	
	
		if (answer.equals("4"))

		{

		System.out.println("HOORAY.  This is the correct answer ");

		}

		else

		{

	System.out.println("OOPS . Try again ");

		}
	

	
		attempts ++;
		
		} while(attempts<4);
		
	
	}
	

}
