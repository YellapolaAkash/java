package collections.java;
import java.util.LinkedList;
import java.util.ListIterator;
public class linkedlist
{
 void method1()
 {
	 LinkedList ll=new LinkedList();
	 ll.add(10);
	 ll.add("java");
	 ll.add('a');
	 ll.add(null);
	 ll.add(true);
	 ll.add(10);
	 ll.add(20);
	 ll.add(30);
	 ll.add(40);
	 System.out.println(ll);
	 System.out.println(ll.getFirst());//gives first element
	 System.out.println(ll.getLast());//gives last element
	// System.out.println(ll.removeFirst());// removes first element
	//System.out.println(ll.removeLast());//remove last element
	 ll.addFirst(1);//add the element in first place
	 ll.addLast(100);//add the element in last place
	ll.add(1,2);//add the element in 1st index position 
	System.out.println(ll);
	System.out.println("====================================");
	System.out.println("retriving the data by using listiterator");
	ListIterator li=ll.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("===========================================");
	System.out.println("retriving the data using for each loop");
	for(Object o:ll)
	{
		System.out.println(o);
	}
 }
 public static void main(String[] args)
 {
	linkedlist obj=new linkedlist();
	obj.method1();
}
}
