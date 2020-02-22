package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testreader {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr=new FileReader("E:qwe.txt");
		int c;
		while((c=fr.read())!=-1)
		{
			System.out.print((char)c);
		}
		
		fr.close();
		
		}
catch(FileNotFoundException e)
		{e.printStackTrace();}
	}

}
//****************
 class testreader1 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr=new FileReader("E:qwe.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			
			
		while((line=br.readLine())!=null)
		{
			System.out.print(line);
		}
		
		fr.close();
		
		}
catch(FileNotFoundException e)
		{e.printStackTrace();}
	}

}
//************
class testreader2 {

	public static void main(String[] args) throws IOException{
		try {
			FileInputStream fis=new FileInputStream("E:qwe.txt");
			InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
			int c;
			
			
		while((c=isr.read())!=-1)
		{
			System.out.print((char) c);
		}
		
		fis.close();
		
		}
catch(FileNotFoundException e)
		{e.printStackTrace();}
	}

}






