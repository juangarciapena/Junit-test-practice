package GarciaPena.JuanManuel39743684;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import org.junit.Test;

import GarciaPena.JuanManuel39743684.Camion;
import GarciaPena.JuanManuel39743684.Empresa;
import GarciaPena.JuanManuel39743684.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
		Empresa empresa = new Empresa("El sol");
		TiendaCamion tiendaCamion = new TiendaCamion("ABC123");
		empresa.agregarCamion(tiendaCamion);
		Integer cantidadEsperada = 1;
		assertEquals(cantidadEsperada,empresa.cantidadDeCamiones());
		
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		Empresa empresa = new Empresa("El sol");
		TiendaCamion tiendaCamion = new TiendaCamion("ABC123");
		TiendaCamion tiendaCamion2 = new TiendaCamion("ABC124");
		TreeSet<Camion> camionesOrdenados = new TreeSet<Camion>();
		camionesOrdenados.add(tiendaCamion);
		camionesOrdenados.add(tiendaCamion2);
		
		
		
		empresa.agregarCamion(tiendaCamion);
		empresa.agregarCamion(tiendaCamion2);
		
		assertTrue(empresa.obtenerTiendascamionOrdenadoPorPatente2().equals(camionesOrdenados));
		
	}


}
