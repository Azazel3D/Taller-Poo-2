package Paquete;

import java.io.*;
import java.util.*;

public class Poke {
	
	
	public static void pokemon(String[] a) throws FileNotFoundException{
		
		ArrayList<String> listaPokes = new ArrayList<String>();
		
		
		File pokedex = new File("Pokedex.txt");
		
		Scanner lector = new Scanner(pokedex);
		
		while (lector.hasNextLine()) {
			
			String linea = lector.nextLine();
			
			listaPokes.add(linea);
		}
		
		
		
		//9 == tipo
		// logica
		// NOR  FUE  AGU  PLA  ELE  HIE  LUC  VEN  TIE  VOL  PSI  BIC  ROC  FAN  DRA  ACE  SIN  HAD
		
	}

}
