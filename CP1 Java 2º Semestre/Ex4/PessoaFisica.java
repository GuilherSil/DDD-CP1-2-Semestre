package Ex4;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String nome;
	private String rg;
	private String celular;

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
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public PessoaFisica(){
		
	}
	
	public PessoaFisica(String email, String telefone, String nome, String cpf, String rg){
		super(email, telefone);
		
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	//Override
	public String atualizaTelefone(String telefone) {
		telefone = "+" + telefone;
		return super.atualizaTelefone(telefone);
	}
	
	//Overload
	public String atualizaTelefone(String telefone, String email) {
		telefone = "+" + telefone;
		return super.atualizaTelefone(telefone) + "\n Email do dono do telefone: " + this.getEmail();
	}
	
}
