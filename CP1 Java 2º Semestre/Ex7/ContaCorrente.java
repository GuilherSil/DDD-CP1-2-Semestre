package Ex7;

public class ContaCorrente extends Conta implements AtualizaChequeEspecial{
	private double chequeEspecial;

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	ContaCorrente(){
		
	}
	
	ContaCorrente(String numero, String agencia, double saldo, double chequeEspecial){
		super(numero, agencia, saldo);
		
		this.chequeEspecial = chequeEspecial;
	}


	public void atualizaChequeEspecial(double chequeEspecial) {
		this.setChequeEspecial(chequeEspecial);
	}
}
