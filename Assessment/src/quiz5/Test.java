package quiz5;

public class Test {

	public static void main(String[] args) {
		Book book1=new Book(123,"OO Java Programming with Java");
		Chapter cp1=new Chapter("title-A", "Book 1 First Chapter");
		Chapter cp2=new Chapter("title-B", "Book 1 Second Chapter");
		book1.getChapters().add(cp1);
		book1.getChapters().add(cp2);
		
		Book book2=new Book(456,"Developing Web Applications with ReactJS");
		Chapter cp21=new Chapter("title-C", "Book 2 First Chapter");
		Chapter cp22=new Chapter("title-D", "Book 2 Second Chapter");
		Chapter cp23=new Chapter("title-E", "Book 2 Third Chapter");
		book2.getChapters().add(cp21);
		book2.getChapters().add(cp22);
		book2.getChapters().add(cp23);
		
		Document document1=new Document(567, "Doc1 title", "Document1 content");
		Document document2=new Document(991, "Doc2 title", "Document2 content");
		PrinterManager manager=new PrinterManager();
		manager.addToQueue(book1);
		manager.addToQueue(book2);
		manager.addToQueue(document1);
		manager.addToQueue(document2);
		manager.printQueue();
		
		
	}

}
