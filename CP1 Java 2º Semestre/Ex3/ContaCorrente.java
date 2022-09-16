package Ex3;

public class ContaCorrente extends Conta{
	private double chequeEspecial;

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	ContaCorrente(){
		
	}
	
	ContaCorrente(String numero, String agencia, double saldo, double manutencaoPendente, double chequeEspecial){
		super(numero, agencia, saldo, manutencaoPendente);
		
		this.chequeEspecial = chequeEspecial;
	}
	
	//Override
	public void Depositar(double valor) {
		valor += 0.50;
		super.Depositar(valor);	
	}	
	
	
	//Overload
	public void Depositar(double valor, String agencia, String numero) {
		valor += 0.50;
	}
	
	
}
