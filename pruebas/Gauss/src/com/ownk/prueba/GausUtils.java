package com.ownk.prueba;
import java.util.List;

public class GausUtils {
	/**
	 * matriz reduccion se encarga de hacer la reduccion inferior de gaus
	 * @param matriz tipo lista de lista flotante ya que los valores se recorren dentro del objeto tipo lista y los valores flotantes
	 * @param cantidadFilas 
	 * @param cantidadColumnas
	 * @return
	 */
	public List<List<Float>> reduccionInferior(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas){

		for(int filas = 0;filas < cantidadFilas;filas++) {
			float denominador = 1;
			List<Float> nodeMatriz = matriz.get(filas);
			
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				if(filas == columnas) {
					denominador = nodeMatriz.get(columnas);
				}
			}
			
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
	public List<List<Float>> reduccionSuperior(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas){
		
		for(int filas = (cantidadFilas-1);filas >= 0;filas--) {
			List<Float> nodeMatriz = matriz.get(filas);
			for(int filasReduccion = (filas - 1);filasReduccion >= 0;filasReduccion--){
				List<Float> nodeMatrizReduccion = matriz.get(filasReduccion);
				for(int columnasreduccion = (filas - 1);columnasreduccion < cantidadColumnas;columnasreduccion++){
					float inferior = nodeMatrizReduccion.get(columnasreduccion)*nodeMatriz.get(filas);
					float superior = nodeMatrizReduccion.get(columnasreduccion)*nodeMatriz.get(columnasreduccion);
					float temp = inferior - superior;
					nodeMatrizReduccion.set(columnasreduccion,temp);
				}
			}
		}
		return matriz;
	}
	public void resultados(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas) {
			for(int filas = 0;filas < cantidadFilas;filas++) {
				List<Float> nodeMatriz = matriz.get(filas);
				System.out.print(nodeMatriz.get((cantidadColumnas-1))+"\t");
			}
	}
}
