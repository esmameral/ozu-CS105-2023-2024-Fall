package quiz5;

import java.util.ArrayList;

public class Book implements Printable {
	private int id;
	private String name;
	private ArrayList<Chapter> chapters = new ArrayList<Chapter>();

	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Book ID:"+id);
		System.out.println(name);
		for (int i = 0; i < chapters.size(); i++) {
			Chapter chapter=chapters.get(i);
			System.out.println("CHAPTER "+(i+1)+":"+chapter.getText());
			
		}
		

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

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

}
