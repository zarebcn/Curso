package curso;

import java.util.ArrayList;
import java.util.List;

public class Versiones2 {

	public static void main(String[] args) {
		
		
		int test = compararVersiones ("2.01.2", "02.1.02");
		if (test == 0) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		/*test = compararVersiones ("4.0.01", "4.0.1");
		if (test == 0) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("5.1.2", "5.1");
		if (test == 1) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("10.1", "6.5.8");
		if (test == 1) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("3.3.1", "3.4-xxx");
		if (test == -1) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("2.1", "2.1.0");
		if (test == 0) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("7.0.6", "7.0.3");
		if (test == 1) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("0.0.1", "0.1.0");
		if (test == -1) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}
		
		test = compararVersiones ("1", "1.0.0");
		if (test == 0) {
			System.out.println("correcto");
		}else {
			System.out.println("resultado inesperado");
		}*/
		
		
		

	}
	
	static int compararVersiones (String v1, String v2) {
		
		
		String[] a = v1.split("-");
		String[] b = v2.split("-");
		
		int resultado;
		
		String a1 = a[0];
		String b1 = b[0];
		
		String[] num1 = quitarPunto(a1);
		String[] num2 = quitarPunto(b1); 
		
		String num3 = añadirCeros(num1, num2);
		String num4 = añadirCeros(num2, num1);
		
		int version1 = convertirEnNum(num3);
		int version2 = convertirEnNum(num4);
		
		resultado = comparar(version1, version2);
		
		return resultado;
	}
	
	//funciones del programa
	
	//quita el punto que separa los numeros y devuelve una cadena de String con los numeros sin el punto
	static String[] quitarPunto (String text) {
		
		String[] texto = text.split("\\.");
		List<String> temp = new ArrayList<String>();
		
		for (int ind = 0; ind < texto.length; ind++) {
			temp.add(texto[ind]);
		}
		String[] resultado = temp.toArray(new String[temp.size()]);
		return resultado;
	}
	
	//guarda el contenido de la cadena de String en un String, compara las longitudes de las dos cadenas de String 
	//y añade ceros al String si la cadena de String es de menor tamaño que la otra
	static String añadirCeros (String[] texto, String[] text) {
		
		int length = texto.length;
		String resultado = "";
		
		for (int ind = 0; ind < texto.length; ind++) {
			String a = texto[ind];
			
			/*for (int i = 0; i < texto[ind].length(); i++) {
				if (texto[ind].startsWith("0") && texto[ind].length() > 1) {
					a = texto[ind].substring(1, texto[ind].length());
				}
			}*/
			
			
			if (texto[ind].startsWith("0") && texto[ind].length() > 1) {
				a = texto[ind].substring(1, texto[ind].length());
			}
			
			resultado = resultado + a;
		}
		
		while (length < text.length) {
			resultado = resultado + "0";
			length = length + 1;
		}
		
		return resultado;
	}
	
	//convierte los numeros del String en un numero real
	static int convertirEnNum (String text) {
		
		int resultado = Integer.parseInt(text);
		return resultado;
	}
	
	//compara las dos versiones y devuelve 1 si la primera es mayor, -1 si la segunda es mayor o 0 si son iguales
	static int comparar (int version1, int version2) {
		
		int resultado;
		if (version1 > version2) {
			resultado = 1;
		}else if (version2 > version1) {
			resultado = -1;
		}else {
			resultado = 0;
		}
		return resultado;
	}

}