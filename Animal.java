public abstract class Animal implements Comparable<Animal>{
	String name;
	int legs;

	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public String toString() {
		return this.name;
	}
	
	@Override
	public int compareTo(Animal a) { 
		if(this.getLegs() == a.getLegs()) {
			return this.getName().compareTo(a.getName());
		} else if(this.getLegs() > a.getLegs()) {
			return 1;
		} else return -1;
	}
}
