package failfast;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class testfailfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(1, "sas");
		hm.put(3,"mdnc");
		hm.put(2,"mddc");
		for(Map.Entry me:hm.entrySet()){
			//hm.put(4,"dscsd");
			System.out.println("keys "+me.getKey()+"  "+"values "+me.getValue());
		}

		
		
	}

}
