package Ex1;

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
	
	ContaCorrente(String numero, String agencia, double saldo, double chequeEspecial){
		super(numero, agencia, saldo);
		
		this.chequeEspecial = chequeEspecial;
	}
}
