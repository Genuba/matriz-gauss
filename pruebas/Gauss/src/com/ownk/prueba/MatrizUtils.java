package com.ownk.prueba;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizUtils {
	private int cantidadFilas,cantidadColumnas;
	private List<List<Float>> matriz;
	private List<Float> nodeMatriz;
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
			if(snd.equals("*")) {
				temp = false;
				matriz.add(nodeMatriz);
			}else {
				nd = new Float(snd).floatValue();
				nodeMatriz.add(new Float(nd));
			}
		}while(temp);	
		
		cantidadFilas = nodeMatriz.size(); 
		cantidadColumnas = nodeMatriz.size()+1;
		
		for(int filas = 1;filas < cantidadFilas;filas++) {
			for(int columnas = 0;columnas < cantidadColumnas;columnas++) {
				System.out.println("ingrese el valor para la pocision ("+filas+","+columnas+"):");
				nodeMatriz.add(sc.nextFloat());
			}	
			matriz.add(nodeMatriz);
		}
	}
	public void pintarMatriz() {
		for(Float ma: nodeMatriz) {
				System.out.println(ma+" ");
		}
	}
	public int getCantidadFilas() {
		return cantidadFilas;
	}
	public int getCantidadColumnas() {
		return cantidadColumnas;
	}
}
