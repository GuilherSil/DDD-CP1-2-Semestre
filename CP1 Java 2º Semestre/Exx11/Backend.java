package Exx11;

public class Backend extends TecnologiasDesenvolvimento implements InterfaceTecnologias{
	private int possivelConteinerizar;

	public int getPossivelConteinerizar() {
		return possivelConteinerizar;
	}

	public void setPossivelConteinerizar(int possivelConteinerizar) {
		this.possivelConteinerizar = possivelConteinerizar;
	}

	public Backend(){}
	
	public Backend(String linguagem, String principalFramework, String descricaoLinguagem, String descricaoFramework, int possivelConteinerizar) {
		super(linguagem, principalFramework, descricaoLinguagem, descricaoFramework);
	
		this.possivelConteinerizar = possivelConteinerizar;
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
