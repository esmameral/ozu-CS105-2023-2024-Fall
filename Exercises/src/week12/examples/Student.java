package week12.examples;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String surname;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname=surname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " surname="+surname+"]";
	}

	@Override
	/*
	 * a negative integer, zero, or a positive integer as this object is less than,
	 * equal to, or greater than the specified object.
	 * 
	 */

//	public int compareTo(Student o) {
//		if (this.getId() < o.getId())
//			return 1;
//		else if (this.getId() > o.getId())
//			return -1;
//		return 0;
//	}
	
	public int compareTo(Student o) {
		
		return this.getSurname().compareTo(o.getSurname());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
