import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {


	public static void main(String[] args)
	{
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(40);
		ar.add(5);
		Collections.sort(ar);
		
System.out.println(ar);

int largest=ar.get(0);
int secondlargest = ar.get(0);
for (int i=0;i<5;i++)
{
	if (ar.get(i)>largest)
	{
	secondlargest = largest;
			largest= ar.get(i);
	}
	
	 if(ar.get(i) > secondlargest && ar.get(i) != largest)
	 {
		 secondlargest = ar.get(i);
	 }
		System.out.println(secondlargest);    
}

	}

}
