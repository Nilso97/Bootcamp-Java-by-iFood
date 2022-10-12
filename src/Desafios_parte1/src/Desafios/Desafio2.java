package Desafios;

import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a, n;
		int soma = 0;

        // System.out.print("Infome o primeiro valor: ");
        a = input.nextInt();

        // System.out.print("Infome o valor final: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        
        input.close();
    }
}
