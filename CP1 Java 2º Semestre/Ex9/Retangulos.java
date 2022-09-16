package Ex9;

public class Retangulos extends Quadrilateros{
	private double base, altura;
	private double perimetro;
	private double area;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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
	
	public Retangulos(){}
	
	public Retangulos(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void calculaArea(double base, double altura) {
		this.area = base * altura;
	}

	@Override
	public void calculaPerimetroQuadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.perimetro = lado1 + lado2 + lado3 + lado4;
	}
}
