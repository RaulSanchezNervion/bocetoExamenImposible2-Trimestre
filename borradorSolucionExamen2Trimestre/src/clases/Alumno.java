package clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

import utiles.Util;

public class Alumno {
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private GregorianCalendar fechaDeNacimiento;
	private static int alumnosDadosDeAlta=0;
	private Calificacion[] calificacionesProgramacion;
	private Calificacion[] calificacionesFol;
	private Calificacion[] calificacionesLenguajeDeMarcas;
	private int indiceProgramacion;
	private int indiceFol;
	private int indiceLenguajeDeMarcas;

	public Alumno() {
		alumnosDadosDeAlta++;
		id=alumnosDadosDeAlta;
		indiceProgramacion=0;
		indiceLenguajeDeMarcas=0;
		indiceFol=0;
		calificacionesProgramacion=new Calificacion[Curso.MAXIMO_EXAMENES];
		calificacionesFol=new Calificacion[Curso.MAXIMO_EXAMENES];
		calificacionesLenguajeDeMarcas=new Calificacion[Curso.MAXIMO_EXAMENES];
	}


	public int getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	} 

	public void addCalificacion(Examen examen, double nota) {
		switch (examen.getAsignatura()) {
		case PROG: {
			calificacionesProgramacion[indiceProgramacion]=new Calificacion(examen, nota);
			indiceProgramacion++;
			break;
		}
		case LM: {
			calificacionesLenguajeDeMarcas[indiceLenguajeDeMarcas]=new Calificacion(examen, nota);
			indiceLenguajeDeMarcas++;
			break;
		}
		case FOL: {
			calificacionesFol[indiceFol]=new Calificacion(examen, nota);
			indiceFol++;
			break;
		}

		}

	}

	//Fuente: https://blog.informaticosmurcia.es/calcular-edad-de-una-persona-en-java/
	public int getEdad() {
		Calendar today = Calendar.getInstance();
		int diffYear = today.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
		int diffMonth = today.get(Calendar.MONTH) - fechaDeNacimiento.get(Calendar.MONTH);
		int diffDay = today.get(Calendar.DAY_OF_MONTH) - fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
		// Si está en ese año pero todavía no los ha cumplido
		if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
			diffYear = diffYear - 1; // no aparecían los dos guiones del
			// postincremento :|
		}
		return diffYear;
	}
	
	public double getMediaProg() {
		return Util.mediaArray(calificacionesProgramacion);
	}
	
	public double getMediaFol() {
		return Util.mediaArray(calificacionesFol);
	}
	
	public double getMediaLenguajeDeMarcas() {
		return Util.mediaArray(calificacionesLenguajeDeMarcas);
	}
}
