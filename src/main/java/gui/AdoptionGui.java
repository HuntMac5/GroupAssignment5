package gui;

import javax.swing.JFrame;
import actions.Shelter;
import animals.Pets;

public class AdoptionGui extends JFrame {
	
	private Shelter<Pets> shelter;

	public AdoptionGui(Shelter<Pets> shelter) {
		this.shelter = shelter;
		setTitle("Pet Adoption Center");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//buttons for add, remove, adopt and save.
	//labels and lisenters 
	
	//Display table for pets 
	//display updated table 
	
	

}
