package Ex8;

public class PessoaFisica extends Pessoa implements atualizaPessoa, atualizaPessoaFisica{
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

	@Override
	public void atualizaCpfNomeRg(String cpf, String nome, String rg) {
		
		this.setCpf(cpf);
		this.setNome(nome);
		this.setRg(rg);	
	}
	@Override
	public void atualizaEmailTelefone(String email, String telefone) {
		this.setEmail(email);
		this.setTelefone(telefone);	
	}

	
	
}
