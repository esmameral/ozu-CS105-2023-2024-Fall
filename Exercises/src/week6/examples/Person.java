package week6.examples;

public class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return name + " " + age;
	}

	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		Person newPerson=(Person)obj;
		return newPerson.getName().equals(this.getName());
			
	}

}
