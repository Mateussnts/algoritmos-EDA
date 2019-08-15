package resposta;

public class Triangulo {
	private float base;
	private float altura;
	
	public Triangulo(float altura, float base) {
		this.base = base;
		this.altura = altura;
	}

	public float calculaAreaTriagulo() {
		return (base * altura) / 2;
	}
	
}
