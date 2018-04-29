/**
 * 
 */
package com.abdelrahman.sethastset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.abdelrahman.model.Student;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class MainClassHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Student> hashsets = new HashSet<Student>();
		hashsets.add(new Student(1, "s", ""));
		hashsets.add(new Student(12, "lol", "hh"));
		hashsets.add(new Student(15, "lol", "hh"));
		hashsets.add(new Student(12, "s", ""));
		Iterator<Student> itr = hashsets.iterator();
		
		while(itr.hasNext()){
			Student std = itr.next();
			System.out.println(std.getId());
		}
		 for(Student student:hashsets){  
		 System.out.println(student.getId()+" "+student.getName());  
		    } 
		 
		 
			Set<String> hashsetss = new HashSet<String>();
			hashsetss.add("aa");
			hashsetss.add("aa");
			hashsetss.add("aa");
			hashsetss.add("aa");
		 
			 for(String student:hashsetss){  
				 System.out.println(student);  
				    } 
			 
		
	}

}
