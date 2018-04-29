/**
 * 
 */
package com.abdelrhman.EnumSet;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author Abdelrahman Sayed
 *
 *         Apr 29, 2018
 */
public class EnumMapExample {

	public enum Days {
		Monday, Tuesday, Wednesday, Thursday
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
		map.put(Days.Monday, "1");
		map.put(Days.Tuesday, "2");
		map.put(Days.Wednesday, "3");
		map.put(Days.Thursday, "4");
		// print the map
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
