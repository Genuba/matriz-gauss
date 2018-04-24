package com.ownk.prueba;
import java.util.List;

/**
 * Resolver matriz por metodo de Gaus
 * @author EroDubai
 */
public class ResolverGaus {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrizUtils mu = new MatrizUtils();
		GausUtils gu = new GausUtils();
		
		System.out.println("MATRIZ DE GAUS");
		System.out.println("Ingrese los valores de la matriz de gaus dado que NxN la ultima fila son los resultados");
		System.out.println("de las ecuciones coloque el simbolo de * para indicar el fin de las columnas\n");
		
		/*
		 * ===============================================
		 * obtiene la matriz de la funcion obtener matriz
	 	 * =============================================== 
		 */
		List<List<Float>> matriz = mu.obtenerMatriz();
		
		System.out.println("matriz ingresada:\n");
		/*
		 * ===============================================
		 * se pinta la matriz por medio de la funcion 
		 * pintar matriz
	 	 * =============================================== 
		 */
		mu.pintarMatriz(matriz);

		System.out.println("\nmatriz reduccion inferior:\n");
		/*
		 * ===============================================
		 * se obtiene la matriz con la reduccion inferior 
		 * de la matriz por medio de la funcion reducion 
		 * inferior y se muestra con pintar matriz
	 	 * =============================================== 
		 */
		matriz = gu.reduccionInferior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		
		System.out.println("\nmatriz reduccion superior:\n");
		/*
		 * ===============================================
		 * se obtiene la matriz con la reduccion superior 
		 * de la matriz por medio de la funcion reducion 
		 * superior y se muestra con pintar matriz
	 	 * =============================================== 
		 */
		matriz = gu.reduccionSuperior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		System.out.print("\nResultados: ");
		/*
		 * =================================================
		 * pinta la lista de resultados de la matriz de gaus
	 	 * =================================================
		 */
		gu.resultados(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		
	}

}