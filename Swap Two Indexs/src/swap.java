import java.util.*;
public class swap 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array length");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array contents");
		for(int i=0; i<=arr.length-1; i++) 
		{
			System.out.println("enter " + i +" element");
			arr[i] = scan.nextInt();
		}
		System.out.println("enter 2 indexes where the content has to be swapped");
		int ind1 = scan.nextInt();
		int ind2 = scan.nextInt();
		System.out.println("Array contents before swapping ");
		for (int i=0; i<=arr.length-1; i++) 
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		int help;
		help = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = help;
		System.out.println("Array contents after swapping ");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
}
