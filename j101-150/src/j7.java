
public class j7 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,10,11,12};

		boolean res = false;
		
		for(int i=0; i<a.length-2; i++)
		{
			if(a[i]+1 == a[i+1] && a[i+1]+1 == a[i+2])
			{
				res=true;
			}
		}
		
		if(res==true)
		{
			System.out.println("Array has three adjacent increment numbers");
		}
		
		else
		{
			System.out.println("array doesn't have three adjacent increment numbers");
		}
		
	}
}
