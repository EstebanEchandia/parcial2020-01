package isi.died2020.parcial01.ejercicio02.app;

public class InscripcionAlumnoCursadaException extends Exception{

	public InscripcionAlumnoCursadaException() {
		super("Hubo un problema al guardar la inscripcion del alumno en la base de datos");
	}
	
	public InscripcionAlumnoCursadaException(Object o) {
		super("Hubo un problema al guardar la inscripcion del alumno en la base de datos >>> "+o.toString());
	}
}
