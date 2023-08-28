package collections.java;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedList;
public class treeset
{
void method1()
{
	TreeSet <Object>t=new TreeSet();
	t.add(10);
	t.add(60);
	t.add(40);
	t.add(90);
	t.add(30);
	t.add(50);
	t.add(20);
	t.add(80);
	t.add(70);
	t.add(1);
	System.out.println(t);
	Iterator it=t.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("====================");
	System.out.println("retriving in decrising order");
	Iterator it1=t.descendingIterator();
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	System.out.println(t.headSet(30));//gives all elements from starting ro 30
	System.out.println(t.tailSet(60));//gives all elements from 60 to last
	System.out.println("==================================");
	LinkedList <Object>ll=new LinkedList(t);
	
	Iterator it2=ll.iterator();
	while(it2.hasNext())
	{
		System.out.println(it2.next());
	}
}
public static void main(String[] args)
{
	treeset obj=new treeset();
	obj.method1();
			
} 

}
