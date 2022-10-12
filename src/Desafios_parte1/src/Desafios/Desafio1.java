package Desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		//TODO: Imprima se os valores numéricos passados são iguais ou não.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int a = leitor.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int b = leitor.nextInt();
		
		if (a == b) {
			System.out.println("\nSao iguais!");
		} else {
			System.out.println("\nNao sao iguais!");
		}
		
		leitor.close();
	}
}
