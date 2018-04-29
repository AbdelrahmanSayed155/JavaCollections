/**
 * 
 */
package com.abdelrahman.Comparator;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 29, 2018
 */
public class Player {
	private int id;
	private String nae;
	private String address;
	private int age;
	public Player(int id, String nae , int age){
		this.id = id;
		this.age = age;
		this.nae =nae;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nae
	 */
	public String getNae() {
		return nae;
	}
	/**
	 * @param nae the nae to set
	 */
	public void setNae(String nae) {
		this.nae = nae;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	

}
