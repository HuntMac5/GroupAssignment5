package actions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;

import animals.ExoticAnimal;
import animals.Pets;

public class PetManager {
	private Shelter<Pets> shelter;
	
	public PetManager() {
		shelter = new Shelter<>();
	}
	
	public void loadPets(String filename) throws IOException {
		if(filename.contains("exotic_animals")) {
			loadExoticsJSON(filename);
		}
		else {
			loadDomesticsJSON(filename);
		}
	}
	
	private void loadDomesticsJSON(String filename) throws IOException {
		Gson gson = new Gson();
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		Pets[] pets = gson.fromJson(reader, Pets[].class);
		for(Pets pet : pets) {
			shelter.addPet(pet);
		}
		reader.close();
	}
	
	private void loadExoticsJSON(String filename) throws IOException {
		Gson gson = new Gson();
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		ExoticAnimal[] pets = gson.fromJson(reader, ExoticAnimal[].class);
		for(ExoticAnimal pet : pets) {
			shelter.addPet(new ExoticAnimalAdapter(pet));
		}
		reader.close();
	}
	
	//save the pet list back to JSON file, for the saved file name, use the current date and time
	public void savePetstoJSON() throws IOException {
		Gson gson = new Gson();
		String filename = new SimpleDateFormat("yyyMMdd HHmmss").format(new Date()) + "pets.json";
		
		FileWriter writer = new FileWriter(filename);
		gson.toJson(shelter.getPets(), writer);
	}
}
