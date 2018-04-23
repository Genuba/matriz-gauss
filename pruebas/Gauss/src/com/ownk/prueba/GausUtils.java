package com.ownk.prueba;

public class GausUtils {
	
	/**dfgsdfg
	 * gdfgsdfg
	 * <h1></h1>
	 * @param matriz dfgdfgd
	 * @param cantidadFilas sdfgdfg
	 * @param cantidadColumn   asdfgdfg
	 * @return dfgdfgdfg
	 */
	public float[][] reduccionInferior(float[][] matriz,int cantidadFilas,int cantidadColumnas){

		for(int filas = 0;filas < cantidadFilas;filas++) {
			float denominador = 1;
			
			/**
			 * Recocofriensdxsasddsgñdsgldfgdfsdgdgf
			 * dfg
			 * dfg
			 * sdfg
			 * sd
			 * fg
			 * 
			 */
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				if(filas == columnas) {
					denominador = matriz[filas][columnas];
				}
			}
			
			/**
			 * fasdasdasdgsadf
			 * 
			 */
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				if(filas == columnas && matriz[filas][columnas] == 0) {
					matriz[filas][columnas] = 1;
				}
				if(denominador != 0){
					matriz[filas][columnas] = matriz[filas][columnas]/denominador;
				}
			}
			for(int filasReduccion = (filas + 1);filasReduccion < cantidadFilas;filasReduccion++){
				for(int columnasreduccion = filas;columnasreduccion < cantidadColumnas;columnasreduccion++){
					matriz[filasReduccion][columnasreduccion]=(matriz[filasReduccion][columnasreduccion]*matriz[filas][filas])-((matriz[filas][columnasreduccion]*matriz[filasReduccion][columnasreduccion]));
				}
			}
		}
		return matriz;
	}
	public float[][] reduccionSuperior(float[][] matriz,int cantidadFilas,int cantidadColumnas){
		
		for(int filas = (cantidadFilas-1);filas >= 0;filas--) {
			for(int filasReduccion = (filas - 1);filasReduccion >= 0;filasReduccion--){
				for(int columnasreduccion = (filas - 1);columnasreduccion < cantidadColumnas;columnasreduccion++){
					matriz[filasReduccion][columnasreduccion]=(matriz[filasReduccion][columnasreduccion]*matriz[filas][filas]*(-1))+((matriz[filas][columnasreduccion]*matriz[filasReduccion][columnasreduccion]));
				}
			}
		}
		return matriz;
	}
}
