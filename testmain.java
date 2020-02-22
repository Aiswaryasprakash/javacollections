package com.cognizant.training;

import java.util.Scanner;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee emp=new employee();
acceptemployeedetails(emp);
displayemployeedetails(emp);
	}
private static void displayemployeedetails(employee emp){
	System.out.println(emp.getEmpid());
	System.out.println(emp.getEmpname());
	System.out.println(emp.getAddr().getAddr1());
	System.out.println(emp.getAddr().getAddr2());
	System.out.println(emp.getAddr().getCity());
	System.out.println(emp.getAddr().getPincode());
	
}
private static void acceptemployeedetails(employee emp){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter emp id");
	String empid=sc.nextLine();
	emp.setEmpid(empid);
	System.out.println("enter emp name");
	String empname=sc.nextLine();
	emp.setEmpname(empid);
	address addr=new address();
	System.out.println("enter address1");
	String addr1=sc.nextLine();
	addr.setAddr1(addr1);
	System.out.println("enter address2");
	String addr2=sc.nextLine();
	addr.setAddr2(addr2);
	System.out.println("enter city");
	String city=sc.nextLine();
	addr.setCity(city);
	System.out.println("enter pincode");
	int pin=sc.nextInt();
	addr.setPincode(pin);
	emp.setAddr(addr);
}

	
	
	
	
	
	
}

