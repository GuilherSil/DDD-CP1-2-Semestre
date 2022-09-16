package Ex6;

import java.io.IOException;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) throws IOException{
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		String email, telefone, cpf, nome, rg, cnpj, razaoSocial;
		int opcao;
		
		
		do{
            System.out.printf("\n\nEscolha uma opção:\n");
            System.out.printf("1 - Cadastro Pessoa Física \n" +
                              "2 - Cadastro Pessoa Jurídica \n" +
                              "3 - Sair \n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
			
            if(opcao == 1){
            	PessoaFisica pf = new PessoaFisica();
            	
            	System.out.printf("Digite o email: ");
            	email = ler.next();
            	pf.setEmail(email);
            	
            	System.out.printf("\nDigite o telefone: ");
            	telefone = ler.next();
            	pf.setTelefone(telefone);
            	
            	System.out.printf("\nDigite o nome: ");
            	nome = ler.next();
            	pf.setNome(nome);
            	
            	System.out.printf("\nDigite o CPF: ");
            	cpf = ler.next();
            	pf.setCpf(cpf);
            	
            	System.out.printf("\nDigite o RG: ");
            	rg = ler.next();
            	pf.setRg(rg);
            	
            	System.out.printf("\n\nNome: %s - Telefone: %s - Email: %s - RG: %s - CPF: %s", pf.getNome(), pf.getTelefone(), pf.getEmail(), pf.getRg(), pf.getCpf());
            	System.out.printf("Cadastro efetuado com sucesso!");
            	
            	System.out.printf("\nGostaria de atualizar o email? (1=S / 2=N) ");
            	opcao = ler.nextInt();
            	
            	if(opcao == 1) {
            		System.out.printf("\nDigite o email: ");
            		email = ler.next();
            		pf.atualizaEmail(email);
            		System.out.printf("\nEmail: " + pf.getEmail());
            	}
            }
            
            if(opcao == 2){
            	PessoaJuridica pj = new PessoaJuridica();
            	
            	System.out.printf("Digite o email: ");
            	email = ler.next();
            	pj.setEmail(email);
            	
            	System.out.printf("\nDigite o telefone: ");
            	telefone = ler.next();
            	pj.setTelefone(telefone);
            	
            	System.out.printf("\n Digite o CPNJ: ");
            	cnpj = ler.next();
            	pj.setCnpj(cnpj);
            	
            	System.out.printf("\n Digite a Razão Social: ");
            	razaoSocial = ler.next();
            	pj.setRazaoSocial(razaoSocial);
            	
            	System.out.printf("\n\nRazão Social: %s - Telefone: %s - Email: %s - CNPJ:  %s", pj.getRazaoSocial(), pj.getTelefone(), pj.getEmail(), pj.getCnpj());
            	System.out.printf("Cadastro efetuado com sucesso!");
            	
            	System.out.printf("\nGostaria de atualizar o email? (1=S / 2=N) ");
            	opcao = ler.nextInt();
            	
            	if(opcao == 1) {
            		System.out.printf("\nDigite o email: ");
            		email = ler.next();
            		pj.atualizaEmail(email);
            		System.out.printf("\nEmail: " + pj.getEmail());
            	}
            	
            }
            }while(opcao != 3);
	}
}
