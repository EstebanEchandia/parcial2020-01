package ejercicio01;

import java.time.LocalDateTime;
import java.time.Month;

public abstract class Empleado implements Salariable{

	
	protected Long cuil;
	protected String nombre;
	protected LocalDateTime fechaIngreso;
	protected Double sueldo;
	protected Month mesIngreso;
	
	
	public Empleado(Long cuil, String nombre, LocalDateTime fechaIngreso, Double sueldo) {
		super();
		this.cuil = cuil;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.sueldo = sueldo;
		this.mesIngreso = fechaIngreso.plusYears(1).getMonth();
	}
	
	
	
	protected Boolean cobraBonus() {
		Month mesActual = LocalDateTime.now().getMonth();
		return (mesActual == mesIngreso);
	}



	public abstract double getSalario();
	
}
