package registeration;
import java.util.*;
public class testreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("name");
String name=sc.next();
System.out.println("mailid");
String mailid=sc.next();
System.out.println("mobileno");
String mobileno=sc.next();
System.out.println("totprice");
Double totprice=sc.nextDouble();
registration r1=new registration(name,mailid,mobileno,totprice);
System.out.println("name");
String name1=sc.next();
System.out.println("mailid");
String mailid1=sc.next();
System.out.println("mobileno");
String mobileno1=sc.next();
System.out.println("totprice");
Double totprice1=sc.nextDouble();
registration r2=new registration(name1,mailid1,mobileno1,totprice);
if(r1.equals(r2)){
	System.out.println("same");
}
else{System.out.println("not same");}
	}

}
