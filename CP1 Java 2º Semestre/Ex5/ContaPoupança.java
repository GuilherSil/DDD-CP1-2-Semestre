package Ex5;

public class ContaPoupanša extends Conta{
	private double rentabilidade;

	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	ContaPoupanša(){
		
	}
	
	ContaPoupanša(String numero, String agencia, double saldo, double rentabilidade){
		super(numero, agencia, saldo);
		
		this.rentabilidade = rentabilidade;
	}
	
	public void Sacar(double saldo, double valor) {
		this.setSaldo(saldo - (valor - 2));
	}
}
