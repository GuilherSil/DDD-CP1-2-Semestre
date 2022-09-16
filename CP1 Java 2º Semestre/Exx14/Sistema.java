package Exx14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nomeUsuario, nomeProduto;
		int auxContador = 1, quantidadeProdutos, opcaoNovoPedido = 1, quantidadeItem;
		double precoItem;
		
		String path = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex14\\pedidos.txt";
		

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			do {
				System.out.printf("\nSeu nome: ");
				nomeUsuario = ler.next();
				bw.write(nomeUsuario);
	    		bw.newLine();
				System.out.printf("\nQuantos produtos quer cadastrar: ");
				quantidadeProdutos = ler.nextInt();
				
					while(auxContador <= quantidadeProdutos) {
						System.out.printf("\nNome do produto: ");
						nomeProduto = ler.next();
						System.out.printf("\nQuantidade do item: ");
						quantidadeItem = ler.nextInt();
						System.out.printf("\nPreço do item: R$");
						precoItem = ler.nextDouble();
						bw.write(nomeProduto + "," + quantidadeItem + "," + precoItem);
			    		bw.newLine();
			    		
			    		auxContador += 1;
					}
					
				System.out.printf("\nGostaria de cadastrar um novo pedido? (1/S 2/N) ");
				opcaoNovoPedido = ler.nextInt();
				if(opcaoNovoPedido == 1) {
					bw.newLine();
				}
			}while(opcaoNovoPedido == 1);
		}
		catch(IOException e) {
			System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
		}
	}
}
