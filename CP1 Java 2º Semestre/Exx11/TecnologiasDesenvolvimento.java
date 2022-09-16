package Exx11;

public abstract class TecnologiasDesenvolvimento {
	private String linguagem;
	private String principalFramework;
	private String descricaoLinguagem;
	private String descricaoFramework;
	
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getPrincipalFramework() {
		return principalFramework;
	}
	public void setPrincipalFramework(String principalFramework) {
		this.principalFramework = principalFramework;
	}
	public String getDescricaoLinguagem() {
		return descricaoLinguagem;
	}
	public void setDescricaoLinguagem(String descricaoLinguagem) {
		this.descricaoLinguagem = descricaoLinguagem;
	}
	public String getDescricaoFramework() {
		return descricaoFramework;
	}
	public void setDescricaoFramework(String descricaoFramework) {
		this.descricaoFramework = descricaoFramework;
	}
	
	public TecnologiasDesenvolvimento(){}
	
	public TecnologiasDesenvolvimento(String linguagem, String principalFramework, String descricaoLinguagem, String descricaoFramework){
		this.linguagem = linguagem;
		this.principalFramework = principalFramework;
		this.descricaoLinguagem = descricaoLinguagem;
		this.descricaoFramework = descricaoFramework;
	}
	
	
}
