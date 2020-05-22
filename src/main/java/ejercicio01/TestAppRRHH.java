package ejercicio01;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Test;


public class TestAppRRHH {
	
	public Empleado e1;
	
	public AppRRHH app;

	
	@Test
	public void testGenerarRecibos() {
		
		
		AppRRHH app = new AppRRHH();
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(e1);
	
		
		ArrayList<ReciboSueldo> ListaReciboGenerado = app.generarRecibos(empleados);
		
		
		
		ReciboSueldo reciboGenerado = ListaReciboGenerado.get(0);
		
		Boolean idBien = (reciboGenerado.getNumero().equals(1));
		Boolean mesBien = (reciboGenerado.getMes().equals(LocalDateTime.now().getMonth()));
		Boolean salarioBien = (reciboGenerado.getTotalPago().equals(250d));
		Boolean empleadoBien = (reciboGenerado.getEmpleadoAlQuePertenece().equals(e1));
		
		assertTrue(idBien);
		assertTrue(mesBien);
		assertTrue(salarioBien);
		assertTrue(empleadoBien);
		
		
		
	}

}
