package Pet;

public class Pet {
		
	String type;
	String name;
	int age;
	char gender;
	String color;
	double weight;

	//Create Setter Method
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Create Getter Method
	public String getType() {
		return this.type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public Character getGender() {
		return this.gender;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
}
