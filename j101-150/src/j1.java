import java.util.Scanner;

public class j1 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ten=0;
		int twenty=0;
		int i=0;
		System.out.println("Enter values you want in array");
		int val = sc.nextInt();
		int arr[] = new int[val];
		
		System.out.println("Enter the value: ");
		for( i=0; i<val; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<val; j++)
		{
			if(arr[j]==10)
			{
				ten++;
			}
			else if(arr[j]==20)
			{
				twenty++;
			}
			
		}
		
			System.out.println("No of ten's in array is "+ten);
			System.out.println("No of ten's in array is "+twenty);
	}
}
