package collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Shubham");
		al.add(1515);
		al.add("khot");
		al.add("ommy");
		al.add(777);
		al.add(null);
		al.add("***");
		
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.contains(1515));
	System.out.println(al.clone());
	System.out.println(al.isEmpty());
	al.add(4,"somnath");
	System.out.println(al);
	al.remove(3);
	System.out.println(al);
	System.out.println("========================");
	
	//al.elements();
	
	
	java.util.Iterator it = al.iterator();
	//w	Iterator it= al.iterator();hile(it.hasNext())
	{
		System.out.println(it.next());
		
		
	}
	
	for(int i=0;i<=al.size()-1;i++)
		
	{	
	System.out.println(al.get(i));
	
	}
	for(Object o:al)
	{
		System.out.println(o);
	}
	
	}
}
