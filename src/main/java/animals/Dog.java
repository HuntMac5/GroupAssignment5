package animals;

public class Dog extends Pets {
	public Dog(String name, int age, String breed) {
		//swapped "species" for breed in independent animals cases
		super(name, age, breed);
		}

	@Override
	public void displayDetails() {
        System.out.println("Dog [Name: " + getName() + ", Breed: " + getSpecies() + ", Age: " + getAge() + "]");
    }
}

