package GarciaPena.JuanManuel39743684;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion extends Camion implements ITienda  {
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	
	
	public TiendaCamion(String Patente) {
		super(Patente);
		this.ventas = new ArrayList<Producto>();
		this.estadoDeCaja=false;
		
	}

	
	

	public void abrirCaja() {
		this.estadoDeCaja= true;
		this.ventas.clear();
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria

		
	}




	@Override
	public void vender(Integer idProducto) throws CajaCerradaException, ProductoInexistenteException {
		// TODO Auto-generated method stub
		// No permite vender si la caja esta Cerrada y lanza CajaCerradaException
		// Si el producto no existe Lanza Una Excepcion ProductoInexistenteException
		Producto producto = this.buscarProducto(idProducto);
		
		if(!this.estadoDeCaja) {
			throw new CajaCerradaException("la caja esta cerrada");
		}
		if(producto==null) {
			throw new ProductoInexistenteException("el producto no existe");
		}
		
		this.ventas.add(producto);
		

	}




	@Override
	public Reporte cierreZ() {
		//cierra la caja arma y retorna el reporte Diario
		this.estadoDeCaja=false;
		
		Double contador=0.0;
		Double sumador=0.0;
		
		for (Producto x : ventas) {
			contador++;
			sumador+= x.getPrecio();
		}
		
		Reporte reporte =new Reporte();
		reporte.setTotalVentas(contador);
		reporte.setTotalNeto(sumador);
		reporte.setTotalIva(sumador*1.21);
		
		return reporte;
	}


}
