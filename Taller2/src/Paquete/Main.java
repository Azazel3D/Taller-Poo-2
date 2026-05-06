package Paquete;


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
	
	public static void menuDos() {
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int men = 0;
		
		
		do {
			System.out.println("1) Continuar.");
			System.out.println("2) Nueva partida.");
			System.out.println("3) Salir.");
			System.out.print("> ");
			String op = String.valueOf(sc.nextLine());
			
			switch(op) {
			case "1":
				try {
					File Partidas1 = new File("Archivos/Registros.txt");			
					Scanner lector1 = new Scanner(Partidas1);
					
					
					if (Partidas1.exists() && Partidas1.length()==0) {
						System.out.println("no hay partidas guardadas");
					}
					
					
				
					lector1.close();
				} catch (IOException e) {
					System.out.println();
					MenuUno();
					int po2 = Integer.valueOf(sc.nextLine());
					
					
					
				}
				
				
				
				
				
				
				break;
			case "2":
				
				
				try {
								
					BufferedWriter escritor = new BufferedWriter(new FileWriter("Archivos/Registros.txt"));					
					System.out.print("Nombre: ");
					String name = sc.nextLine();
					System.out.println();
					System.out.println("Bienvenido "+name+"!!");
					System.out.println();
					
					
					
					/*
					if (!lector.equals(null)) {
						System.out.println("papu :v");
						escritor.write(name);
						escritor.newLine();
						escritor.flush();
						escritor.close();
		
						
					} else{
						System.out.println("hola");
						while (lector.hasNextLine()) {
							
							String line = lector.nextLine();
							
							if (line.equals(null)) {
								
								escritor.newLine();
								escritor.write(name);
								escritor.newLine();
								escritor.flush();
								escritor.close();
								
							}
							
						}
						
						
	
					}
					
					
					*/
					
					int men2 = 0;
					
					
					int medallas = 0;
					
					do {
						System.out.println(name+", que deseas hacer?");
						System.out.println();
						MenuUno();
						String op3 = String.valueOf(sc.nextLine());
						
						switch(op3) {
						
						
						
						case "8":
							
							escritor.write(name+";"+medallas);
							
							
							men2++;
							break;
							
						}
					
					
					
					
					}while (men2 == 0);
					
					//lector.close();
				} catch (IOException e) {
						System.out.println("Error");
				}
				
				
				
				
				
				
				break;
			case "3":
				
				System.out.println("Bye");
				
				men++;
				break;
				
			default:
				
				System.out.println("Ingrese una opcion valida");
				
				System.out.println();
				break;
			}
		
		}while(men == 0);
		
		
		
		sc.close();

	}

}
