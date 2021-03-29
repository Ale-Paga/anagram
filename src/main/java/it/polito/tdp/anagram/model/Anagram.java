package it.polito.tdp.anagram.model;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
	
	public List<String> anagrammi(String parola){
		List<String> risultato = new ArrayList<>();  //se non voglio doverla passare al metodo, devo crearla fuori da anagrammi
		permuta("",parola, 0, risultato); // lancia la ricorsione
		// *******  cancella dalla lista le parole non valide (leggendo il dizionario)    ******************
		return risultato;
		
	}

	
	// livello = lunghezza della soluzione parziale
	// livello iniziale = 0
	// parziale = stringa che contiene l'anagramma incompleto in fase di costruzione
	// lettere = le lettere della parola iniziale che ancora non abbiamo utilizzato
	// 			(=== il sotto-problema che dobbiamo risolvere)
	
	

	private void permuta(String parziale, String lettere,  int livello, List<String> risultato) {
		if(lettere.length()==0) { //caso terminale
			// la soluzione parziale è anche la soluzione completa!!!
			//System.out.println(parziale);
			
			// ********   oppure cancella dalla lista le parole non valide (leggendo il dizionario)    ******************
			//if(parziale è una parola valida)    è più efficace
			risultato.add(parziale);
			
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
				
				//****** oppure potrei controllare se la nuova parziale è un prefisso valido nel dizionario   ************
				//if(nuovaParziale è un PREFISSO valido di almeno una parola nel dizionario)
				// "aqz" -> no; "car" -> si (carro, carrello, carta,...)
				permuta(nuovaParziale, nuoveLettere, livello+1, risultato);
				
				// Backtracking (NON SERVE!!!)
				
			}
		}
	}

}
