package ejercicio01;

import java.time.LocalDateTime;
import java.time.Month;

public class ReciboSueldo {

	
	private Integer numero;
	private Month mes;
	private Double totalPago;
	private Empleado empleadoAlQuePertenece;
	
	
	public ReciboSueldo(Integer numero, LocalDateTime fechaGenerado, 
			Double totalPago,
			Empleado empleadoAlQuePertenece) {
		
		
		
		super();
		this.numero = numero;
		this.mes = LocalDateTime.now().getMonth();
		this.totalPago = totalPago;
		this.empleadoAlQuePertenece = empleadoAlQuePertenece;
		
	}


	public Integer getNumero() {
		return numero;
	}


	public Month getMes() {
		return mes;
	}


	public Double getTotalPago() {
		return totalPago;
	}


	public Empleado getEmpleadoAlQuePertenece() {
		return empleadoAlQuePertenece;
	}
	
	
	
	
}
