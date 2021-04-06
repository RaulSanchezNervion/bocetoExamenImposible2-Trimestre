package clases;

import java.util.Calendar;

import enumerados.Asignatura;

public class Examen {
	Calendar fechaRealizacion;
	Asignatura asignatura;
	boolean esSimulacro;
	private int id;
	private static int examenesDadosDeAlta=0;
	
	
	public Examen() {
		examenesDadosDeAlta++;
		id=examenesDadosDeAlta;
	}


	public Calendar getFechaRealizacion() {
		return fechaRealizacion;
	}


	public void setFechaRealizacion(Calendar fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}


	public int getId() {
		return id;
	}


	public Asignatura getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}


	public boolean isEsSimulacro() {
		return esSimulacro;
	}


	public void setEsSimulacro(boolean esSimulacro) {
		this.esSimulacro = esSimulacro;
	}
	
	
	
	
}
