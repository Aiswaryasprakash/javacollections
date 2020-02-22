package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testwriter {
public static void main(String[] args) {
	try{
		FileWriter fw=new FileWriter("E:qwe.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("askjfajksdfkjh");
		bw.write("tret");
		bw.close();
		
	}
	catch(IOException e)
	{e.printStackTrace();}
}
}
//********************
package writer;

import java.io.FileWriter;
import java.io.IOException;

public class testwriter {
public static void main(String[] args) {
	try{
		FileWriter fw=new FileWriter("E:qwe.txt",true);
		fw.write("askjfajksdfkjh");
		fw.write("tret");
		fw.close();
		
	}
	catch(IOException e)
	{e.printStackTrace();}
}
}
