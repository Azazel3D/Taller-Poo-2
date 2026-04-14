package Paquete;

import java.io.*;
import java.util.*;

public class Poke {
	
	
	public static void pokemon(String[] a) throws FileNotFoundException{
		
		
		File pokedex = new File("Pokedex.txt");
		
		Scanner lector = new Scanner(pokedex);
		
		while(lector.hasNextLine()) {
			String line = lector.hasNextLine();
			String[] part = line.split(";");
			
			
			
		}
		
		
		
	}

}
