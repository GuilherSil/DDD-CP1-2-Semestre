package Ex3;

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
	
	ContaPoupan�a(String numero, String agencia, double saldo, double manutencaoPendente, double rentabilidade){
		super(numero, agencia, saldo, manutencaoPendente);
		
		this.rentabilidade = rentabilidade;	
	}
	
	//Override
	public void Depositar(double valor) {
		valor -= 0.50;
		super.Depositar(valor);	
	}	
		
		
	//Overload
	public void Depositar(double valor, String agencia, String numero) {
		valor += 0.50;
	}
}
