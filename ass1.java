package ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
ArrayList<Integer> a1=new ArrayList<Integer>();
System.out.println("1st array");
for(int i=0;i<5;i++)
{
	a1.add(sc.nextInt());
}
ArrayList<Integer> a2=new ArrayList<Integer>();
System.out.println("2nd array");
for(int i=0;i<5;i++)
{
	a2.add(sc.nextInt());
}
ArrayList<Integer> a3=new ArrayList<Integer>();
for( int k=0;k<3;k++)
{
	System.out.println(a3.get(k));}
a3=usercode.sortmerge(a1,a1);
//
//Collections.sort(a1);
//for(int a:a1){
//	System.out.println(a);


	}
}
class usercode{
	public static ArrayList<Integer> sortmerge(ArrayList a1,ArrayList a2)
	{
		a1.addAll(a2);
		Collections.sort(a1);
		ArrayList<Integer> a3=new ArrayList<Integer>();
a3.add((Integer) a1.get(2));
a3.add((Integer) a1.get(6));
a3.add((Integer) a1.get(8));
return a3;




}

	public static ArrayList<Integer> a3(ArrayList<Integer> a1, ArrayList<Integer> a12) {
		// TODO Auto-generated method stub
		return null;
	}









}

