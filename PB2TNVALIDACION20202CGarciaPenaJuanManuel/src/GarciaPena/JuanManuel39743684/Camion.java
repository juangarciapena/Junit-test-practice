package GarciaPena.JuanManuel39743684;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Camion implements Comparable<Camion> {
	
	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	
	
	private String patente;
	private List <Producto> listaProductos;
	
	
	public Camion (String patente) {
	
		this.patente=patente;
		listaProductos = new ArrayList <Producto>();
	}
	
	
	public Boolean cargarProducto(Producto producto) {
		/*
		 * carga el producto en la lista de producto 
		 *   
		 * 
		 */
		if(listaProductos.add(producto))
			return true;
		
		return false;
	
	}
	
	
	public Producto descargarProducto(Integer idProducto) throws ProductoInexistenteException {
	
		Producto producto;
		producto = buscarProducto(idProducto);
		if(producto==null)
			throw new ProductoInexistenteException("No existe el producto en la lista");
		
		listaProductos.remove(producto);
		/*
		 * buesca y un producto por su id y devuelve el producto encontrado
		 * por otro lado elimina dicho producto de la coleccion
		 * encaso que el idProducto no se encuentre retorna una exception ProductoInexistenteException
		 */
	return producto;
	}
	
	public Producto buscarProducto(int i) {
		for (Producto x : listaProductos) {
			if ((x.getId().equals(i))==true) {
				return x;
			} 
		}
		return null;
	}

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public List<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	@Override
	public int compareTo(Camion o) {
		// TODO Auto-generated method stub
	
		return this.getPatente().compareTo(o.getPatente());
	}


	
}
