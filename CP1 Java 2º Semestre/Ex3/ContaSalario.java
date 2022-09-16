package Ex3;

public class ContaSalario extends Conta{
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	ContaSalario(){
		
	}
	
	ContaSalario(String numero, String agencia, double saldo, double manutencaoPendente, double salario){
		super(numero, agencia, saldo, manutencaoPendente);
		
		this.salario = salario;
	}
	
	//Override
		public void Depositar(double valor) {
			valor += 1;
			super.Depositar(valor);	
	}	
			
			
	//Overload
	public void Depositar(double valor, String agencia, String numero) {
		valor += 0.50;
	}
}
