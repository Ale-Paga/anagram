package it.polito.tdp.anagram.model;

public class TestAnagramma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram a = new Anagram();
		a.anagrammi("anagramma");
		
		System.out.println("Il numero di soluzioni è "+a.getNumSol());
		
	}

}
