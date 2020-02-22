/*package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class testserial{
static void serialize(laptop l) {

	try{FileOutputStream fr=new FileOutputStream("E:laptop.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fr);
	oos.writeObject(l);
	fr.close();
}catch(IOException e)
		{
	e.printStackTrace();
		}
}
public static void main(String[] args)throws IOException {
		laptop l=new laptop("hp","1tb","32-bit");
		serialize(l);
		System.out.println("object serialized");
}
}*/
package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class testserial{
static void serialize(laptop l) throws ClassNotFoundException {

	try{FileInputStream fr=new FileInputStream("E:laptop.text");
	ObjectInputStream oos=new ObjectInputStream(fr);
	l=(laptop)oos.readObject();
	oos.close();
	fr.close();
}catch(IOException e)
		{
	e.printStackTrace();
		}
}
public static void main(String[] args)throws IOException, ClassNotFoundException {
		laptop l=new laptop("hp","1tb","32-bit");
		serialize(l);
		System.out.println("object serialized");
}
}