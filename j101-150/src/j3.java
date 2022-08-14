import java.util.Arrays;

public class j3 {

	public static void main(String[] args) {
		
		int a[] = {33,22,11,10,9,8,7};
		
		int i = a.length-1;		//7-1
		while(a[i]!=10)
		{
			i--;				//3
		}
		
		int b[]=new int[a.length-1-i];	//7-1-3
		for(int j=i+1 /*3+1*/ ; j<a.length; j++)
		{
			b[j-i-1] = a[j];		//b[0]=a[0]
		}
		System.out.println("New Array: "+Arrays.toString(b));
	}
}
