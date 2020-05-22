package ejercicio01;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AppRRHH {
	
	Integer nroReciboSueldo = 0;
	
	public ArrayList<ReciboSueldo> generarRecibos(ArrayList<Empleado> listaEmp) {
		
		ArrayList<ReciboSueldo> recibos = new ArrayList<ReciboSueldo>();
		
		for(Empleado e: listaEmp) {
			recibos.add(new ReciboSueldo(nroReciboSueldo, LocalDateTime.now(), e.getSalario(), e));
			nroReciboSueldo+=1;
		}
		
		
		return recibos;
		
		
	}
	

}
