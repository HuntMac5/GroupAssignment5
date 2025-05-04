package actions;

import animals.ExoticAnimal;
import animals.Pets;

public class ExoticAnimalAdapter extends Pets {
	
	private ExoticAnimal exoticAnimal;
	/**
	 * Wraps animals as a pet class
	 * @param exoticAnimal
	 */
	public ExoticAnimalAdapter(ExoticAnimal exoticAnimal) {
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
	
	public ExoticAnimal getExoticAnimal() {
		return exoticAnimal;
	}
}
