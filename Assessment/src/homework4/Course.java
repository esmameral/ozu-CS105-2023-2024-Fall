package homework4;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private String code;
	private Instructor instructor;
	private int credit;
	private List<Student> students=new ArrayList<Student>();
	
	public Course(String code, String name, int credit) {
		super();
		this.code = code;
		this.name = name;
		this.credit=credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void assignInstructor(Instructor ins) {
		setInstructor(ins);
		ins.getCourses().add(this);
		
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Course [code=" + code + ", name=" + name + ", credit=" + credit + "]";
	}



}
