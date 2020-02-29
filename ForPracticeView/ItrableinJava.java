package ForPracticeView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//import com.sun.tools.javac.code.Attribute.Array;

public class ItrableinJava {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	public static <T>Collection<T> getCollectionFromIteralbe(Iterable<T>itr)	
	{
		Collection<T> cltn=new ArrayList<T>();
		for(T t:itr)
		cltn.add(t);
		return cltn;
	}	
	public static void main (String[] args)
	{
	Iterable<Integer> i=Arrays.asList(1,2,3,4);
	System.out.println("Iterable List:"+i);
	
	Collection<Integer> cn=getCollectionFromIteralbe(i);
	System.out.println("Collection List"+i);
		
	}
}

