package com.ownk.prueba;
import java.util.List;

/**
 * 
 * @author EroDubai
 */
public class GausUtils {
	/**
	 * se encarga de hacer la reduccion inferior de gaus
	 * @param matriz  {@code List<List<Float>>}
	 * @param cantidadFilas {@code int}
	 * @param cantidadColumnas {@code int}
	 * @return {@code List<List<Float>>}
	 */
	public List<List<Float>> reduccionInferior(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas){
		/*
		 * ================================
		 * for que itera las filas de 
		 * la matriz dado (A,A)(B,A)(C,A)...
		 * =================================
		 */
		for(int filas = 0;filas < cantidadFilas;filas++) {
			float denominador = 1;
			List<Float> nodeMatriz = matriz.get(filas);
			/*
			 * ================================
			 * for que itera las columnas de 
			 * la matriz dado (A,A)(A,B)(A,C)...
			 * ================================
			 */
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				if(filas == columnas) {
					denominador = nodeMatriz.get(columnas);
				}
			}
			/*
			 * ================================
			 * for que itera las columnas de 
			 * la matriz dado (A,A)(A,B)(A,C)...
			 * =================================
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
			/*
			 * =============================================
			 * for que itera las filas de la matriz desde su 
			 * segundo indice dado que se necesita obtener la 
			 * segunda fila para hacer la comparacion entre
			 * filas 1 y 2, 2 y 3, 4 y 5..
			 * ==============================================
			 */
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
	/**
	 * se encarga de hacer la reduccion superior de gaus
	 * @param matriz {@code List<List<Float>>}
	 * @param cantidadFilas {@code int}
	 * @param cantidadColumnas {@code int}
	 * @return {@code List<List<Float>>}
	 */
	public List<List<Float>> reduccionSuperior(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas){
		/*
		 * =============================
		 * for que itera las filas de 
		 * la matriz dado (C,A)(B,A)(A,A)
		 * ==============================
		 */
		for(int filas = (cantidadFilas-1);filas >= 0;filas--) {
			List<Float> nodeMatriz = matriz.get(filas);
			/*
			 * ==============================================
			 * for que itera las filas de la matriz desde su 
			 * segundo indice dado que se necesita obtener la 
			 * segunda fila para hacer la comparacion
			 * entre filas 4 y 5, 2 y 3, 1 y 2 
			 * ==============================================
			 */
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
	/**
	 * se encarga de pintar los resultados de la matriz obteniendo el ultimo valor de las 
	 * columnas contenidas en el nodo de la matriz dentro de la iteracion de filas
	 * lo cual muestra los valores de la ultima columna que corresponde a los resultados
	 * @param matriz {@code List<List<Float>>}
	 * @param cantidadFilas {@code int}
	 * @param cantidadColumnas {@code int}
	 */
	public void resultados(List<List<Float>> matriz,int cantidadFilas,int cantidadColumnas) {
			for(int filas = 0;filas < cantidadFilas;filas++) {
				List<Float> nodeMatriz = matriz.get(filas);
				System.out.print(nodeMatriz.get((cantidadColumnas-1))+"\t");
			}
	}
}
