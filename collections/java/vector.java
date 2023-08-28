package collections.java;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
public class vector
{
 void method1()
 {
	 Vector v=new Vector();
	 v.add(10);
	 v.add("akash");
	 v.add('a');
	 v.add(null);
	 v.add(true);
	 v.add(10);
	 v.add(20);
	 v.add(30);
	 System.out.println(v.size());//gives the size of the vector
	 System.out.println(v.capacity());//gives default capacity of vector
	 System.out.println(v);
	 System.out.println(v.isEmpty());//check the values present or empty (return type is boolean)
	 System.out.println(v.contains('a'));//checks the element present or not(return type is boolean)
	// v.clear();  //clear all the elements
	 System.out.println(v.remove((Object)30));//remove the element 
	 System.out.println(v);
	 System.out.println("==============================");
	 System.out.println("retriving the data by using for loop");
	 for(int a=0;a<v.size();a++)
	 {
		System.out.println(v.get(a)); 
	 }
	 System.out.println("====================================");
	 System.out.println("retriving the data by using enumerator interface");
	 Enumeration e=v.elements();
	 while(e.hasMoreElements())
	 {
		 System.out.println(e.nextElement());
	 }
	 System.out.println("=========================================");
	 System.out.println("retriving the data using iterator");
	 Iterator i=v.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	
 }
 public static void main(String[] args)
 {
	vector obj=new vector();
	obj.method1();
}
}
