/**
 * 
 */
package com.abdelrahman.MapCollection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class MainClassLinkedHashMap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
	}

}
