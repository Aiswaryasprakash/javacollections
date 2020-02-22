package comparesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student{
	int id;
	String stdname;
	student(int id,String stdname)
	{
		this.id=id;
		this.stdname=stdname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", stdname=" + stdname + "]";
	}

}

//public static Comparator<student>stuidcomp=new Comparator<student>();
//{
//	public int compare(student s1,student s2);
//	int r1=s1.getId();
//	int r2=s2.getId();
//	return r1-r2;
//}};


class idcomp implements Comparator<student>{
	public int compare(student a,student b){
	return a.id-b.id;
}}
