package curso;

import java.util.Random;

public class Tennis {

	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		int marcadorJug1 = 0;
		int marcadorJug2 = 0;
		String puntosJug1 = "0";
		String puntosJug2 = "0";
		String marcadorPuntos = "";
		int setJug1 = 0;
		int setJug2 = 0;
		int juegosJug1 = 0;
		int juegosJug2 = 0;
		
		while (marcadorJug1 < 100 || marcadorJug2 < 100) {
			int randomGolpe = rnd.nextInt(2);
			if (randomGolpe == 0) {
				marcadorJug1 = marcadorJug1 + 1;
				if ((marcadorJug1 > 3) && (Math.abs(marcadorJug1 - marcadorJug2) > 1)) {
					System.out.println();
					System.out.println("jugador 1 gana el juego");
					marcadorJug1 = 0;
					marcadorJug2 = 0;
					puntosJug1 = "0";
					puntosJug2 = "0";
					marcadorPuntos = "";
					juegosJug1 = juegosJug1 + 1;
					if (juegosJug1 >= 6 && (Math.abs(juegosJug1 - juegosJug2) > 1)) {
						setJug1 = setJug1 + 1;
						juegosJug1 = 0;
						juegosJug2 = 0;
						if (setJug1 == 2 && setJug1 > setJug2) {
							System.out.println();
							System.out.println("jugador 1 gana por " + setJug1 + " sets a " + setJug2);
							return;
						}
					}
				}
			}
			if (randomGolpe == 1) {
				marcadorJug2 = marcadorJug2 + 1;
				if ((marcadorJug2 > 3) && (Math.abs(marcadorJug2 - marcadorJug1) > 1)) {
					System.out.println();
					System.out.println("jugador 2 gana el juego");
					marcadorJug1 = 0;
					marcadorJug2 = 0;
					puntosJug1 = "0";
					puntosJug2 = "0";
					marcadorPuntos = "";
					juegosJug2 = juegosJug2 + 1;
					if (juegosJug2 >= 6 && (Math.abs(juegosJug2 - juegosJug1) > 1)) {
						setJug2 = setJug2 + 1;
						juegosJug1 = 0;
						juegosJug2 = 0;
						if (setJug2 == 2 && setJug2 > setJug1) {
							System.out.println();
							System.out.println("jugador 2 gana por " + setJug2 + " sets a " + setJug1);
							return;
						}
					}
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
				marcadorPuntos = "ventaja jugador 1";
			}
			if (marcadorJug2 > 3 && marcadorJug2 > marcadorJug1) {
				puntosJug1 = "";
				puntosJug2 = "";
				marcadorPuntos = "ventaja jugador 2";
			}
			

			System.out.println(marcadorPuntos);
			
		}
	}	
}
