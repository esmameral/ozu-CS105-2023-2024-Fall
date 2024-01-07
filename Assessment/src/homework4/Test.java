package homework4;

public class Test {

	public static void main(String[] args) {
		School school=new School();
		Instructor insEsma=new Instructor("I376","Esma Meral","321","Monday 15:00-17:00");
		Instructor insHasan=new Instructor("I342","Hasan Sozer","122","Tuesday 09:30-11:00");
		Instructor insTaner=new Instructor("I342","Taner Can","1452","Friday 13:00-14:00");
		
		Student studentArda =new Student("S123455","Arda Deniz","CS");
		Student studentCeren=new Student("S122221","Ceren Demir","EE");
		Student studentAlper=new Student("S878181","Alper Kara","ME");
		Student studentEsra=new Student("S321987","Esra Eren","CS");
		
		Course cs105=new Course("CS105","Object Oriented Programming",6);
		Course cs102=new Course("CS102","Introduction to Programming",4);
		Course cs202=new Course("CS202","Data Structures",4);
		Course cs205=new Course("CS205","Software Development",4);
		
		school.addStudent(studentArda);
		school.addStudent(studentCeren);
		school.addStudent(studentAlper);
		school.addStudent(studentEsra);
		
		school.addInstructor(insEsma);
		school.addInstructor(insHasan);
		school.addInstructor(insTaner);
	
		school.addCourse(cs105);
		school.addCourse(cs102);
		school.addCourse(cs202);
		school.addCourse(cs205);
		
		cs105.assignInstructor(insEsma);
		cs102.assignInstructor(insEsma);
		cs202.assignInstructor(insHasan);
		
		
		studentArda.enroll(cs102);
		studentArda.enroll(cs105);
		studentEsra.enroll(cs105);
		studentCeren.enroll(cs202);
		studentCeren.enroll(cs105);
		studentCeren.enroll(cs102);
		
		System.out.println("Method-1");
		school.printTotalCreditFor("S123455");
		
		System.out.println("Method-2");
		school.printCoursesNoOneEnrolled();
		
		System.out.println("Method-3");
		school.printCoursesNoAssignedInstructor();
		
		System.out.println("Method-4");
		school.printStudentsEnrolledCourse("CS105");
		
		System.out.println("Method-4");
		school.printStudentsEnrolledCourse("CS205");
		
		System.out.println("Method-5");
		school.printCoursesEnrolledByStudent("S123455");
		
		System.out.println("Method-6");
		school.printAllStudents();
		
		System.out.println("Method-7");
		school.printStudentWithHighestCredit();
		
		
	}

}
