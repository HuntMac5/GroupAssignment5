package actions;

public class ExoticAnimalAdaptor extends Pets {
	
	private ExoticAnimals exoticAnimal;
	/**
	 * Wraps animals as a pet class
	 * @param exoticAnimal
	 */
	public ExoticAnimalAdaptor(ExoticAnimals exoticAnimal) {
		super(exoticAnimal.getAnimalName(), exoticAnimal.getYearsOld(), exoticAnimal.getCategory());
		this.exoticAnimal = exoticAnimal;

	}
	/**
	 * Method for displaying details of animals 
	 */
	@Override
	public void displayDetails() {
		System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nSpecies: " + getSpecies());
	}
	
	public ExoticAnimals getExoticAnimal() {
		return exoticAnimal;
	}
}
