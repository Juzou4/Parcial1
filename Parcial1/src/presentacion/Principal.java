package presentacion;
import logica.Automovil;
import logica.Autonomia;
import logica.Motocicleta;
import logica.Vehiculo;

public class Principal {
	public static void main (String[] args) {
		new Vehiculo();
		
		new Automovil(500, 1000, 40);
		new Motocicleta(400, 2000, 44);
		
		
		
		System.out.println("La autonomia del auto es:"+Autonomia.calcularAutonomiaAutomovil()+ " y la autonomia de la moto es: "+Autonomia.calcularAutonomiaMotocicleta());
	}
}
