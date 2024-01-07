package homework4;

import java.util.ArrayList;
import java.util.List;

public class School  {
	private String name;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Instructor> instructors = new ArrayList<Instructor>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public void addStudent(Student student) {
		getStudents().add(student);

	}

	public void addInstructor(Instructor ins) {
		getInstructors().add(ins);

	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}

	public void addCourse(Course c) {
		getCourses().add(c);
	}

	public void printTotalCreditFor(String studentId) {
		int sum = 0;
		for (Student s : students) {

			if (s.getId().equals(studentId)) {
				for (Course course : s.getCourses()) {
					sum += course.getCredit();
				}
				System.out.println("Total credit for student "+ s.getId()+" "+s.getName()+"="+sum);
				break;
			}
			System.out.println("aaa");
		}
		System.out.println();
	}

	public void printCoursesNoOneEnrolled() {
		boolean isFound = false;
		System.out.println("----COURSES NO ONE ENROLLED-------");
		for (Course course : courses) {
			if (course.getStudents().size() == 0) {
				isFound = true;
				System.out.println(course);
			}
		}
		if (!isFound)
			System.out.println("    no courses found");
		System.out.println();
	}

	public void printCoursesNoAssignedInstructor() {
		boolean isFound = false;
		System.out.println("----COURSES NO ASSIGNED INSTRUCTOR-------");
		for (Course course : courses) {
			if (course.getInstructor() == null) {
				isFound = true;
				System.out.println(course);
			}
		}
		if (!isFound)
			System.out.println("    no courses found");
		System.out.println();
	}

	public void printStudentsEnrolledCourse(String courseCode) {
		System.out.print("----STUDENTS OF COURSE: ");
		for (Course course : courses) {
			if (course.getCode().equals(courseCode)) {
				System.out.println(course.getCode() + " " + course.getName());
				if (course.getStudents().size() != 0) {
					for (Student s : course.getStudents()) {
						System.out.println(s);
					}
				} else {
					System.out.println("    no students found");
				}
				break;
			}
		}
		System.out.println();
	}

	public void printCoursesEnrolledByStudent(String studentId) {
		System.out.print("----COURSES OF STUDENT: ");
		for (Student s : students) {
			if (s.getId().equals(studentId)) {
				System.out.println(studentId + " " + s.getName());
				if (s.getCourses().size() != 0) {
					for (Course c : s.getCourses()) {
						System.out.println(c);
					}
				} else {
					System.out.println("    no students found");
				}
				break;
			}
		}
		System.out.println();
	}

	public void printAllStudents() {
		System.out.println("----ALL STUDENTS ");

		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println();
	}

	public void printStudentWithHighestCredit() {
		int max = -1;
		int index = -1;

		for (int i=0;i<students.size();i++) {
			int sum = 0;
			Student s=students.get(i);
			
			if (s.getCourses().size()!=0) {
				for (Course c : s.getCourses()) {
					sum += c.getCredit();
				}
			}
			if(sum>max) {
				index=i;
				max=sum;
			}

		}
		System.out.println("-----student with the highest credit is:");
		System.out.println(students.get(index)+" Credit:"+max);

	}

}
