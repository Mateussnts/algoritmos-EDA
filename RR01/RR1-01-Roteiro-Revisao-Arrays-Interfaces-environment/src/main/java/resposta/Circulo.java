package resposta;

public class Circulo {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaAreaCirculo() {
		return Math.PI * raio * raio;
	}
	
}
