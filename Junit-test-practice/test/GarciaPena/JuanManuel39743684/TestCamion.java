package GarciaPena.JuanManuel39743684;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import GarciaPena.JuanManuel39743684.Camion;
import GarciaPena.JuanManuel39743684.Producto;
import GarciaPena.JuanManuel39743684.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
		Empresa empresa = new Empresa("El sol");
		Camion camion = new Camion("ABC123");
		Producto producto = new Producto (1,10.0,"papa",10.0);
		camion.cargarProducto(producto);
		
		assertEquals(1,camion.getListaProductos().size());

	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() {
		
	}
	
	//obligatorio
	@Test(expected = ProductoInexistenteException.class)
	public void queDescargueUnProductoInexistenteLanceUnaException() throws ProductoInexistenteException {
		Empresa empresa = new Empresa("El sol");
		Camion camion = new Camion("ABC123");
	
		
	
		camion.descargarProducto(1);
	}
	
}
