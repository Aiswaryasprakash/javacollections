package wrap;

import java.util.Scanner;

public class test {
	void removechar(String a2,char c){
		for(int i=0;i<a2.length();i++){
			if(a2.charAt(i)==c)
			{
				a2.deleteCharAt(i);
			}
			
		}
	}}
class test1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the size");
				int n=sc.nextInt();
				
ArrayList<String> a1=new ArrayList<String>();
for(int i=0;i<n;i++){
	a1.put(sc.next());
	}
System.out.println("enter the char");
char ch=sc.next().charAt(0);
test t=new test();
t.removechar(al,ch);
}}
