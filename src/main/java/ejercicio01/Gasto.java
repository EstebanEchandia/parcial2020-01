package ejercicio01;

public class Gasto {

	private Integer idComprobante;
	private String descripcion;
	private Integer total;
	
	
	public Gasto(Integer idComprobante, String descripcion, Integer total) {
		super();
		this.idComprobante = idComprobante;
		this.descripcion = descripcion;
		this.total = total;
	}


	public Integer getIdComprobante() {
		return idComprobante;
	}


	public Integer getTotal() {
		return total;
	};
	
	
	
	
}
