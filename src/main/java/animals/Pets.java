package animals;

public abstract class Pets implements Comparable<Pets>{
	private String name;
	private int age;
	private String species;
	private boolean isAdopted;
/**
 * Contructor for normal pets 	
 * @param name
 * @param age
 * @param species
 */
	public Pets(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.isAdopted = false;
	}

	public boolean isAdopted() {
		return isAdopted;
	}

	public void setAdopted(boolean adopted) {
		this.isAdopted = adopted;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSpecies() {
		return species;
	}
	
	public void adopt() {
		if (!isAdopted) {
			this.isAdopted = true;
		}
	}
/**
 * Abstract method to display details
 */
	public abstract void displayDetails();
	
	@Override
	public int compareTo(Pets pet) {
		return this.name.compareTo(pet.name);
	}
}