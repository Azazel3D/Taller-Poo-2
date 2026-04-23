package Paquete;

public class Batalla {
	
	
	
	private Poke pokemon1;
	private Poke pokemon2;
	
	private TablaDeTipos x = new TablaDeTipos();
	
	public Batalla (Poke pokemon1, Poke pokemon2) {
		
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		
	}
	
	public int damage (Poke jugador, Poke rival) {
		
		double damage = x.encontrarDamage(1, 2);
		return 0;
		
	}
	
	
	

}
