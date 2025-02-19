package logica;

import java.util.ArrayList;
import java.util.Collection;

public class Vehiculo {
	private ArrayList <Vehiculo> vehiculos;
	
	public Vehiculo() {
		this.vehiculos=new ArrayList<>();
		
	}
	
	@SuppressWarnings("unchecked")
	public void agregarAuto(Automovil auto1) {
		vehiculos.addAll((Collection<? extends Vehiculo>) auto1);
	}
	
	public void agregarmoto(Automovil auto1) {
		Vehiculo moto1 = null;
		vehiculos.add(moto1);
	}
}
