package GarciaPena.JuanManuel39743684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;



public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota;
	
	private int id;

	public Empresa(String nombre) {
		this.nombre=nombre;
		this.flota = new HashMap<Integer, Camion>();
		id=0;
	}

	public void agregarCamion(Camion camion) {
		this.flota.put(id ,camion);
		id++;
		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4

	}

	public Integer cantidadDeCamiones() {
		
		return flota.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		TreeSet<Camion> camionesOrdenados = new TreeSet<Camion>(flota.values());
		

		return camionesOrdenados;
	}
	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente2() {
		TreeSet<Camion> camionesOrdenados = new TreeSet<Camion>(new ordenarPorPatente());

		for (Camion x : flota.values()) {
			camionesOrdenados.add(x);
		}

		return camionesOrdenados;
	}


}
