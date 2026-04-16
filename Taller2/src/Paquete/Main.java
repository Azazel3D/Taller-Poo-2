package Paquete;

import java.awt.Menu;
import java.io.*;
import java.util.*;


public class Main {

	
	public static void MenuUno() {
		
		System.out.println("1) Revisar equipo.");
		System.out.println("2) Salir a capturar.");
		System.out.println("3) Acceso al PC (cambiar pokemon del equipo).");
		System.out.println("4) Retar un gimnasio.");
		System.out.println("5) Desafio al Alto Mando.");
		System.out.println("6) Curar pokémon.");
		System.out.println("7) Guardar.");
		System.out.println("8) Guardar y Salir.");
		System.out.print("> ");
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) Continuar.");
		System.out.println("2) Nueva partida.");
		System.out.println("3) Salir.");
		System.out.print("> ");
		int op = Integer.valueOf(sc.nextLine());
		
		switch(op) {
		case 1:
			System.out.println();
			MenuUno();
			int po2 = Integer.valueOf(sc.nextLine());
			
			
			break;
		case 2:
			
			
			try {
				
				File Partidas = new File("Archivos/Registros.txt");
				BufferedWriter escritor = new BufferedWriter(new FileWriter(Partidas));
				Scanner lector = new Scanner(Partidas);
				
				System.out.print("Nombre: ");
				String name = sc.nextLine();
				
				
				
				escritor.write(name);
				escritor.newLine();
				escritor.flush();
				
				
				
				
				
				
				
				
				escritor.close();
				lector.close();
				} catch (IOException e) {
					System.out.println("hola");
				}
			
			
			
			
			
			
			break;
		case 3:
			
			System.out.println("Bye");
			break;
		}
		
		
		
		
		
		

	}

}
