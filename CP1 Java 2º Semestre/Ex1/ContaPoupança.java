package Ex1;

public class ContaPoupan�a extends Conta{
	private double rentabilidade;

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	ContaPoupan�a(){
		
	}
	
	ContaPoupan�a(String numero, String agencia, double saldo, double rentabilidade){
		super(numero, agencia, saldo);
		
		this.rentabilidade = rentabilidade;
	}
}
