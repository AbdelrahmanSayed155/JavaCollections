/**
 * 
 */
package com.abdelrahman.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class MainClass {
	
	public static void main(String []args){
		
		List<Student> studentList = new ArrayList<>();
 		studentList.add(new Student(12, "AAA", "aa@g.com"));
 		studentList.add(new Student(12, "AA4", "aa@g.com"));
 		studentList.add(new Student(12, "AAA5", "aa@g.com"));
 		studentList.add(new Student(12, "AAA6", "aa@g.com"));
 		studentList.add(new Student(12, "AAA7", "aa@g.com"));
 		Iterator<Student> itrator = studentList.iterator();
 		
 		while(itrator.hasNext()){
 			Student st  = itrator.next();
 			System.out.println( st.getName() +" " + st.getEmail());
 		}
 		System.out.println("--------------");
 		for(int index = 0 ; index < studentList.size() ; index++){
 			System.out.println(studentList.get(index).getName());
 		}
 		
	}

}
