package Exx18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Sistema {
public static void main(String[] args){
		
		ArrayList<Clientes> listaClientes  = new ArrayList<>();
		ArrayList<Produtos> listaProdutos = new ArrayList<>();
		
		
		
		
		String pathLeitura = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex18\\base.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathLeitura))) {
			String line = br.readLine();
			while(line != null) {
				if(line.charAt(0) == 'C') {
					String[] Cliente = line.split(",");
					Clientes cliente = new Clientes();
					Cliente[0] = Cliente[0].substring(1);
					cliente.setNome(Cliente[0]);
					cliente.setIdade(Integer.valueOf(Cliente[1]));
					cliente.setCidade(Cliente[2]);;
					listaClientes.add(cliente);
				}
				else {
					String[] Produto = line.split(",");
					Produtos produto = new Produtos();
					Produto[0] = Produto[0].substring(1);
					produto.setNome(Produto[0]);
					produto.setEstoque(Integer.valueOf(Produto[1]));
					produto.setPreco(Double.valueOf(Produto[2]));
					listaProdutos.add(produto);
				}
				line = br.readLine();
			} 
		}
		catch(IOException e) {
            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
        }
		
		System.out.println("Clientes:");
		for(Clientes cliente : listaClientes) {
			System.out.printf("\nNome: %s\nIdade: %d\nCidade: %s\n", cliente.getNome(), cliente.getIdade(), cliente.getCidade());
		}
		
		System.out.println("\nProdutos:");
		for(Produtos produto : listaProdutos) {
			System.out.printf("\nNome: %s\nQuantidade em Estoque: %d\nPreço: %.2f\n", produto.getNome(), produto.getEstoque(), produto.getPreco());
		}
}
}
	

