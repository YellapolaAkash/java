package collections.java;
import  java.util.HashSet;
import java.util.ArrayList;
import java.util.ListIterator;
public class hashset 
{
void method1()
{
	HashSet hs=new HashSet();//hashset
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	hs.add(70);
	System.out.println(hs);
	ArrayList al=new ArrayList(hs);
	ListIterator it=al.listIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("======reverce======");
	while(it.hasPrevious())
	{
		System.out.println(it.previous());
	}
	
}
public static void main(String[] args)
{
    hashset obj=new hashset();
    obj.method1();
}
}
