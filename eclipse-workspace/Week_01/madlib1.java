import java.util.Scanner;
public class madlib1 {

	public static void main(String[] args) {
		// Lab#1
		// Radia Smail
		// 09/01/2020
		
				
		String fname= null;
		String lname = null;
		String adjective = null;
		String place = null;
		int number = 0;
		
		Scanner input1 = new Scanner (System.in);
		
		System.out.println("Enter first name ");
		fname = input1.nextLine();
		
		System.out.println("Enter last name ");
		lname = input1.nextLine();
		
		System.out.println("Enter an adjective ");
		adjective = input1.nextLine();
		
		
		System.out.println("Enter place ");
		place = input1.nextLine();
		
		System.out.println("Enter an integer ");
		number = input1.nextInt();
		
		
		
		System.out.println(fname.toUpperCase() +" " +lname.toUpperCase() + " says there are "+ number + " "+ adjective + " people in the " + place );
	}

} 
