package clases;

public class Curso {
	public static final int MAXIMO_ALUMNOS = 33;
	public static final int MAXIMO_EXAMENES = 10;
	private Alumno[] alumnos;
	private Examen[] examenesProgramacion;
	private Examen[] examenesFol;
	private Examen[] examenesLenguajeDeMarcas;
	private int indiceAlumno;
	private int indiceExamenesProgramacion;
	private int indiceExamenesFol;
	private int indiceExamenesLenguajeDeMarcas;

	public Curso(){
		alumnos=new Alumno[MAXIMO_ALUMNOS];
		examenesProgramacion = new Examen[MAXIMO_EXAMENES];
		examenesFol = new Examen[MAXIMO_EXAMENES];
		examenesLenguajeDeMarcas = new Examen[MAXIMO_EXAMENES];
		indiceAlumno=0;
		indiceExamenesProgramacion=0;
		indiceExamenesFol=0;
		indiceExamenesLenguajeDeMarcas=0;
		
	}


	public double getMediaProgramacion() {
		double numAlumnos=0;
		double sumatorio=0;
		double resultado=0;
		for(int i=0; i<alumnos.length && alumnos[i]!=null;i++) {
			Alumno alumno=alumnos[i];
			numAlumnos++;
			sumatorio+=alumno.getMediaProg();
		}
		if(numAlumnos==0)
			resultado=0;
		else
			resultado=sumatorio/numAlumnos;
		return resultado;
	}

	public double getMediaFol() {
		double numAlumnos=0;
		double sumatorio=0;
		double resultado=0;
		for(int i=0; i<alumnos.length && alumnos[i]!=null;i++) {
			Alumno alumno=alumnos[i];
			numAlumnos++;
			sumatorio+=alumno.getMediaFol();
		}
		if(numAlumnos==0)
			resultado=0;
		else
			resultado=sumatorio/numAlumnos;
		return resultado;
	}

	public double getMediaLenguajeDeMarcas() {
		double numAlumnos=0;
		double sumatorio=0;
		double resultado=0;
		for(int i=0; i<alumnos.length && alumnos[i]!=null;i++) {
			Alumno alumno=alumnos[i];
			numAlumnos++;
			sumatorio+=alumno.getMediaLenguajeDeMarcas();
		}
		if(numAlumnos==0)
			resultado=0;
		else
			resultado=sumatorio/numAlumnos;
		return resultado;
	}
	
	public void addAlumno(Alumno alumno) {
		alumnos[indiceAlumno]=alumno;
		indiceAlumno++;
	}
	
	public void addExamenProgramacion(Examen examen) {
		examenesProgramacion[indiceExamenesProgramacion]=examen;
		indiceExamenesProgramacion++;
	}
	
	public void addExamenLenguajeDeMarcas(Examen examen) {
		examenesLenguajeDeMarcas[indiceExamenesLenguajeDeMarcas]=examen;
		indiceExamenesLenguajeDeMarcas++;
	}
	
	public void addExamenFol(Examen examen) {
		examenesFol[indiceExamenesFol]=examen;
		indiceExamenesFol++;
	}


	public Alumno getAlumnoPorId(int i) {
		return alumnos[i-1];
	}


	public Examen getExamenPorId(int id) {
		Examen e=null;
		for(int i=0;i<indiceExamenesProgramacion && e==null;i++) {
			if(examenesProgramacion[i].getId()==id)
				e=examenesProgramacion[i];
		}
		for(int i=0;i<indiceExamenesFol && e==null;i++) {
			if(examenesFol[i].getId()==id)
				e=examenesFol[i];
		}
		for(int i=0;i<indiceExamenesLenguajeDeMarcas && e==null;i++) {
			if(examenesLenguajeDeMarcas[i].getId()==id)
				e=examenesLenguajeDeMarcas[i];
		}
		return e;
	}

}
