import java.util.Scanner;
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input1=new    Scanner (System.in);
		int age=0;
		
		String  name=null;
		String answer=null;
		
		do
		{
		
		System.out.print(" Enter your age");
		
		// System.out.println("Good morning. You are "+age+" years old");
		
		age=input1.nextInt();
		
		if (age<25)
		{
			System.out.println(" not allowed");
		}
			
		else if (age>22 && age<44)
		{
		System.out.println(" None");
		}
			
		else {
				
			System.out.println("Not applicable");
		}
		
		input1.nextLine();
		
	System.out.println(" Do you want to keep trying");
	answer=input1.nextLine();
		
	} while (answer.equalsIgnoreCase("yes"));
}

}
