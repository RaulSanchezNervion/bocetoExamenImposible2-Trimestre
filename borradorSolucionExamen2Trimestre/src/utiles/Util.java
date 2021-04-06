package utiles;

import clases.Calificacion;

public class Util {

	public static double mediaArray(Calificacion[] calificaciones) {
		double numCalificaciones=0;
		double sumatorio=0;
		double resultado=0;
		for(int i=0; i<calificaciones.length && calificaciones[i]!=null;i++) {
			Calificacion calificacion=calificaciones[i];
			if(!calificacion.getExamen().isEsSimulacro()) {
				numCalificaciones++;
				sumatorio+=calificaciones[i].getNota();
			}
		}
		if(numCalificaciones==0)
			resultado=0;
		else
			resultado=sumatorio/numCalificaciones;
		return resultado; 
	}

}
