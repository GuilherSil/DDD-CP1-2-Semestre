package Ex3;

public class Conta {
	private String agencia, numero;
	private double saldo, manutencaoPendente;
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getManutencaoPendente() {
		return manutencaoPendente;
	}
	public void setManutencaoPendente(double manutencaoPendente) {
		this.manutencaoPendente = manutencaoPendente;
	}
	
	public Conta() {
		
	}
	
	public Conta(String numero, String agencia, double saldo, double manutencaoPendente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.manutencaoPendente = manutencaoPendente;
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	
	
}
