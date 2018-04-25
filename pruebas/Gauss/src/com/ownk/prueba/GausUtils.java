package com.ownk.prueba;
import java.util.List;

/**
 * Gaus utils contiene las herramientas y las operaciones 
 * para resolver una matriz por el metodo de gaus
 * @author EroDubai
 */
public class GausUtils {
	/**
	 * se encarga de hacer la reduccion inferior de gaus
	 * remplazando los valores debajo de la diagonal de 
	 * la matriz en 0 y la diagonal en 1
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
			List<Float> nodeMatriz = matriz.get(filas);
			float denominador = 1;
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
			float tempInferior = 0,tempSuperior = 0;	
			for(int filasReduccion = (filas + 1);filasReduccion < cantidadFilas;filasReduccion++){
				List<Float> nodeMatrizReduccion = matriz.get(filasReduccion);
				for(int columnasreduccion = filas;columnasreduccion < cantidadColumnas;columnasreduccion++){
					if (columnasreduccion == filas) {
						tempSuperior = nodeMatrizReduccion.get(filas);
						tempInferior = nodeMatriz.get(filas);
					}
					float inferior = nodeMatrizReduccion.get(columnasreduccion)*tempInferior;
					float superior = nodeMatriz.get(columnasreduccion)*tempSuperior; 
					float ope = (-1)*superior + inferior;
					nodeMatrizReduccion.set(columnasreduccion,ope);
				}
			}
		}
		return matriz;
	}
	/**
	 * se encarga de hacer la reduccion superior de gaus
	 * remplazando los valores sobre la diagonal de la 
	 * matriz en 0
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
			float tempInferior = 0,tempSuperior = 0;
			for(int filasReduccion = (filas - 1);filasReduccion >= 0;filasReduccion--){
				List<Float> nodeMatrizReduccion = matriz.get(filasReduccion);
				for(int columnasreduccion = filas;columnasreduccion < cantidadColumnas;columnasreduccion++){
					if (columnasreduccion == filas) {
						tempSuperior = nodeMatrizReduccion.get(filas);
						tempInferior = nodeMatriz.get(filas);
					}
					float inferior = nodeMatrizReduccion.get(columnasreduccion)*tempInferior;
					float superior = nodeMatriz.get(columnasreduccion)*tempSuperior; 
					float ope = (-1)*superior + inferior;
					nodeMatrizReduccion.set(columnasreduccion,ope);
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
