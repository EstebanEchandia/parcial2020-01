/**
 * 
 */
package ejercicio01;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Esteban
 *
 */
public class Operario extends Empleado {
	
	
	private ArrayList<Viajante> ListaViajantes;

	public Operario(Long cuil, String nombre, LocalDateTime fechaIngreso, Double sueldo) {
		
		super(cuil, nombre, fechaIngreso, sueldo);
		ArrayList<Viajante> ListaViajantes = new ArrayList<Viajante>();
		
	}
	
	@Override
	public double getSalario() {
		double salario = this.sueldo;
		for(Viajante v: ListaViajantes) {
			salario += v.getTotalVentas()*0.05;
		}
		
		if(this.cobraBonus()) {
			return (salario + sueldo/2);
		}
		
		return salario;	
	}
	

}
