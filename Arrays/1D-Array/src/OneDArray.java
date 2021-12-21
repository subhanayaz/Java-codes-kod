import java.util.Scanner;

class OneDArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int arr[] = new int[7];
		for (int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the salary of " + i);
			arr[i] = scan.nextInt();
		}
		System.out.println("The entered salaries are :-");
		for (int i=1; i<=arr.length-1; i++)
		{
			System.out.println(arr[i] + " " );
		}
	}
}
