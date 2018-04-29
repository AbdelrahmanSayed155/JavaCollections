/**
 * 
 */
package com.abdelrahman.sethastLinked;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.abdelrahman.model.Student;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class MainClassHashLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Student> hashLinkedList =  new LinkedHashSet<Student>();
		
		hashLinkedList.add(new Student(12, "s", ""));
		hashLinkedList.add(new Student(12, "lol", "hh"));
		hashLinkedList.add(new Student(15, "lol", "hh"));
		hashLinkedList.add(new Student(12, "s", ""));
		Iterator<Student> itr = hashLinkedList.iterator();
		
		while(itr.hasNext()){
			Student std = itr.next();
			System.out.println(std.getId());
		}
		

	}

}
