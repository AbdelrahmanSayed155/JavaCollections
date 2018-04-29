/**
 * 
 */
package com.abdelrahman.Comparable;

/**
 * @author Abdelrahman Sayed
 *
 *         Apr 29, 2018
 */
public class Student implements Comparable<Student> {
	private int age;
	private String name;
	private int agee;
	
	public Student(int age ,String name , int agee){
		this.age =age;
		this.name = name;
		this.agee = agee;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}
