package collections.java;
import java.util.ArrayList;
import java.util.Iterator;
public class userarraylist
{
  void method1()
  {
	  ArrayList al=new ArrayList();
	 classa obj=new classa(101,"akash","male");
	 classa obj1=new classa(102,"vijju","female");
	 classa obj2=new classa(103,"minnu","female");
	 al.add(obj);
	 al.add(obj1);
	 al.add(obj2);
	 System.out.println(al);
	 System.out.println("===============================");
	 System.out.println("retriving data using for loop");
	 for(int a=0;a<al.size();a++)
	 {
		 System.out.println(al.get(a));
	 }
	 System.out.println("=======================");
	 System.out.println("retriving data usiing iterator");
	 Iterator it=al.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
  }
  public static void main(String[] args) 
  {
	userarraylist obj=new userarraylist();
	obj.method1();
}
}
