package br.com.generation.lacocondicional;

import java.util.Scanner;

public class LacoCondicional03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite uma letra a e d");
		String letra = entrada.nextLine();
		
		switch(letra) {
			case "a" , "A" , "aaaa":
				System.out.println("Ana");
			break;
			
			case "b":
				System.out.println("Bruna");
			break;
			
			case "c":
				System.out.println("Cassimiro");
			break;
			
			case "d":
				System.out.println("Djan");
			break;
			default:
				System.out.println("Letra Inválida!");
		}
		

	}

}
