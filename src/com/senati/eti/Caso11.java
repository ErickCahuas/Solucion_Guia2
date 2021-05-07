package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero: ");
		int n = sc.nextInt();
		
		String dia = "";
		
		// Condicional m�ltiple
		switch (n) {
		    case 1:
		    	dia = "Domingo";
		    	break;
		    case 2:
		    	dia = "Lunes";
		    	break;
		    case 3:
		    	dia = "Martes";
		    	break;
		    case 4:
		    	dia = "Miercoles";
		    	break;
		    case 5:
		    	dia = "Jueves";
		    	break;
		    case 6:
		    	dia = "Viernes";
		    	break;
		    case 7:
		    	dia = "S�bado";
		    	break;
		    default:
		    	dia = "Desconocido";
		    	
		}
		
		System.out.println("\nRESULTADOS");
		System.out.println("------------");
		System.out.println("D�as de la semana......: " + dia);

	}

}
