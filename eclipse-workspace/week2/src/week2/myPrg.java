package week2;

import java.util.Scanner;

public class myPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Rdai Smail
		
String name = null;
String course = null;
String adj = null;

Scanner input1 = new Scanner (System.in);

System.out.println("Welcome to my game");

System.out.println("What is your name");
name = input1.nextLine();

System.out.println("What course are you taking?");
course = input1.nextLine();

System.out.println("How is it?");
adj = input1.nextLine();

System.out.println(name.toUpperCase() + " is taking " + course + " and he thinks it is " + adj);




	}

}
;