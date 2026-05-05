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
			String[] partes = linea.split(";");
			String Nombre = partes[0];
			String Habitat = partes[1];
			double aparicion = Double.valueOf(partes[2]);
			int Hp = Integer.valueOf(partes[3]);
			int Attack = Integer.valueOf(partes[4]);
			int defense = Integer.valueOf(partes[5]);
			int AttackEs = Integer.valueOf(partes[6]);
			int DefenseEs = Integer.valueOf(partes[7]);
			int Velocity = Integer.valueOf(partes[8]);
			String tipo = partes[9];
			
			
			
			if (tipo.equals("Normal")) {
				
			} else if(tipo.equals("Fuego")) {
				
			} else if (tipo.equals("Agua")) {
				
			} else if(tipo.equals("Planta")) {
				
			} else if(tipo.equals("Electrico")) {
				
				
			} else if(tipo.equals("Hielo")) {
				
			}
			
			
			
			
			//listaPokes.add(linea);
		}
		
		
		
		//9 == tipo
		// logica
		// NOR  FUE  AGU  PLA  ELE  HIE  LUC  VEN  TIE  VOL  PSI  BIC  ROC  FAN  DRA  ACE  SIN  HAD
		
	}

}
