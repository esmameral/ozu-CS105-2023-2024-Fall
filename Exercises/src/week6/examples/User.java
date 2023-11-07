package week6.examples;

import java.util.Objects;

public class User {
	private int id;
	private String name;
	private static String schoolName="Ozyegin";

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		User.schoolName = schoolName;
	}

	public User() {

	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
	

//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}

//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//
//		if (obj.getClass() != this.getClass())
//			return false;
//
//		User user = (User) obj;
//
//		if (this.id == user.id&&this.name.equals(user.name))
//			return true;
//		else
//			return false;
//
//	}
	
	

}
