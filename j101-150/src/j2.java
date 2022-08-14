import java.util.Scanner;

public class j2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		System.out.println("Enter values you want in array");
		int val = sc.nextInt();
		int[] arr = new int[val];
		
		System.out.println("Enter the value: ");
		for( i=0; i<val; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int k : arr)
		{
			if((k==10) || (k==30))
			{
				System.out.println("Array contains 10 and 30");
			}
			else
				System.out.println("Not contian 10 and 30");
		}

		
//	for(int i=0; i<arr.length; i++)
//		else if(arr[i]==10)
//		{
//			System.out.println("Array contains only 10");
//		}
//		else if(arr[i]==30)
//		{
//			System.out.println("Array contains only 30");
//		}
//		else
//			System.out.println("Array doesn't contain 10 or 30");
	
	
	}
	
}
