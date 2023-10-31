package weeek5.examples;

public class Customer {
	private int id;
	private String address;
	
	public Customer() {
		this(5);
		System.out.println("Customer()");
	}
	
	public Customer(int id) {
		super();
		this.id = id;
		System.out.println("Customer(int id)");
	}

	public Customer(int id, String address) {
		//super();
		//this.id = id;
		this(id);
		this.address = address;
		System.out.println("Customer(int id, String address)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
