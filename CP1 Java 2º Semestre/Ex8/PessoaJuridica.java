package Ex8;

public class PessoaJuridica extends Pessoa implements atualizaPessoa, atualizaPessoaJuridica{
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

	@Override
	public void atualizaCnpjRazaoSocial(String cnpj, String razaoSocial) {
		this.setCnpj(cnpj);
		this.setRazaoSocial(razaoSocial);	
	}

	@Override
	public void atualizaEmailTelefone(String email, String telefone) {
		this.setEmail(email);
		this.setTelefone(telefone);
	}

	
}
