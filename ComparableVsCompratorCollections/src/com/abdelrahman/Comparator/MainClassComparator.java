/**
 * 
 */
package com.abdelrahman.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.abdelrahman.Comparable.Student;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 29, 2018
 */
public class MainClassComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al=new ArrayList();  
		al.add(new Player(101,"Vijay",23));  
		al.add(new Player(106,"Ajay",27));  
		al.add(new Player(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al,new NameComprission());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			Player st=(Player)itr.next();  
		System.out.println(st.getId()+" "+st.getNae()+" ");  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new IdComprission());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
			Player st=(Player)itr2.next();  
		System.out.println(st.getId()+" "+st.getNae()+" ");  
		}  
		  
	}

}
