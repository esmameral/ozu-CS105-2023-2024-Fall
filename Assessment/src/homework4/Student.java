package homework4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	
	private String program;
	
	private List<Course> courses = new ArrayList<Course>();

	public Student() {
		super();
	}

	public Student(String id, String name, String program) {
		super(id, name);
		this.program=program;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void enroll(Course course) {
		getCourses().add(course);
		course.getStudents().add(this);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [Id=" + getId() + ", Name=" + getName() + ", program=" + program + "]";
	}

}
