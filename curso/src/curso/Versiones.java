package curso;

import java.util.ArrayList;
import java.util.List;

public class Versiones {

	public static void main(String[] args) {
		
		compararVersiones ("2.0.0", "2-gf"); 

	}
	
	static void compararVersiones (String v1, String v2) {
		
		//divido las dos versiones en dos cadenas de string
		String[] a = v1.split("-|\\.");
		String[] b = v2.split("-|\\.");
		
		String res = "";
		String res2 = "";
		
		//creo dos listas temporales donde guardare solo los valores numericos
		List<String> temp = new ArrayList<String>();
		List<String> temp2 = new ArrayList<String>();
		
		//estos dos bucles guardan los valores numericos en las listas temporales
		for (int ind = 0; ind < a.length; ind++) {
			if (a[ind].matches("[0-9]*")) {
				temp.add(a[ind]);
			}
		}
		for (int ind = 0; ind < b.length; ind++) {
			if (b[ind].matches("[0-9]*")) {
				temp2.add(b[ind]);
			}
		}
		
		//convierto las dos listas temporales a dos cadenas de string
		String[] a1 = temp.toArray(new String[temp.size()]);
		String[] b1 = temp2.toArray(new String[temp2.size()]);
		int length1 = a1.length;
		int length2 = b1.length;
		
		//estos dos bucles meten los numeros de la version en un string sin estar separados por puntos
		for (int ind = 0; ind < a1.length; ind++) {
			res = res + a1[ind];
		}
		for (int ind = 0; ind < b1.length; ind++) {
			res2 = res2 + b1[ind];
		}
		
		//estos dos bucles comparan las longitudes de las dos cadenas de string y añade ceros a la menor
		//hasta alcanzar el tamaño de la mayor
		while (length1 < b1.length) {
			res = res + "0";
			length1 = length1 + 1;
		}
		while (length2 < a1.length) {
			res2 = res2 + "0";
			length2 = length2 + 1;
		}
		
		//convierto los numeros en string a numeros reales
		int version1 = Integer.parseInt(res);
		int version2 = Integer.parseInt(res2);
		
		//comparo las versiones y digo cual es mayor o si son iguales
		if (version1 > version2) {
			System.out.println("la version 1 es mayor");
		}else if (version2 > version1) {
			System.out.println("la version 2 es mayor");
		}else {
			System.out.println("las versiones son iguales");
		}
	}

}
