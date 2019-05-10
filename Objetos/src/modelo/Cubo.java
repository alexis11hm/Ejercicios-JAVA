package modelo;

public class Cubo extends Cuadrado {

	public Cubo(float lado) {
		super(lado);
	}

	public float calcularVolumen() {
		return (float)Math.pow(getLado(), 3);
	}
	
	public float calcularPerimetro() {
		return getLado()*12;
	}

}
