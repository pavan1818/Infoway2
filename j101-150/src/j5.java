import java.util.Arrays;
import java.util.Scanner;

public class j5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		System.out.println("Enter no of entries you want in array");
		int val = sc.nextInt();
		int[] a = new int[val];
		
		System.out.println("Enter the value: ");
		for( i=0; i<val; i++)
		{
			a[i] = sc.nextInt();
		}
	
		System.out.println("Original array: " +Arrays.toString(a));
		
		int res = 0;
		int j=2;
		int start = 0;
		int end = a.length-j;
		for(; j>0; j--)
		{
			if(a[start] != a[end])
				res=1;
			else
			{
				start++;
				end++;
			}
		}
		
		if (res==1)
		{
			System.out.printf(String.valueOf(false));
		}
		else 
		{
			System.out.printf(String.valueOf(true));
		}
		System.out.println("\n"); 
		
	}
}
