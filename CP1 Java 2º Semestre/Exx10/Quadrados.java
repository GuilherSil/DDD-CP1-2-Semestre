package Exx10;

public class Quadrados extends Quadrilateros{
	private double lado;
	private double perimetro;
	private double area;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
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
	
	public Quadrados(){}
	
	public Quadrados(double lado) {
		this.lado = lado;
	}


	@Override
	public void calculaPerimetroQuadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.perimetro = lado1 + lado2 + lado3 + lado4;
	}
	
	public void calculaArea(double lado) {
		this.area = lado * lado;
	}
	

}
