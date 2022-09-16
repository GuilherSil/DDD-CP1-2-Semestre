package Ex1;

public class ContaPoupança extends Conta{
	private double rentabilidade;

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	ContaPoupança(){
		
	}
	
	ContaPoupança(String numero, String agencia, double saldo, double rentabilidade){
		super(numero, agencia, saldo);
		
		this.rentabilidade = rentabilidade;
	}
}
