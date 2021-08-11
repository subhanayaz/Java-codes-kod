import java.util.*;
class Swap 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Enter two Numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("The Entered Numbers are :- " + a + " " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Numbers after Swapping are :- " + a + " " + b);
	}
}
