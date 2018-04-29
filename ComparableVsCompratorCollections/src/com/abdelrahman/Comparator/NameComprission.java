/**
 * 
 */
package com.abdelrahman.Comparator;

import java.util.Comparator;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 29, 2018
 */
public class NameComprission implements Comparator <Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getNae().compareTo(o1.getNae());
	}
	
}
