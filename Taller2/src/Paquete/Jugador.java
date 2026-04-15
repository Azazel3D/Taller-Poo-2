package Paquete;

import java.io.*;
//import java.util.*;


public class Jugador {
	
	public static void AbrirArchivo() {
		
		try {
			FileWriter partidas = new FileWriter("Taller-Poo-2/Taller2/src/Archivos/Registros.txt");
			
		} catch (IOException e) {
			System.out.println("hola");
		}
		
	}
	

}
