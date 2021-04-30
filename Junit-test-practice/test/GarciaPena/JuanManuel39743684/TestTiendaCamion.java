package GarciaPena.JuanManuel39743684;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import GarciaPena.JuanManuel39743684.Producto;
import GarciaPena.JuanManuel39743684.Reporte;
import GarciaPena.JuanManuel39743684.TiendaCamion;

public class TestTiendaCamion {
	
	
	
	//Obligatorio
	
	@Test
	public void queSeObtengaUnreporteAlHAcerUnCierreZ() throws CajaCerradaException, ProductoInexistenteException {
		Empresa empresa = new Empresa("El sol");
		TiendaCamion tiendaCamion = new TiendaCamion("ABC123");
		
	
		empresa.agregarCamion(tiendaCamion);
		Producto producto = new Producto(1,10.0,"canio",20.0);
		
		tiendaCamion.abrirCaja();
		tiendaCamion.cargarProducto(producto);
		
		tiendaCamion.vender(1);
		Reporte reporte=tiendaCamion.cierreZ();
		Reporte reporteEsperado = new Reporte(1.0, 10.0, 10.0*1.21);
		assertEquals(reporteEsperado, reporte);
		
	}
	

	//opcional
	@Test
	public void queAlArirUnaCajaLaListaDeVentaEsteVacia() {
		
	}

}
