package br.com.generation.lacocondicional;

import java.util.Scanner;

public class LacoCondicional02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2, resultado = 0.0;
		String operacao;
		
		System.out.println("Digite o 1� N�mero: ");
		numero1 = ler.nextDouble();
		
		System.out.println("Digite a opera��o: ");
		operacao = ler.nextLine();
		
		System.out.println("Digite o 2� N�mero: ");
		numero2 = ler.nextDouble();
		
		if(operacao == "+" && operacao == "A") {
			resultado = numero1 + numero2;
		}
		else if(operacao == "-") {
			resultado = numero1 - numero2;
		}
		else if(operacao == "*") {
			resultado = numero1 * numero2;
		}
		else if(operacao == "/") {
			resultado = numero1 / numero2;
		}
		System.out.println("Resultado: " + resultado);

	}
	

}
