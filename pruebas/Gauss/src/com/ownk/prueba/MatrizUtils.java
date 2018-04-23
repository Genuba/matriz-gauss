package com.ownk.prueba;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizUtils {
	private int cantidadFilas,cantidadColumnas;
	private List<List<Float>> matriz;
	List<Float> nodeMatriz;
	private Scanner sc;

	public void obtenerMatriz(){
		sc = new Scanner(System.in); 
		matriz = new ArrayList<List<Float>>();
		nodeMatriz = new ArrayList<Float>();
		
		int cont = 0;
		String snd = "";
		float nd = 0;
		boolean temp = true;
		
		do {
			System.out.println("ingrese el valor para la pocision (0,"+cont+"):");
			cont++;
			snd = sc.nextLine();
			if(snd != "*") {
				//nd = new Float(snd).floatValue();
				nodeMatriz.add(new Float(nd));
			}else {
				temp = false;
				matriz.add(nodeMatriz);
			}
		}while(temp);	
		
		cantidadFilas = nodeMatriz.size(); 
		cantidadColumnas = nodeMatriz.size()+1;
		
//		for(int filas = 1;filas < cantidadFilas;filas++) {
//			for(int columnas = 1;columnas < cantidadColumnas;columnas++) {
//				System.out.println("ingrese valor para la posicion("+filas+","+columnas+"):");
//				nodeMatriz.add(sc.nextFloat());
//			}	
//			matriz.add(nodeMatriz);
//		}
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
