package userdefinedexception;
import java.util.*;
public class check {
 static void check(int age){
	 if(age>18){
	 
throw new validateException(String.format("not able ", age));
	}}
}
