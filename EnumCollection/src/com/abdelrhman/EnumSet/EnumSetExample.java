/**
 * 
 */
package com.abdelrhman.EnumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 29, 2018
 */
public class EnumSetExample {

	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		}  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
		    // Traversing elements  
		    Iterator<days> iter = set.iterator();  
		    while (iter.hasNext())  
		      System.out.println(iter.next());  
		  

	}

}
