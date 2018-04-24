package com.ownk.prueba;
import java.util.List;

public class ResolverGaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrizUtils mu = new MatrizUtils();
		GausUtils gu = new GausUtils();
		
		List<List<Float>> matriz = mu.obtenerMatriz();
		
		System.out.println("matriz ingresada:");
		mu.pintarMatriz(matriz);
		
		System.out.println();

		System.out.println("matriz reduccion inferior:");
		matriz = gu.reduccionInferior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		
		System.out.println("matriz reduccion superior:");
		matriz = gu.reduccionSuperior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		
	}

}