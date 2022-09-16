package Ex4;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;

	public String getCnpj() {
		return cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String email, String telefone, String cnpj, String razaoSocial) {
		super(email, telefone);
		
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	//Override
	public String atualizaTelefone(String telefone) {
		telefone = "+" + telefone;
		return super.atualizaTelefone(telefone);
	}
	
	//Overload
	public String atualizaTelefone(String telefone, String email) {
		telefone = "+" + telefone;
		return super.atualizaTelefone(telefone) + "\n Email da empresa: " + this.getEmail();
	}
	
}
