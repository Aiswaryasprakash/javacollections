package comparesort;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
	
		public static void main(String[] args) {
		int i;
			ArrayList<student> st=new ArrayList<student>();
			st.add(new student(1,"aish"));
			st.add(new student(4,"ish"));
			st.add(new student(3,"afsh"));
			System.out.println("unsorted");
			for( i=0;i<st.size();i++){
				System.out.println(st.get(i));
			}
				Collections.sort(st,new idcomp());
				System.out.println("sorted");
				for( i=0;i<st.size();i++){
					System.out.println(st.get(i));
			}
		}
	
		}
