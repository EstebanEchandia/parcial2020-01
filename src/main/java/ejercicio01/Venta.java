package ejercicio01;

import java.time.LocalDateTime;

public class Venta {
	private LocalDateTime fecha;
	private Integer total;


	public Venta(LocalDateTime fecha, Integer total) {
		super();
		this.fecha = fecha;
		this.total = total;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public Integer getTotal() {
		return total;
	}
	
	
}
