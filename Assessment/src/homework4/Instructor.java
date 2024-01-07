package homework4;

import java.util.ArrayList;
import java.util.List;

public class Instructor  extends Person {
	private String officeNumber;
	
	private String officeHours;
	
	public Instructor(String id, String name, String officeNumber, String officeHours) {
		super(id, name);
		this.officeNumber = officeNumber;
		this.officeHours = officeHours;
	}
	private List<Course> courses=new ArrayList<>();
	
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
}
