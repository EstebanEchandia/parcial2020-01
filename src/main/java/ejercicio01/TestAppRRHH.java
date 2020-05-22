package ejercicio01;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TestAppRRHH {
	
	public Empleado e1;
	public Empleado e2;
	
	public AppRRHH app;

	
	@Before
	public void setUp() throws Exception {
		
		Empleado e1 = new Operario(2042470232l, "Pedro Perez", LocalDateTime.now().minusMonths(8), 250d);
		AppRRHH app = new AppRRHH();
}
	
	
	
	@Test
	public void testGenerarRecibos() {
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(e1);
	
		ReciboSueldo recibo = new ReciboSueldo(1, LocalDateTime.now(), e1.getSalario(), e1);
		
		ArrayList<ReciboSueldo> ListaReciboGenerado = app.generarRecibos(empleados);
		
		ReciboSueldo reciboGenerado = ListaReciboGenerado.get(0);
		
		Boolean idBien = (reciboGenerado.getNumero() == recibo.getNumero());
		Boolean mesBien = (reciboGenerado.getMes() == recibo.getMes());
		Boolean salarioBien = (reciboGenerado.getTotalPago() == recibo.getTotalPago());
		Boolean empleadoBien = (reciboGenerado.getEmpleadoAlQuePertenece() == recibo.getEmpleadoAlQuePertenece());
		
		assertTrue(idBien);
		assertTrue(mesBien);
		assertTrue(salarioBien);
		assertTrue(empleadoBien);
		
		
		
	}

}
