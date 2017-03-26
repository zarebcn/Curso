package curso;

public class Tv {

	public static void main(String[] args) {
	
		Television tele = new Television ("Sony Bravia");
		tele.changeChannel (45);
		tele.changeChannel(60);
		System.out.println(tele.descripcion());
	}

}

class Television {
	
	String brand;
	int channel;
	int volume;
	
	Television (String brand) {
		this.brand = brand;
		this.channel = 1;
		this.volume = 50;
	}
	
	void increaseVolume (int increase) {
		this.volume = this.volume + increase;
		if (this.volume >= 100) {
			this.volume = 100;
		}
	}
	
	void decreaseVolume (int decrease) {
		this.volume = this.volume - decrease;
		if (this.volume <= 0) {
			this.volume = 0;
		}
	}
	
	/*void changeChannel (int canal) {
		int canalActual = this.channel;
		if (canal > 50) {
			this.channel = canalActual;
		} else {
			this.channel = canal;
		}
		if (canal < 1) {
			this.channel = canalActual;
		} else {
			this.channel = canal;
		}
	}*/
	/*void changeChannel (int canal) {
		int canalActual = this.channel;
		if (canal < 1 || canal > 50) {
			this.channel = canalActual;
		} else {
			this.channel = canal;
		}
	}*/
	
	void changeChannel (int canal) {
		if (canal <= 50 && canal >= 1) {
			this.channel = canal;
		}
	}
	
	void reset() {
		this.channel = 1;
		this.volume = 50;
	}
	
	String descripcion() {
		String resultado = this.brand + " at channel " + this.channel + ", volume " + this.volume;
		return resultado;
	}
	
}