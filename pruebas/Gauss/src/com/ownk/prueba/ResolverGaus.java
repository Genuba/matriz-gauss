package com.ownk.prueba;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ResolverGaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		int n = 0;
		
		System.out.println("Ingrese la cantidad de variables");
		n = sc.nextInt();

		int cantidadFilas = n;
		int cantidadColumnas = n+1;
		
		float[][] matriz = new float[cantidadFilas][cantidadColumnas];
		
		for(int filas = 0;filas < cantidadFilas;filas++) {
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				
//				matriz[filas][columnas] = 2;
				matriz[filas][columnas] =  ThreadLocalRandom.current().nextInt(1, 5 + 1);
			}	
		}
		
		System.out.println("matriz ingresada:");
		
		for(int filas = 0;filas < cantidadFilas;filas++) {
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				System.out.print(matriz[filas][columnas]+"\t");
			}
			System.out.println();
		}

		
		for(int filas = 0;filas < cantidadFilas;filas++) {
			
//			float denominador = 1;
//			
//			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
//				
//				if(filas == columnas) {
//					denominador = matriz[filas][columnas];
//				}
//			}
//			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
//				if(denominador != 0) {
//					matriz[filas][columnas] = matriz[filas][columnas]/denominador;
//				}
//			}
			for(int filasReduccion = (filas + 1);filasReduccion < cantidadFilas;filasReduccion++){
				for(int columnasreduccion = filas;columnasreduccion < cantidadColumnas;columnasreduccion++){
					matriz[filasReduccion][columnasreduccion]=(matriz[filasReduccion][columnasreduccion]*matriz[filas][filas])-((matriz[filas][columnasreduccion]*matriz[filasReduccion][columnasreduccion]));
				}
			}
		}
		
//		for(int filas = (cantidadFilas-1);filas >= 0;filas--) {
//			
//			float denominador = 1;
//			
////			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
////				
////				if(filas == columnas) {
////					denominador = matriz[filas][columnas];
////				}
////			}
////			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
////				if(denominador != 0) {
////					matriz[filas][columnas] = matriz[filas][columnas]/denominador;
////				}
////			}
//			for(int filasReduccion = (filas - 1);filasReduccion >= 0;filasReduccion--){
//				for(int columnasreduccion = filas;columnasreduccion < cantidadColumnas;columnasreduccion++){
//					matriz[filasReduccion][columnasreduccion]=(matriz[filasReduccion][columnasreduccion]*matriz[filas][filas])+((matriz[filas][columnasreduccion]*matriz[filasReduccion][columnasreduccion])*(-1));
//				}
//			}
//		}
		System.out.println("matriz de reduccion interno:");
		
		for(int filas = 0;filas < cantidadFilas;filas++) {
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				

				System.out.print(String.format("%.2f", matriz[filas][columnas])+" \t\t");
			}	
			System.out.println();
		}
		
	}

}