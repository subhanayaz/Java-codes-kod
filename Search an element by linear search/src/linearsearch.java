import java.util.Scanner;

class linearsearch 
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the array length");
	int n = scan.nextInt();
	int arr1[] = new int [n];
	System.out.println("enter the array contents");
	for (int i=0; i<=arr1.length-1; i++)
	{
		System.out.println("enter an element");
		arr1[i] = scan.nextInt();
	}
	System.out.println("enter key to search");
	int key = scan.nextInt();
	for (int i=0; i<=arr1.length-1; i++)
	{
		if (key == arr1[i])
		{
			System.out.println("key found at the index" + i);
			System.exit(0);
		}
	}
	System.out.println("key not found");
}
}
