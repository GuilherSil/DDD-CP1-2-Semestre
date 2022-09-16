package Ex9;

public class Circulos{
	private double raio;
	private double perimetro;
	private double area;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public Circulos(){}
	
	public Circulos(double raio) {
		this.raio = raio;
	}

	public void calculaPerimetro(double raio) {
		this.perimetro = 2 * 3.14 * raio;	
	}

	public void calculaArea(double raio) {
		this.area = 3.14 * (raio * raio);
	}

	

	
	

	

	

	
	

	
	

	
}
