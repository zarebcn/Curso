package curso;

public class ovenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oven horno = new Oven ();
		horno.turnOn();
		horno.increaseTemperature(40);
		horno.increaseTemperature(60);
		System.out.println(horno.estadoHorno());

	}
}
class Oven {
		
	boolean isOn;
	int temperature;
		
	Oven () {
		this.temperature = 0;
		this.isOn = false;
	}
		
	void increaseTemperature (int increase) {
		if (this.isOn == true) {
			this.temperature = this.temperature + increase;
		}
	}
		
	void turnOn () {
		this.isOn = true;
	}
		
	void turnOff() {
		this.isOn = false;
		this.temperature = 0;
	}
		
	String estadoHorno () {
		String resultado = "";
		if (this.isOn) {
			resultado = "el horno esta encendido a " + this.temperature + " grados";
		} else {
			resultado = "el horno esta apagado";
		}
		return resultado;
	}
		
}

