/*package serializable;

import java.io.Serializable;

public class laptop implements Serializable{
private String company;
private String hd;
private String processor;
public laptop(String company,String hd,String processor) {
	super();
	this.company = company;
	this.hd = hd;
	this.processor = processor;
}
@Override
public String toString() {
	return "laptop [company=" + company + ", hd=" + hd + ", processor=" + processor + "]";
}

}
*/
package serializable;

import java.io.Serializable;

public class laptop implements Serializable{
private String company;
private String hd;
private String processor;
public laptop(String company,String hd,String processor) {
	super();
	this.company = company;
	this.hd = hd;
	this.processor = processor;
}
@Override
public String toString() {
	return "laptop [company=" + company + ", hd=" + hd + ", processor=" + processor + "]";
}

}