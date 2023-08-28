package collections.java;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylist 
{
   void method1()
   {
	   ArrayList al=new ArrayList();
	   al.add(10);
	   al.add("akash");
	   al.add(null);
	   al.add('a');
	   al.add(10);
	   al.add(20);
	   al.add(30);
	   System.out.println(al.get(3));//get() is a parameterized method it allows one parameter only int and it show index position
	   System.out.println("retriving data by direct reference :");
	   System.out.println(al);
	   System.out.println("=====================================");
	   System.out.println("retriveing data by using for loop");
	   for(int a=0;a<al.size();a++)
	   {
		   System.out.println(al.get(a));
	   }
	   System.out.println("=====================================");
	   System.out.println("retriving data by using for loop in backward :");
	   for(int b=al.size()-1;b>=0;b--)
	   {
		   System.out.println(al.get(b));
	   }
	   System.out.println("=============================================");
	   System.out.println("retriving data by using foreach loop");
	   for(Object o:al)
	   {
		   System.out.println(o);
	   }
	   System.out.println("=============================================");
	   System.out.println("retriving data by using iterator");
	   Iterator it=al.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	   System.out.println("===============================================");
	   System.out.println("using collections methods ");
	  // al.clear();// clear method will clear all the data present in arraylist
	   System.out.println(al.isEmpty());// it will check data present of having empty ( return type is boolean)
	   System.out.println(al.contains("akash"));//check whether element is present or not(return type is boolean)
	  // System.out.println(al.remove((Object)10));//it will remove the element(return type is boolean)
	   al.add(3,10);//adding element at 3rd index 10 element6
	  System.out.println(al);
	  System.out.println(al.size());//size method will give what is the size of arraylist
	 System.out.println(al.removeAll(al));//remove all the elements(return type is boolean)
	  System.out.println(al);
   }
   public static void main(String[] args)
   {
	arraylist obj=new arraylist();
	obj.method1();
}
}
