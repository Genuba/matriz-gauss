package com.ownk.prueba;
import java.util.ArrayList;
import java.util.List;

public class GausUtils {
	
	/**dfgsdfg
	 * gdfgsdfg
	 * <h1></h1>
	 * @param matriz dfgdfgd
	 * @param cantidadFilas sdfgdfg
	 * @param cantidadColumn   asdfgdfg
	 * @return dfgdfgdfg
	 */
	public List<List<Float>> reduccionInferior(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas){

		for(int filas = 0;filas < cantidadFilas;filas++) {
			float denominador = 1;
			List<Float> nodeMatriz = matriz.get(filas);
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
					denominador = nodeMatriz.get(columnas);
				}
			}
			
			/**
			 * fasdasdasdgsadf
			 * 
			 */
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				if(filas == columnas && nodeMatriz.get(columnas) == 0) {
					nodeMatriz.set(columnas,new Float(1));
				}
				if(denominador != 0){
					float uno = nodeMatriz.get(columnas)/denominador;
					nodeMatriz.set(columnas,uno);
				}
			}
			for(int filasReduccion = (filas + 1);filasReduccion < cantidadFilas;filasReduccion++){
				List<Float> nodeMatrizReduccion = matriz.get(filasReduccion);
				for(int columnasreduccion = filas;columnasreduccion < cantidadColumnas;columnasreduccion++){
					float inferior = nodeMatrizReduccion.get(columnasreduccion)*nodeMatriz.get(filas);
					float superior = nodeMatrizReduccion.get(columnasreduccion)*nodeMatriz.get(columnasreduccion);
					float temp = inferior - superior;
					nodeMatrizReduccion.set(columnasreduccion,temp);
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
