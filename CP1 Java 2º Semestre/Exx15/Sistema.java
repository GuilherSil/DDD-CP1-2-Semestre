package Exx15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		String nomeUsuario, nomeProduto;
		int auxContador = 1, quantidadeProdutos, opcaoNovoPedido = 1, quantidadeItem;
		double precoItem;
		
		String pathLeitura = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex15\\pedidos.txt";
		String path = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex15\\itens_pedido.txt";

		ArrayList<String> listaUsuario = new ArrayList<String>();
		
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathLeitura, true))){
					do {
						System.out.printf("\nSeu nome: ");
						nomeUsuario = ler.next();
						listaUsuario.add(nomeUsuario);
						bw.write(nomeUsuario);
						bw.newLine();
						
						System.out.printf("\nQuantos produtos quer cadastrar: ");
						quantidadeProdutos = ler.nextInt();
						
						auxContador = 1;
							while(auxContador <= quantidadeProdutos) {
								System.out.printf("\nNome do produto: ");
								nomeProduto = ler.next();
								System.out.printf("\nQuantidade do item: ");
								quantidadeItem = ler.nextInt();
								System.out.printf("\nPre?o do item: R$");
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
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
				try (BufferedReader br = new BufferedReader(new FileReader(pathLeitura))) {
					try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(path, true))){
						String line = br.readLine();
						while(line != null){
							for(String usuario : listaUsuario) {
								System.out.println(line);
								System.out.println(usuario);
								if(line.compareTo(usuario) == 0) {
									bw2.write(line);
									bw2.newLine();
									line = br.readLine();
								}
							}
		                    if(line.isEmpty() == true) {
		                    	line = br.readLine();
		                    	bw2.newLine();
		                    }
		                    
		                    for(String usuario : listaUsuario) {
								System.out.println(line);
								System.out.println(usuario);
								if(line.compareTo(usuario) == 0) {
									bw2.write(line);
									bw2.newLine();
									line = br.readLine();
								}
		                    }
							
		                    System.out.println(line + " uga");
		                    String[] listaProdutos = line.split(",");
		                    int quantidade = Integer.valueOf(listaProdutos[1]);
		                    double preco = Double.valueOf(listaProdutos[2]);
		            	    bw2.write(listaProdutos[0] + "," + (quantidade * preco));
		            	    bw2.newLine();
		            	    line = br.readLine();
		            	 }      
				}
    	    	catch(IOException e) {
    	            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
    	        }
        }
        catch(IOException e) {
            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
        }		
}
}

