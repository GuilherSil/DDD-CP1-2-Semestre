package Exx17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sistema {
	public static void main(String[] args){
		
		ArrayList<Vestibulandos> listaVestibulandos  = new ArrayList<>();
		
		
		
		
		String pathLeitura = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex17\\Vestibulandos.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathLeitura))) {
			String line = br.readLine();
			while(line != null) {
				Vestibulandos vb = new Vestibulandos();
				String[] listaProdutos = line.split(",");
				if(Double.valueOf(listaProdutos[1]) >= 7) {
					vb.setNome(listaProdutos[0]);
					vb.setNota(Double.valueOf(listaProdutos[1]));
					vb.setCidade(listaProdutos[2]);
					listaVestibulandos.add(vb);
				}
				line = br.readLine();  
			}
		}
		catch(IOException e) {
            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
        }
		
		for(Vestibulandos vestibulando : listaVestibulandos) {
			System.out.printf("Nome: %s \nNota: %.2f\nCidade: %s\n\n",vestibulando.getNome(), vestibulando.getNota(), vestibulando.getCidade());
		}
	}
	
}
