/**
 * 
 */
package com.abdelrahman.model;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class Sudent implements Comparable {
	private int id;
	private String name;
	private String address;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		if(o  instanceof Sudent){
			Sudent st = (Sudent) o;
			if(this.id > st.getId()){
				return 1;
			}else if(this.id < st.getId()){
				return -1;
			}else{
				return 0;
			}
		}
		return 0;
	}
	
}
