package curso;

public class someFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sameDistance(1, 4, 7));
		System.out.println(palabras("hola puta mala pecora", 4));
		
	}
	
	static boolean sameDistance (int num, int num2, int num3) {
		boolean resultado = false;
		// String resultado = "no estan separados por la misma distancia";
		if (num3 - num2 == num2 - num) {
			// resultado = num + ", " + num2 + " y " + num3 + " estan separados por la misma distancia.";
			resultado = true;
			return resultado;
		}
		return resultado;
	}
	
	static int palabras (String text, int num) {
		int resultado = 0;
		// String resultado = "";
		String[] a = text.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() == num) {
				// resultado = resultado + a[i] + " ";
				resultado = resultado + 1;
			}
		}
		return resultado;
	}
}