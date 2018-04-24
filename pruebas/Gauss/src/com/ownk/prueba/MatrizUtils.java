package com.ownk.prueba;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizUtils {
	private int cantidadFilas,cantidadColumnas;
	private List<List<Float>> matriz;
	private List<Float> nodeMatriz;
	private Scanner sc;

	public List<List<Float>> obtenerMatriz(){
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
			if(snd.equals("*")) {
				temp = false;
				matriz.add(nodeMatriz);
			}else {
				try {
					nd = new Float(snd).floatValue();
					nodeMatriz.add(new Float(nd));
				} catch (Exception e) {
					System.out.println("ingrese solo enteros");
					System.exit(0);
				}
			}
		}while(temp);	
		
		cantidadFilas = nodeMatriz.size() - 1; 
		cantidadColumnas = nodeMatriz.size();
		
		for(int filas = 1;filas < cantidadFilas;filas++) {
			nodeMatriz = new ArrayList<Float>();
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				System.out.println("ingrese el valor para la pocision ("+filas+","+columnas+"):");
				try {
					nodeMatriz.add(sc.nextFloat());
				} catch (Exception e) {
					System.out.println("ingrese solo enteros");
					System.exit(0);
				}
			}
			matriz.add(nodeMatriz);
		}
		return matriz;
	}
	public void pintarMatriz(List<List<Float>> matriz) {
		for(int filas = 0;filas < cantidadFilas;filas++) {
			List<Float> nodeMatriz = matriz.get(filas);
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				System.out.print(nodeMatriz.get(columnas)+"\t");
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
