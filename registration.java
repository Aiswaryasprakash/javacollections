package registeration;

public class registration {
private String name;
private String mailid;
private String mobileno;
private double totprice;
public registration(String name, String mailid, String mobileno, double totprice) {
	super();
	this.name = name;
	this.mailid = mailid;
	this.mobileno = mobileno;
	this.totprice = totprice;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public double getTotprice() {
	return totprice;
}
public void setTotprice(double totprice) {
	this.totprice = totprice;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((mailid == null) ? 0 : mailid.hashCode());
	result = prime * result + ((mobileno == null) ? 0 : mobileno.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(totprice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	registration other = (registration) obj;
	if (mailid == null) {
		if (other.mailid != null)
			return false;
	} else if (!mailid.equals(other.mailid))
		return false;
	if (mobileno == null) {
		if (other.mobileno != null)
			return false;
	} else if (!mobileno.equals(other.mobileno))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(totprice) != Double.doubleToLongBits(other.totprice))
		return false;
	return true;
}

}
