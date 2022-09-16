package Ex9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		
		
		double lado, base, altura, raio;
		int numFormas, auxContador, opcao, auxForQuadrado, auxForRetangulo, auxForCirculo;
		auxContador = 1;
		auxForQuadrado = 0;
		auxForRetangulo = 0;
		auxForCirculo = 0;
		
		ArrayList<Integer> listaEscolhas = new ArrayList<Integer>();
		ArrayList<Quadrados> listaQuadrados = new ArrayList<>();
		ArrayList<Retangulos> listaRetangulos = new ArrayList<>();
		ArrayList<Circulos> listaCirculos = new ArrayList<>();
		
		
		System.out.print("Digite quantas formas gostaria de criar: ");
		numFormas = ler.nextInt();
		System.out.printf("Quadrado (1)\n" 
				+ "Retângulo (2)\n"
				+ "Círculo (3)\n");
	
		for (;auxContador <= numFormas;) {
			System.out.printf("Escolha sua forma nº%d: ", auxContador);
			opcao = ler.nextInt();
			listaEscolhas.add(opcao);
			
			
		
			if(opcao == 1){
				Quadrados q = new Quadrados();
				System.out.printf("Digite o valor do lado do quadrado: ");
				lado = ler.nextDouble();
				q.setLado(lado);
				q.calculaArea(lado);
				q.calculaPerimetroQuadrilatero(lado, lado, lado, lado);
				listaQuadrados.add(q);

				auxContador += 1;
			}else if(opcao == 2) {
				Retangulos r = new Retangulos();
				System.out.printf("Digite o valor da base do retângulo: ");
				base = ler.nextDouble();
				r.setBase(base);
				System.out.printf("Digite o valor da altura do retângulo: ");
				altura = ler.nextDouble();
				r.setAltura(altura);
				r.calculaArea(base, altura);
				r.calculaPerimetroQuadrilatero(base, base, altura, altura);
				listaRetangulos.add(r);
				
				auxContador += 1;
			}else if(opcao == 3) {
				Circulos c = new Circulos();
				System.out.printf("Digite o valor do raio do circulo: ");
				raio = ler.nextDouble();
				c.setRaio(raio);
				c.calculaArea(raio);
				c.calculaPerimetro(raio);
				listaCirculos.add(c);
				
				auxContador += 1;
			}		
		}
		auxContador = 1;
		for(int i : listaEscolhas) {
			if(i == 1){
				System.out.printf("Nº%d - Quadrado -Lado: %.2f -Perímetro: %.2f -Área: %.2f\n", auxContador, listaQuadrados.get(auxForQuadrado).getLado(), listaQuadrados.get(auxForQuadrado).getPerimetro(), listaQuadrados.get(auxForQuadrado).getArea());
				auxForQuadrado += 1;
			}else if(i == 2) {
				System.out.printf("Nº%d - Retângulo -Base: %.2f -Altura: %.2f -Perímetro: %.2f -Área: %.2f\n", auxContador, listaRetangulos.get(auxForRetangulo).getBase(), listaRetangulos.get(auxForRetangulo).getAltura(), listaRetangulos.get(auxForRetangulo).getPerimetro(), listaRetangulos.get(auxForRetangulo).getArea());
				auxForRetangulo += 1;
			}else {
				System.out.printf("Nº%d - Círculo -Raio: %.2f -Perímetro: %.2f -Área: %.2f\n", auxContador, listaCirculos.get(auxForCirculo).getRaio(), listaCirculos.get(auxForCirculo).getPerimetro(), listaCirculos.get(auxForCirculo).getArea());
				auxForCirculo += 1;
			}
			auxContador += 1;
			
		}
	}
}
