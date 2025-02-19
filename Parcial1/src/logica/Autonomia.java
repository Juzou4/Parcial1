package logica;

public abstract class Autonomia {
	public static int cilindraje;
	public static float peso;
	public static int tamañoDelTanque;

	
	public Autonomia(int cilindraje, float peso, int tamañoDelTanque) {
		super();
		Autonomia.cilindraje = cilindraje;
		Autonomia.peso = peso;
		Autonomia.tamañoDelTanque = tamañoDelTanque;
		
		
	}
	
	public static double calcularAutonomiaAutomovil() {
	return (15*Math.pow(10, 4))/(cilindraje+peso)*tamañoDelTanque;
	}
	
	public static double calcularAutonomiaMotocicleta() {
		return (8*Math.pow(10, 4))/(cilindraje+2*peso)*tamañoDelTanque;
	}
	
	
	public abstract void mostrarInformacion();

}
