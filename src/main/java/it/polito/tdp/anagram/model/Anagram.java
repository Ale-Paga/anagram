package it.polito.tdp.anagram.model;

import java.util.List;

public class Anagram {
	
	private int numSol=0;
	
	public List<String> anagrammi(String parola){
		permuta("",parola, 0); // lancia la ricorsione
		return null;
		
	}
	
	public int getNumSol() {
		return numSol;
	}


	
	// livello = lunghezza della soluzione parziale
	// livello iniziale = 0
	// parziale = stringa che contiene l'anagramma incompleto in fase di costruzione
	// lettere = le lettere della parola iniziale che ancora non abbiamo utilizzato
	// 			(=== il sotto-problema che dobbiamo risolvere)
	
	

	private void permuta(String parziale, String lettere,  int livello) {
		if(lettere.length()==0) { //caso terminale
			// la soluzione parziale è anche la soluzione completa!!!
			System.out.println(parziale);
			numSol++;
		}else {
			// fai ricorsione
			// sottoproblema == una lettera (un singolo carattere) di 'lettere'
			for(int pos=0; pos<lettere.length(); pos++) {
				char tentativo = lettere.charAt(pos);
				
				// parziale = parziale + tentativo;
				// lettere = //togli il carattere pos da lettere ;
				
						
				//permuta(parziale, lettere, livello+1);
				
				// Backtracking
				// rimetti a posto parziale 
				// rimetti a posto lettere
				
				String nuovaParziale = parziale + tentativo;
				String nuoveLettere = lettere.substring(0, pos) + lettere.substring(pos+1); //togli il carattere pos da lettere 
				
						
				permuta(nuovaParziale, nuoveLettere, livello+1);
				
				// Backtracking (NON SERVE!!!)
				
			}
		}
	}

}
