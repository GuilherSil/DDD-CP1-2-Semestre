package Ex6;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String nome;
	private String rg;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public PessoaFisica(){
		
	}
	
	public PessoaFisica(String email, String telefone, String nome, String cpf, String rg){
		super(email, telefone);
		
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	
	public void atualizaEmail(String email) {
		this.setEmail(email);
	}

	
	
	
	
}
