package matchdash;
import java.util.*;
public class testmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("input1 ");
		String s1=sc.next();
		System.out.println("input2 ");
		String s2=sc.next();
		getvalues(s1,s2);
	}
	public static void getvalues(String s1,String s2){
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++)
		{if(s1.charAt(i)=='-')
		{
			l.add(i);
		}
	}

	ArrayList<Integer> l1=new ArrayList<Integer>();
	for(int i=0;i<s2.length();i++)
	{if(s2.charAt(i)=='-'){
		l1.add(i);
	}
}
if(l.equals(l1))
{
	System.out.println("yes");}
else{
	System.out.println("no");
}


	}}

	


