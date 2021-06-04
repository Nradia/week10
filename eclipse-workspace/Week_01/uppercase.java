import java.util.Scanner;
import javax.swing.JOptionPane;

public class uppercase {

	public static void main(String[] args) {
		
		
	Scanner	input1 = new Scanner(System.in);
		
	
		int salary = 0;
		Double num = 0.0;
		String month = null;
		String birth = null;
		
		System.out.print("enter a number");
		salary = input1.nextInt();
		
		salary++;
		System.out.println("salary is now   "+ salary);
		
		++salary;
		
		System.out.println("salary is now   "+ salary);
		
		
		
		// salary = num/5;
		// System.out.printf("your salary will be :%.2f ", salary);
				
		birth = JOptionPane.showInputDialog(null," what month are you born ? ");
		birth = birth.toUpperCase();
		
		System.out.println("You are born ovn "+ birth);
		
		 System.out.print("enter a month");
		 month = input1.nextLine();
		 month = month.toUpperCase();
		 System.out.println("the month is "+month);
		
		
	}

}
