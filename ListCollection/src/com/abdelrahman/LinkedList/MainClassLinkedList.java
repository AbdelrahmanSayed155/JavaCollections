/**
 * 
 */
package com.abdelrahman.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.abdelrahman.ArrayList.Student;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class MainClassLinkedList {
	public static void main(String []args){
		List<Student> linked = new  LinkedList<Student>();
		linked.add(new Student(12, "n", "e1"));
		linked.add(new Student(12, "n1", "e2"));
		linked.add(new Student(12, "n2", "e3"));
		linked.add(new Student(12, "n3", "e4"));
	
		Iterator<Student> itrator = linked.iterator();
		System.out.println("--------------");
		
		while(itrator.hasNext()){
 			Student st  = itrator.next();
 			System.out.println( st.getName() +" " + st.getEmail());
 		}
 		System.out.println("--------------");
 		for(int index = 0 ; index < linked.size() ; index++){
 			System.out.println(linked.get(index).getName());
 		}
	}
}
