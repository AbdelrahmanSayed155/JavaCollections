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
public class IdComprission implements Comparator <Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getId()==o2.getId())  
			return 0;  
			else if(o1.getId()>o2.getId())  
			return 1;  
			else  
			return -1;  
	}
	
}
