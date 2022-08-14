import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class j4 {

	
	public static void main(String[] args) 
	{

		int[] a = {11, 15, 13, 10, 45, 20, 33, 53};
		int result = 0; 
		System.out.println("Original Array: "+Arrays.toString(a)); 

		int i=0;
		int b[];
		while (a[i]!=10)
		{
			i++;
		}
		b = new int[i];
		for(int j=0; j<i; j++)
		b[j]=a[j];
		
		System.out.println("new Array: "+Arrays.toString(b));

	}
}