import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// a program to enter a user`s bet amount

		Scanner in1 = new Scanner  (System.in);
		
		
		int userBet = 0;
		
		
		System.out.print("Enter an amount you wish to bet $10 to 100");
		userBet = in1.nextInt();
		
		
		// invoke the validation method
		
		userBet = validBet( userBet);
		
		
		
	}//END MAIN
	
// This is a method that validates the bet amount entered by a user
	
	public static int validBet(int amount)
	{
		Scanner in2 = new Scanner  (System.in);
		
		
		
		while ((amount<10)||(amount>100))
		{
			System.out.print(" enter an amount in the range of  $ 10 to 100 . ");
			amount=in2.nextInt();
			System.out.print(" you entered $ "+ amount);
	
		}
		
		return amount;
		
	}// End of method
	
	
}//END CLASS
