package Exx12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sistema {
 
    public static void main(String[] args) {
 
    	@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
    		
    	String path = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex12\\lista.txt";
    	
    	
    	
    	for(int i = 0;i < 3; i++) {
	    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
	    		System.out.printf("O nome do produto: ");
	    		String nomeProduto = ler.next();
	    		System.out.printf("A quantidade: ");
	    		int quantidade = ler.nextInt();
	    		System.out.printf("O preço: R$");
	    		double preco = ler.nextDouble();
	    		bw.write(nomeProduto + "," + quantidade + "," + preco);
	    		bw.newLine();
	    	}
	    	catch(IOException e) {
	            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
	        }
    	}
    	
    }    	
}