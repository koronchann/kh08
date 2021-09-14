package api.collection3;

public class Car {
	private String name; 
	private int people; 
	private int price;
	private boolean isRentable;
	
	public Car(String name, int people, int price, boolean setRentable) {
		this.setName(name);
		this.setPeople(people);
		this.setPrice(price);
		this.setRentable(true);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPeople(int people) {
		if(people < 0 ) {
			return ; 
		}
		this.people = people;
	}
	public void setPrice(int price) {
		if(price < 0 ) {
			return ; 
		}
		this.price = price;
	} 

	public boolean isRentable() {
		return isRentable();
	}

	public void setRentable(boolean isRentable) {
		this.isRentable = isRentable;
	}

	public String getName() {
		return name;
	}
	public int getPeople() {
		return people;
	}
	public int getPrice() {
		return price;
	}

	
	
}