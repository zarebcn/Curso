package curso;

import java.util.Random;

public class tenis {

	public static void main(String[] args) {
		
		Jugadores jugadores = new Jugadores("Rafa Nadal", "Djokovic");
		String j1 = jugadores.jugador1;
		String j2 = jugadores.jugador2;
		jugarSet(3, j1, j2);
		

	}
	static boolean jugarJuego(String j1, String j2) {
		
		Random rnd = new Random();
		int marcadorJug1 = 0;
		int marcadorJug2 = 0;
		String puntosJug1 = "0";
		String puntosJug2 = "0";
		boolean ganador = true;
		boolean finJuego = false;
		
		while (!finJuego) {
			
			int randomGolpe = rnd.nextInt(2);
			String marcadorPuntos = "";
			
			if (randomGolpe == 0) {
				marcadorJug1 = marcadorJug1 + 1;
				
				if ((marcadorJug1 > 3) && (Math.abs(marcadorJug1 - marcadorJug2) > 1)) {
					System.out.println();
					System.out.println(j1 + " gana el juego");
					System.out.println();
					marcadorJug1 = 0;
					marcadorJug2 = 0;
					ganador = true;
					finJuego = true;
				}
			}
			
			if (randomGolpe == 1) {
				marcadorJug2 = marcadorJug2 + 1;
				
				if ((marcadorJug2 > 3) && (Math.abs(marcadorJug2 - marcadorJug1) > 1)) {
					System.out.println();
					System.out.println(j2 + " gana el juego");
					System.out.println();
					marcadorJug1 = 0;
					marcadorJug2 = 0;
					ganador = false;
					finJuego = true;
				}
			}
			
			if (marcadorJug1 == 1) {
				puntosJug1 = "15";
				marcadorPuntos = puntosJug1 + " - " + puntosJug2;
			}
			if (marcadorJug1 == 2) {
				puntosJug1 = "30";
				marcadorPuntos = puntosJug1 + " - " + puntosJug2;
			}
			if (marcadorJug1 == 3) {
				puntosJug1 = "40";
				marcadorPuntos = puntosJug1 + " - " + puntosJug2;
			}
			if (marcadorJug2 == 1) {
				puntosJug2 = "15";
				marcadorPuntos = puntosJug1 + " - " + puntosJug2;
			}
			if (marcadorJug2 == 2) {
				puntosJug2 = "30";
				marcadorPuntos = puntosJug1 + " - " + puntosJug2;
			}
			if (marcadorJug2 == 3) {
				puntosJug2 = "40";
				marcadorPuntos = puntosJug1 + " - " + puntosJug2;
			}
			if (marcadorJug1 > 3 && marcadorJug2 > 3 && marcadorJug1 == marcadorJug2) {
				marcadorPuntos = "deuce";
			}
			if (marcadorJug1 > 3 && marcadorJug1 > marcadorJug2) {
				puntosJug1 = "";
				puntosJug2 = "";
				marcadorPuntos = "ventaja " + j1;
			}
			if (marcadorJug2 > 3 && marcadorJug2 > marcadorJug1) {
				puntosJug1 = "";
				puntosJug2 = "";
				marcadorPuntos = "ventaja " + j2;
			}
			
			System.out.println(marcadorPuntos);
		}
		return ganador;
	}
	
	
	static void jugarSet(double sets, String j1, String j2) {
		
		
		int juegosJug1 = 0;
		int juegosJug2 = 0;
		int setJug1 = 0;
		int setJug2 = 0;
		double set = (sets / 2) + 0.5;
		boolean finPartido = false;
		
		while (!finPartido) {
			boolean resultadoJuego = jugarJuego(j1, j2);
			if (resultadoJuego) {
				juegosJug1 = juegosJug1 + 1;
			}else {
				juegosJug2 = juegosJug2 + 1;
			}
			
			if (juegosJug1 == 6 && juegosJug2 == 6) {
				System.out.println("Tie Break");
			}
			
			if (juegosJug1 >= 6 && (Math.abs(juegosJug1 - juegosJug2) > 1) || juegosJug1 == 7 && juegosJug2 == 6) {
				setJug1 = setJug1 + 1;
				System.out.println(j1 + " gana el set por " + juegosJug1 + " a " + juegosJug2);
				System.out.println();
				juegosJug1 = 0;
				juegosJug2 = 0;
				if (setJug1 == set && setJug1 > setJug2) {
					System.out.println(j1 + " gana el partido por " + setJug1 + " sets a " + setJug2);
					finPartido = true;
				}
			}
			if (juegosJug2 >= 6 && (Math.abs(juegosJug2 - juegosJug1) > 1) || juegosJug2 == 7 && juegosJug1 == 6) {
				setJug2 = setJug2 + 1;
				System.out.println(j2 + " gana el set por " + juegosJug2 + " a " + juegosJug1);
				System.out.println();
				juegosJug1 = 0;
				juegosJug2 = 0;
				if (setJug2 == set && setJug2 > setJug1) {
					System.out.println(j2 + " gana el partido por " + setJug2 + " sets a " + setJug1);
					finPartido = true;
				}
			}
		}
	}
	
}

class Jugadores {
	
	String jugador1;
	String jugador2;
	
	Jugadores (String jugador1, String jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
}



