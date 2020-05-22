package isi.died2020.parcial01.ejercicio02.app;

public class InscripcionAlumnoMateriaNoLibreException extends Exception {
	public InscripcionAlumnoCursadaException() {
		super("El alumno no se pudo inscribir por que no se encuentra en estado LIBRE en la materia");
	}
	
	public InscripcionAlumnoCursadaException(Object o) {
		super("El alumno no se pudo inscribir por que no se encuentra en estado LIBRE en la materia"+o.toString());
	}
}
