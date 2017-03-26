package curso;

public class paddingFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'" + padRight("hola", 6) + "'");
		System.out.println("'" + padRight2("hola", 6, "g") + "'");
		System.out.println("'" + padRightCut("hola", 2) + "'");

	}
	
	static String padRight (String text, int num) {
		
		int longitud = text.length();
		while (longitud < num) {
			text = text + " ";
			longitud = longitud + 1;
		}
		return text;
	}
	
	static String padRight2 (String text, int num, String caracter) {
		
		int longitud = text.length();
		while (longitud < num) {
			text = text + caracter;
			longitud = longitud + 1;
		}
		return text;
	}
	
	static String padRightCut (String text, int num) {
	
		
		int longitud = text.length();
	
		if (num == 0) {
			return "";
		}
		if (longitud > num) {
			text = text.substring(0, num);
			return text;
		}
		while (longitud < num) {
			text = text + " ";
			longitud = longitud + 1;
		}
		return text;
	}

}
