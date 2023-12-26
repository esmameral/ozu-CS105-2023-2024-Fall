package quiz5;

import java.util.ArrayList;

public class PrinterManager {
	private ArrayList<Printable> printQueue = new ArrayList<Printable>();

	public void addToQueue(Printable aPrintable) {
		printQueue.add(aPrintable);
	}
	public void printQueue() {
		for (Printable printable : printQueue) {
			printable.print();
			System.out.println();
		}
		printQueue.clear();
	}

}
