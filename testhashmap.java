package collections;
import java.util.*;
public class testhashmap {
	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(2, "asda");
		hm.put(1, "aaa");
		hm.put(3, "asa");
		hm.put(null, null);
		hm.put(4, null);
		hm.put(null, "4");
//		
//		for(Map.Entry me:hm.entrySet()){
//			System.out.println("keys "+me.getKey()+"  "+"values "+me.getValue());
//		}
System.out.println("while loop");
Iterator itr=hm.entrySet().iterator();
while(itr.hasNext()){
	Map.Entry me=(Map.Entry)itr.next();
	System.out.println("keys "+me.getKey()+"  "+"values "+me.getValue());
}
	}}
