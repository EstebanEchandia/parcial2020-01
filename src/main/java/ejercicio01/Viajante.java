package ejercicio01;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Viajante extends Empleado{
	
	private ArrayList<Venta> ListaVentas;
	private ArrayList<Gasto> ListaGastos;
	
	
	
	public Viajante(Long cuil, String nombre, LocalDateTime fechaIngreso, Double sueldo) {
		super(cuil, nombre, fechaIngreso, sueldo);
		ArrayList<Venta> ListaVentas = new ArrayList<Venta>();
		ArrayList<Gasto> ListaGastos = new ArrayList<Gasto>();
	}



	public ArrayList<Venta> getListaVentas() {
		return ListaVentas;
	}



	public ArrayList<Gasto> getListaGastos() {
		return ListaGastos;
	}
	
	@Override
	public double getSalario() {
		
		double salario = this.sueldo+this.getTotalGastos()+(this.getTotalVentas()*0.05);
		
		if(this.cobraBonus()) {
			return (salario + sueldo/2);
		}
	
		return salario;	
	}
	
	
	public double getTotalGastos() {
		double totalGastos=0;
		for(Gasto g: ListaGastos) {
			totalGastos += g.getTotal();
		}
		return totalGastos;
	}
	
	public double getTotalVentas() {
		double totalVentas=0;
		for(Venta v: ListaVentas) {
			totalVentas += v.getTotal();
		}
		return totalVentas;
	}

	
	

}
