package Exx11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		
		String linguagem, principalFramework, descricaoLinguagem, descricaoFramework;
		int numFormas, auxContador, opcao, auxForBackend, auxForFrontend, conteinerizar, compatibilidade;
		auxContador = 1;
		auxForBackend = 0;
		auxForFrontend = 0;
		
		
		ArrayList<Integer> listaEscolhas = new ArrayList<Integer>();
		ArrayList<Backend> listaBackend = new ArrayList<>();
		ArrayList<Frontend> listaFrontend = new ArrayList<>();
		
		
		
		System.out.print("Digite quantas tecnologias gostaria de criar: ");
		numFormas = ler.nextInt();
		System.out.printf("Backend (1)\n" 
				+ "Frontend (2)\n");
	
		for (;auxContador <= numFormas;) {
			System.out.printf("Escolha entre Backend e Frontend nº%d: ", auxContador);
			opcao = ler.nextInt();
			listaEscolhas.add(opcao);
			
			
		
			if(opcao == 1){
				Backend b = new Backend();
				System.out.printf("Digite a linguagem de programação: ");
				linguagem = ler.next();
				b.setLinguagem(linguagem);
				System.out.printf("Descreva a linguagem: ");
				descricaoLinguagem = ler.next();
				b.setDescricaoLinguagem(descricaoLinguagem);
				
				System.out.printf("Digite o principal Framework: ");
				principalFramework = ler.next();
				b.setPrincipalFramework(principalFramework);
				System.out.printf("Descreva o Framework: ");
				descricaoFramework = ler.next();
				b.setDescricaoFramework(descricaoFramework);
				
				System.out.printf("É possível conteinerizar o desenvolvimento? (1/S) (2/N)");
				conteinerizar = ler.nextInt();
				b.setPossivelConteinerizar(conteinerizar);
				
				listaBackend.add(b);

				auxContador += 1;
			}else if(opcao == 2) {
				Frontend f = new Frontend();
				System.out.printf("Digite a linguagem de programação: ");
				linguagem = ler.next();
				f.setLinguagem(linguagem);
				System.out.printf("Descreva a linguagem: ");
				descricaoLinguagem = ler.next();
				f.setDescricaoLinguagem(descricaoLinguagem);
				
				System.out.printf("Digite o principal Framework: ");
				principalFramework = ler.next();
				f.setPrincipalFramework(principalFramework);
				System.out.printf("Descreva o Framework: ");
				descricaoFramework = ler.next();
				f.setDescricaoFramework(descricaoFramework);
				
				System.out.printf("É compatível com (1) Web ou (2) Mobile? ");
				compatibilidade = ler.nextInt();
				f.setCompatibilidade(compatibilidade);
				
				listaFrontend.add(f);

				auxContador += 1;
			}		
		}
		auxContador = 1;
		try{
			for(int i : listaEscolhas) {
				if(i == 1){
					System.out.printf("\nNº%d - Backend -Linguagem: %s -Descrição: %s -Principal Framework: %s -Descrição: %s -Possível Conteinerizar: %d (1/S 2/N)", auxContador, listaBackend.get(auxForBackend).getLinguagem(), listaBackend.get(auxForBackend).getDescricaoLinguagem(), listaBackend.get(auxForBackend).getPrincipalFramework(), listaBackend.get(auxForBackend).getDescricaoFramework(), listaBackend.get(auxForBackend).getPossivelConteinerizar());
					auxForBackend += 1;
				}else if(i == 2) {
					System.out.printf("\nNº%d - Frontend -Linguagem: %s -Descrição: %s -Principal Framework: %s -Descrição: %s -Compatibilidade: %d (1/Web 2/Mobile)", auxContador, listaFrontend.get(auxForFrontend).getLinguagem(), listaFrontend.get(auxForFrontend).getDescricaoLinguagem(), listaFrontend.get(auxForFrontend).getPrincipalFramework(), listaFrontend.get(auxForFrontend).getDescricaoFramework(), listaFrontend.get(auxForFrontend).getCompatibilidade());
					auxForFrontend += 1;
				}
				auxContador += 1;
			}
			}catch(IndexOutOfBoundsException e) {
				System.out.printf("Foi escolhido um número inválido no 'Escolha sua tecnologia nº%d'.", auxContador);
			}finally {
				System.out.printf("\n%d de %d tecnologia(s) feita(s).", auxContador - 1, numFormas);
			}
	}
}
