package tests;

import java.util.GregorianCalendar;

import clases.Alumno;
import clases.Curso;
import clases.Examen;
import enumerados.Asignatura;
import menu.Menu;

public class TestClases {
	private static Curso curso=new Curso();//TODO pasar como parametro al main
	public static void main(String[] args) {
//		Menu.mostrarMenuPrincipal();
//		int eleccion=Menu.eleccionPrincipal();
//		switch (eleccion) {
//		case 1 -> altaAlumno();
//		case 2 -> altaExamen();
//		case 3 -> asignarCalificacion();
//		case 4 -> mostrarEstadisticaAlumno();
//		case 5 -> mostrarEstadisticasGloables();
//		}
		altaAlumno();
		altaExamen();
		asignarCalificacion();
		mostrarEstadisticaAlumno();
		mostrarEstadisticasGloables();
	}

	private static void mostrarEstadisticasGloables() {
		System.out.println(curso.getMediaProgramacion());

	}

	private static void mostrarEstadisticaAlumno() {
		System.out.println(curso.getAlumnoPorId(1).getMediaProg());
	
	}

	private static void asignarCalificacion() {
		Examen e=curso.getExamenPorId(1);
		Alumno a=curso.getAlumnoPorId(1);
		a.addCalificacion(e, 2);
		
		Examen e2=curso.getExamenPorId(2);
		a.addCalificacion(e, 4);
		
		
		Alumno a2=curso.getAlumnoPorId(2);
		a2.addCalificacion(e, 5);
		

		a2.addCalificacion(e2, 5);
		
	}

	private static void altaExamen() {
		Examen e=new Examen();
		e.setAsignatura(Asignatura.PROG);
		e.setEsSimulacro(false);
		e.setFechaRealizacion(new GregorianCalendar());
		curso.addExamenProgramacion(e);
		
		Examen e2=new Examen();
		e2.setAsignatura(Asignatura.PROG);
		e2.setEsSimulacro(false);
		e2.setFechaRealizacion(new GregorianCalendar());
		curso.addExamenProgramacion(e2);
		
	}

	private static void altaAlumno() {
		Alumno a=new Alumno();
		a.setNombre("Pepe");
		a.setApellido1("Garcia");
		a.setApellido2("Gonzalez");
		curso.addAlumno(a);
		
		Alumno b=new Alumno();
		b.setNombre("Pepe");
		b.setApellido1("Garcia");
		b.setApellido2("Gonzalez");
		curso.addAlumno(b);
	}
	

}
