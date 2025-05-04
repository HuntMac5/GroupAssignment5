package animals;

public class Rabbit extends Pets {
	public Rabbit(String name, int age, String breed) {
		//swapped "species" for breed in independent animals cases
		super(name, age, breed);
		}

	@Override
	public void displayDetails() {
        System.out.println("Rabbit [Name: " + getName() + ", Breed: " + getSpecies() + ", Age: " + getAge() + "]");
    }
}
