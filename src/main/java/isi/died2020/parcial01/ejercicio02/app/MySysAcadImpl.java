package isi.died2020.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import isi.died2020.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died2020.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died2020.parcial01.ejercicio02.dominio.*;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) throws InscripcionAlumnoCursadaException, InscripcionAlumnoMateriaNoLibreException  {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		try {
			DB.guardar(insc);
		} catch (BaseDeDatosExcepcion e1) {
			throw new InscripcionAlumnoCursadaException();
		}
		
		
		for (Inscripcion i: a.getMateriasCursadas()){
			if(i.getMateria() == m){
				if(i.getEstado() != Inscripcion.Estado.LIBRE) {
					throw new InscripcionAlumnoMateriaNoLibreException();
				}
			}
		}
		
	}
	
	@Override
	public void registrarNota(Integer nota,Examen e) {
		e.setNota(nota);
		if(nota>6) {
			
			Optional <Inscripcion> inscripcion = e.getAlumno().getMateriasCursadas().stream()
												.filter(i1 -> i1.getMateria() == e.getMateria())
												.findFirst();
			
			inscripcion.get().setEstado(Inscripcion.Estado.PROMOCIONADO);
		}
		
		
		
		
	}
	
	@Override
	public List<Examen> topNExamenes(Alumno a,Integer n,Integer nota){	
		return a.getExamenes().stream()
						.filter(e1 -> e1.getNota() > nota)
						.limit(n)
						.sorted((e3,e4) -> e4.getNota().compareTo(e3.getNota()))
						.collect(Collectors.toList());
	}
	
	
	
	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		
		DB.guardar(e);
		
		
	}
	

}
