package Exx13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Sistema {

	public static void main(String[] args) {
		 

		
    		
    	String pathLeitura = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex13\\lista.txt";
    	String path = "D:\\Facul\\Domain Driven Design\\DDD 2\\Ex13\\total.txt";
    	
    	
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(pathLeitura))) {
     		// Obtem a primeira linha do arquivo
                String line = br.readLine();
     
               
                // Percorre o arquivo
                while(line != null){
                    System.out.println(line);
                    String[] listaProdutos = line.split(",");
                    int quantidade = Integer.valueOf(listaProdutos[1]);
                    double preco = Double.valueOf(listaProdutos[2]);
                    
            	    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            	    		bw.write(listaProdutos[0] + "," + (quantidade * preco));
            	    		bw.newLine();
            	    	}
            	    	catch(IOException e) {
            	            System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
            	        }
                    System.out.println(Arrays.toString(listaProdutos));
                    line = br.readLine();
                }
                
            }
            catch(IOException e) {
                System.out.println("Erro ao escrever no arquivo - " + e.getMessage());
            }	
    	}
    	
    } 

