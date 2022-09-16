package Exx11;

public class Frontend extends TecnologiasDesenvolvimento implements InterfaceTecnologias{
	private int compatibilidade;

	public int getCompatibilidade() {
		return compatibilidade;
	}

	public void setCompatibilidade(int compatibilidade) {
		this.compatibilidade = compatibilidade;
	}

	public Frontend(){}
	
	public Frontend(String linguagem, String principalFramework, String descricaoLinguagem, String descricaoFramework, int compatibilidade) {
		super(linguagem, principalFramework, descricaoLinguagem, descricaoFramework);
	
		this.compatibilidade = compatibilidade;
	}
	
	@Override
	public void descricaoLinguagem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descricaoFramework() {
		// TODO Auto-generated method stub
		
	}
}
