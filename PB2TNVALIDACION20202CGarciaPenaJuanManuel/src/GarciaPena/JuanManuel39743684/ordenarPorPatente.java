package GarciaPena.JuanManuel39743684;

import java.util.Comparator;

public class ordenarPorPatente implements Comparator<Camion> {

	@Override
	public int compare(Camion o1, Camion o2) {
		// TODO Auto-generated method stub
		String patente1=o1.getPatente();
		String patente2=o2.getPatente();
		return patente1.compareTo(patente2);
	}

}
