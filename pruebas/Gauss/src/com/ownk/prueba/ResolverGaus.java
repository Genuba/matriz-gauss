package com.ownk.prueba;
import java.util.List;

public class ResolverGaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrizUtils mu = new MatrizUtils();
		GausUtils gu = new GausUtils();
		
		System.out.println("MATRIZ DE GAUS");
		System.out.println("Ingrese los valores de la matriz de gaus dado que NxN la ultima fila son los resultados");
		System.out.println("de las ecuciones coloque el simbolo de * para indicar el fin de las columnas\n");
		
		List<List<Float>> matriz = mu.obtenerMatriz();
		
		System.out.println("matriz ingresada:\n");
		mu.pintarMatriz(matriz);

		System.out.println("\nmatriz reduccion inferior:\n");
		matriz = gu.reduccionInferior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		
		System.out.println("\nmatriz reduccion superior:\n");
		matriz = gu.reduccionSuperior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);

		System.out.print("\nResultados: ");
		gu.resultados(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		
	}

}