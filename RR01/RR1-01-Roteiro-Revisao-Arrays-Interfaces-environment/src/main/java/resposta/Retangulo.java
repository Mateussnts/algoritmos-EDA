package resposta;

public class Retangulo {
	private float base;
	private float altura;
	
	public Retangulo(float altura, float base) {
		this.base = base;
		this.altura = altura;
	}
	
	public float calculaAreaRetangulo() {
		return base * altura;
	}
}
