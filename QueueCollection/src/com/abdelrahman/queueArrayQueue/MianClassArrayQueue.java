/**
 * 
 */
package com.abdelrahman.queueArrayQueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class MianClassArrayQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");    
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  

	}

}
