package com.ownk.prueba;
//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrizUtils {
	private int cantidadFilas,cantidadColumnas;
	private float[][] matriz;
//	private Scanner sc;

	public float[][] obtenerMatriz(int n){
//		sc = new Scanner(System.in); 
		cantidadFilas = n; 
		cantidadColumnas = n+1;
		matriz = new float[cantidadFilas][cantidadColumnas];
		for(int filas = 0;filas < cantidadFilas;filas++) {
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
//				System.out.println("ingrese valor para la posicion("+filas+","+columnas+"):");
//				matriz[filas][columnas] = sc.nextInt();
				matriz[filas][columnas] =  ThreadLocalRandom.current().nextInt(1, 5 + 1);
			}	
		}
		return matriz;
	}
	public void pintarMatriz(float[][] matriz) {
		for(int filas = 0;filas < cantidadFilas;filas++) {
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				System.out.print(matriz[filas][columnas]+"\t");
			}
			System.out.println();
		}
	}
	public int getCantidadFilas() {
		return cantidadFilas;
	}
	public int getCantidadColumnas() {
		return cantidadColumnas;
	}
}
