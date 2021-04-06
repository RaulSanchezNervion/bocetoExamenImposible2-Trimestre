package clases;

public class Calificacion {
	private Examen examen;
	private double nota;
	
	public Calificacion(Examen examen, double nota) {
		this.examen = examen;
		this.nota = nota;
	}

	public Examen getExamen() {
		return examen;
	}

	public double getNota() {
		return nota;
	}
	
	
}
