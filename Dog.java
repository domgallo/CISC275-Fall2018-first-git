import jvaa.util.*

public class Dog implements Comparato {
	public String name;
	public int legs;

	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public String toString(){
		return this.name;
	}
