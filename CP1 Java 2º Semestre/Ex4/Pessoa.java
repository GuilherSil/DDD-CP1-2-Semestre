package Ex4;

public class Pessoa {
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
	

	public Pessoa(){
		
	}
	
	public Pessoa(String email, String telefone){
		this.email = email;
		this.telefone = telefone;
	}
	
	public String atualizaTelefone(String telefone) {
		this.setTelefone(telefone);
		return "Número atualizado: " + this.getTelefone();
	}
}
