import java.util.*;
class Demo 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner (System.in);
	System.out.println("enter a number ");
	int a = scan.nextInt();
	System.out.println("entered number is :" + a);
	
	System.out.println("-----------------------------------");
	
	System.out.println("enter you height ");
	float b = scan.nextFloat();
	System.out.println("Your Height is " + b);
	
	System.out.println("-----------------------------------");
	System.out.println("Are you married ? enter True / False ");
	boolean c = scan.nextBoolean();
	System.out.println("Your maritial status is " + c);
	
	System.out.println("------------------------------------");
	scan.nextLine();
	System.out.println("Enter your father's name");
	String d = scan.nextLine();
	System.out.println("Your Father name is :" +d);
	
}
}
