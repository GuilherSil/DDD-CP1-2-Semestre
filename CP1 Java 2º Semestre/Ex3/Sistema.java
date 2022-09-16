package Ex3;

import java.io.IOException;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		String numero, agencia;
		double saldo, chequeEspecial, rentabilidade, salario, manutencaoPendente, valor;
		
		do {
            System.out.printf("\nEscolha uma op��o:\n");
            System.out.printf("1 - Criar Conta Corrente \n" +
                              "2 - Criar Conta Poupan�a \n" +
                              "3 - Criar Conta Sal�rio \n" +
                              "4 - Sair \n\n");
            System.out.printf("Digite a op��o desejada: ");
            opcao = ler.nextInt();
			
            if (opcao == 1){
            	ContaCorrente cc = new ContaCorrente();
            	
            	System.out.printf("\nDigite o n�mero da conta: ");
            	numero = ler.next();
            	cc.setNumero(numero);
            	
            	System.out.printf("\nDigite a ag�ncia da conta: ");
            	agencia = ler.next();
            	cc.setAgencia(agencia);
            	
            	System.out.printf("\nDigite o saldo da conta: ");
            	saldo = ler.nextDouble();
            	cc.setSaldo(saldo);
            	
            	System.out.printf("\nDigite o valor do cheque especial: ");
            	chequeEspecial = ler.nextDouble();
            	cc.setChequeEspecial(chequeEspecial);
            	
            	manutencaoPendente = 100;
            	cc.setManutencaoPendente(manutencaoPendente);
            	
            	System.out.printf("\nPressione enter para rever os dados.");
            	System.in.read();
            	
            	System.out.printf("\n\nN�mero: %s - Ag�ncia: %s - Saldo: %.2f - Cheque Especial: %.2f", cc.getNumero(), cc.getAgencia(), cc.getSaldo(), cc.getChequeEspecial());
            	
            	
            	System.out.printf("\nGostaria de fazer um dep�sito? (1=S / 2=N) ");
            	opcao = ler.nextInt();
            	
            	if(opcao == 1) {
            		System.out.printf("\nDigite o valor do dep�sito: ");
            		valor = ler.nextInt();
            		cc.Depositar(valor);
            		System.out.printf("\nSaldo: " + cc.getSaldo());
            	}
            	
            	
            }
            
            if (opcao == 2){
            	ContaPoupan�a cp = new ContaPoupan�a();
            	
            	System.out.printf("\nDigite o n�mero da conta: ");
            	numero = ler.next();
            	cp.setNumero(numero);
            	
            	System.out.printf("\nDigite a ag�ncia da conta: ");
            	agencia = ler.next();
            	cp.setAgencia(agencia);
            	
            	System.out.printf("\nDigite o saldo da conta: ");
            	saldo = ler.nextDouble();
            	cp.setSaldo(saldo);
            	
            	System.out.printf("\nDigite o valor da rentabilidade: ");
            	rentabilidade = ler.nextDouble();
            	cp.setRentabilidade(rentabilidade);
            	
            	System.out.printf("\nPressione enter para rever os dados.");
            	System.in.read();
            	System.out.printf("\n\nN�mero: %s - Ag�ncia: %s - Saldo: %.2f - Rentabilidade: %%.2f", cp.getNumero(), cp.getAgencia(), cp.getSaldo(), cp.getRentabilidade());
            	
            	manutencaoPendente = 200;
            	cp.setManutencaoPendente(manutencaoPendente);

            	System.out.printf("\nGostaria de fazer um dep�sito? (1=S / 2=N) ");
            	opcao = ler.nextInt();
            	
            	if(opcao == 1) {
            		System.out.printf("\nDigite o valor do dep�sito: ");
            		valor = ler.nextInt();
            		cp.Depositar(valor);
            		System.out.printf("\nSaldo: " + cp.getSaldo());
            	}
            }
            
            if (opcao == 3){
            	ContaSalario cs = new ContaSalario();
            	
            	
            	System.out.printf("\nDigite o n�mero da conta: ");
            	numero = ler.next();
            	cs.setNumero(numero);
            	
            	System.out.printf("\nDigite a ag�ncia da conta: ");
            	agencia = ler.next();
            	cs.setAgencia(agencia);
            	
            	System.out.printf("\nDigite o saldo da conta: ");
            	saldo = ler.nextDouble();
            	cs.setSaldo(saldo);
            	
            	System.out.printf("\nDigite o valor do sal�rio: ");
            	salario = ler.nextDouble();
            	cs.setSalario(salario);;
            	
            	System.out.printf("\nPressione enter para rever os dados.");
            	System.in.read();
            	System.out.printf("\n\nN�mero: %s - Ag�ncia: %s - Saldo: %.2f - Sal�rio: %.2f", cs.getNumero(), cs.getAgencia(), cs.getSaldo(), cs.getSalario());
            	
            	manutencaoPendente = 0;
            	cs.setManutencaoPendente(manutencaoPendente);
        	
            	System.out.printf("\nGostaria de fazer um dep�sito? (1=S / 2=N) ");
            	opcao = ler.nextInt();
            	
            	if(opcao == 1) {
            		System.out.printf("\nDigite o valor do dep�sito: ");
            		valor = ler.nextInt();
            		cs.Depositar(valor);
            		System.out.printf("\nSaldo: " + cs.getSaldo());
            	}
            }
			
		}while (opcao != 4);
	}
}
