package Ex7;

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
	
	ContaSalario(String numero, String agencia, double saldo, double salario){
		super(numero, agencia, saldo);
		
		this.salario = salario;
	}
}
