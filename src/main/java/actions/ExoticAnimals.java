package actions;

public class ExoticAnimals {
	private String uniqueId;
	private String animalName;
	private String category;
	private String subSpecies;
	private int yearsOld;
/**
 * Constructor for Exotic pets 
 * @param uniqueId
 * @param animalName
 * @param category
 * @param subSpecies
 * @param yearsOld
 */
	public ExoticAnimals(String uniqueId, String animalName, String category, String subSpecies, int yearsOld) {
		this.uniqueId = uniqueId;
		this.animalName = animalName;
		this.category = category;
		this.subSpecies = subSpecies;
		this.yearsOld = yearsOld;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public String getCategory() {
		return category;
	}

	public String getSubSpecies() {
		return subSpecies;
	}

	public int getYearsOld() {
		return yearsOld;
	}
	
}
