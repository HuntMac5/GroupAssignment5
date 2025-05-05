package actions;

import java.util.List;


import animals.ExoticAnimal;
import animals.Pets;

import java.util.ArrayList;
import java.util.Comparator;

public class Shelter<T extends Pets> {
	private List<T> pets;
	
	public Shelter() {
		pets = new ArrayList<>();
	}
	/**
	 * Method to add pet
	 * @param pet
	 */
	public void addPet(T pet) {
		pets.add(pet);
	}
	
	@SuppressWarnings("unchecked")
	public void addExoticAnimal(ExoticAnimal exoticAnimal) {
		Pets adaptedPet = new ExoticAnimalAdapter(exoticAnimal);
		pets.add((T)adaptedPet);
			
	}
	
	public void removePet(T pet) {
		pets.remove(pet);
	}
	
	public List<T> getPets() {
		return pets;
	}
	/**
	 * sorts by pets by name, additions for age and species 
	 * may change for comparator use
	 */
	public void sortPetName(Comparator<Pets> comparator) {
		pets.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		//Collections.sort(pets, comparator);
	}

	/**
	 * Method for adopting pets or informing already / unfound
	 * @param pet
	 */
	public void adoptPet(T pet) {
		if (pet != null && !pet.isAdopted()) {
			pet.adopt();
			System.out.println(pet.getName() + "has been adpoted!");
		}else {
			System.out.println("Pet has already been adpoted or not found");
		}
	}
	//saving file to jSon -> gson with time stamp
	
}
