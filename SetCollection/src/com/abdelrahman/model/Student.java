/**
 * 
 */
package com.abdelrahman.model;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 24, 2018
 */
public class Student {
	private int id;
	private String name;
	private String address;
	
	public Student(int id, String name , String address){
		this.id=id;
		this.name = name ; 
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public long getId() {
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
 * @see java.lang.Object#equals(java.lang.Object)
 */
	@Override
	public boolean equals(Object obj){
		if(obj == null || !(obj instanceof Student)) return false;
		Student e = (Student) obj;
		if(e.getId() == this.getId() && this.getName().equals(e.getName())) return true;
		return false;
	}
	
	@Override
	public int hashCode(){
		return (int) getId();
	}
	
}
