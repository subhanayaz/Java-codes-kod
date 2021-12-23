import java.util.*;
public class ThreeDArray {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int arr[][][] = new int [3][2][4];
	for(int i=0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1; j++)
		{
			for(int k=0; k<=arr[i][j].length-1; k++)
			{
				System.out.println("enter the amount of bank " +i+ "and of branch " +j+ "and of costumer" +k);
				arr[i][j][k] = scan.nextInt();
			}
		}
	}
	System.out.println("entered amount is ");
	for(int i=0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1; j++)
		{
			for(int k=0; k<=arr[i][j].length-1; k++)
			{
				System.out.println(arr[i][j][k]+" ");
			}
			System.out.println( );
		}
	}
}
}
