package com.ownk.prueba;
import java.util.Scanner;

public class ResolverGaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		MatrizUtils mu = new MatrizUtils();
		GausUtils gu = new GausUtils();
		int n = 0;
		
		System.out.println("Ingrese la cantidad de variables");
		n = sc.nextInt();
		
		float[][] matriz = mu.obtenerMatriz(n);
		
		System.out.println("matriz ingresada:");
		mu.pintarMatriz(matriz);
		
		System.out.println("matriz reduccion inferior:");
		matriz = gu.reduccionInferior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		
		System.out.println("matriz reduccion superior:");
		matriz = gu.reduccionSuperior(matriz,mu.getCantidadFilas(),mu.getCantidadColumnas());
		mu.pintarMatriz(matriz);
		
	}

}