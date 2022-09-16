package Ex6;

public abstract class Pessoa {
	private String email;
	private String telefone;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Pessoa(){}
	
	public Pessoa(String email, String telefone){
		this.email = email;
		this.telefone = telefone;
	}
	
	public abstract void atualizaEmail(String email);
}
