package curso;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche = new Coche("Renault Clio");
		System.out.println(coche.descripcion());
		
	}

}
class Coche {
	
	String brand;
	int speed;
	
	Coche (String brand) {
		this.brand = brand;
		this.speed = 0;
	}
	void accelerate(int increment) {
		this.speed = this.speed + increment;
	}
	
	void brake (int decrement) {
		this.speed = this.speed - decrement;
		if (this.speed <= 0) {
			this.speed = 0;
		}
	}
	
	void stop() {
		this.speed = 0;
	}
	
	String descripcion() {
		String resultado = "El coche " + this.brand + " va a " + this.speed + " km/h.";
		return resultado;
	}
}