package GarciaPena.JuanManuel39743684;

public class Reporte {

	private Double totalVentas;
	private Double totalIva;
	private Double totalNeto;
	
	

	public Reporte(double d, double e, double f) {
		// TODO Auto-generated constructor stub
		this.totalVentas=d;
		this.totalNeto=e;
		this.totalIva=f;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((totalIva == null) ? 0 : totalIva.hashCode());
		result = prime * result + ((totalNeto == null) ? 0 : totalNeto.hashCode());
		result = prime * result + ((totalVentas == null) ? 0 : totalVentas.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reporte))
			return false;
		Reporte other = (Reporte) obj;
		if (totalIva == null) {
			if (other.totalIva != null)
				return false;
		} else if (!totalIva.equals(other.totalIva))
			return false;
		if (totalNeto == null) {
			if (other.totalNeto != null)
				return false;
		} else if (!totalNeto.equals(other.totalNeto))
			return false;
		if (totalVentas == null) {
			if (other.totalVentas != null)
				return false;
		} else if (!totalVentas.equals(other.totalVentas))
			return false;
		return true;
	}


	public Reporte() {
		// TODO Auto-generated constructor stub
	}


	public String imprimirReporte() {
		//formato de impresion es totalVenta-totalIva-totalNeto
		
		return this.totalVentas+"-"+this.totalIva+"-"+this.totalNeto;
	}


	public Double getTotalVentas() {
		return totalVentas;
	}


	public void setTotalVentas(Double totalVentas) {
		this.totalVentas = totalVentas;
	}


	public Double getTotalIva() {
		return totalIva;
	}


	public void setTotalIva(Double totalIva) {
		this.totalIva = totalIva;
	}


	public Double getTotalNeto() {
		return totalNeto;
	}


	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}
	
	
}
