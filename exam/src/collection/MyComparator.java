package collection;

import java.util.Comparator;

public class MyComparator implements Comparator{

	public static void main(String[] args) {
	
		MyComparator m = new MyComparator();
		
		MyComparator o1 = new MyComparator();
		MyComparator o2 = new MyComparator();
		m.compare(o1, o2);
	}
	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		System.out.println("i1="+i1);
		
		Integer i2 = (Integer)o2;
		System.out.println("i2="+i2);
		
		if(i1<i2)
			return +1;
		
		else if(i1>i2)
			return -1;
		
		else
		return 0;
	}

	
}
