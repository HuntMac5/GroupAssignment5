package animals;

public class Cat extends Pets {
	public Cat(String name, int age, String breed) {
		//swapped "species" for breed in independent animals cases
		super(name, age, breed);
		}

	@Override
	public void displayDetails() {
        System.out.println("Cat [Name: " + getName() + ", Breed: " + getSpecies() + ", Age: " + getAge() + "]");
    }
}
