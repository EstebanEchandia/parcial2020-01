package ejercicio01;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AppRRHH {
	
	Integer nroReciboSueldo = 1;
	
	public ArrayList<ReciboSueldo> generarRecibos(ArrayList<Empleado> listaEmp) {
		
		ArrayList<ReciboSueldo> recibos = new ArrayList<ReciboSueldo>();
		
		for(Empleado e: listaEmp) {
			recibos.add(new ReciboSueldo(nroReciboSueldo, LocalDateTime.now(), e.getSalario(), e));
			nroReciboSueldo+=1;
		
		}
		
		System.out.println(recibos.get(0).getNumero());
		System.out.println(recibos.get(0).getMes());
		System.out.println(recibos.get(0).getTotalPago());
		return recibos;
		
		
	}
	

}
