import java.util.*; 
import java.io.*; 
 public class j6 {
 public static void main(String[] args)
 {
	int[] a = {11, 15, 13, 10, 45, 20};
    System.out.println("Original Array: "+Arrays.toString(a)); 
	
	if(a.length >1)
    {          
    int first = a[0];
              
    for(int i = 1; i < a.length; i++)
        a[i - 1] = a[i];
                        
    a[a.length - 1] = first;
	System.out.println("New Array: "+Arrays.toString(a)); 
	}
  }
}
