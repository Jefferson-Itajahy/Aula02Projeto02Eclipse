package br.com.generation.lacocondicional;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a 1� Nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a 2� Nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
    	if(media >= 9.0) {
    		System.out.println("\nAprovado com m�rito" + "\nM�dia: " + media);
		}
    	else if(media >=6.0 && media <9.0) {
    		System.out.println("\nAprovado" + "\nM�dia: " + media);
    	}
    	else if(media >= 3.0 && media <6.0) {
    		System.out.println("\nRecupera��o" + "\nM�dia: " + media);
    	}
    	else {
    		System.out.println("\nReprovado" + "\nM�dia: " + media);
    	}
    	ler.close();
	}
}
