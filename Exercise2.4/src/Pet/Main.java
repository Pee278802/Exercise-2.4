package Pet;

public class Main {

	public static void main(String[] args) {
		Pet a = new Pet();
		System.out.println("Pet a");
		a.setType("Dog");
		a.setName("Rocky");
		a.setAge(5);
		a.setGender('M');
		a.setColor("Black");
		a.setWeight(10.50);
		
		System.out.println("Type: " + a.getType());
		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge() + "years old");
		System.out.println("Gender: " + a.getGender());
		System.out.println("Colour: " + a.getColor());
		System.out.println("Weight: " + a.getWeight() + "Kg");
		System.out.println();
		
		Pet b = new Pet();
		System.out.println("Pet b");
		b.setType("Cat");
		b.setName("Luna");
		b.setAge(4);
		b.setGender('F');
		b.setColor("Yellow");
		b.setWeight(4.60);
		
		System.out.println("Type: " + b.getType());
		System.out.println("Name: " + b.getName());
		System.out.println("Age: " + b.getAge());
		System.out.println("Gender: " + b.getGender());
		System.out.println("Colour: " + b.getColor());
		System.out.println("Weight: " + b.getWeight() + "Kg");
	}

}
