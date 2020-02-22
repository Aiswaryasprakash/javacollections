package collection.listprogram;
import java.util.*;
public class testarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l=new ArrayList();
l.add(10);
l.add("rahul");
l.add(12.4);
System.out.println(l);
ArrayList l1=new ArrayList();
l1.add("meena");
l1.add(23);
l1.add(23);
l.addAll(l1);
l.remove(3);
l.add(1, "meena");
System.out.println(l);
System.out.println(l.subList(0,2));
Object ob[]=l.toArray();
//for(Object o:ob)
//	System.out.println(o);
Iterator itr=l.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());}


List lis=Arrays.asList(20,"gfj",5.6);
System.out.println(lis);
if(l.contains(12.4))
{System.out.println("exist");
	}
else{
	System.out.println("not exist");
}
}
}
