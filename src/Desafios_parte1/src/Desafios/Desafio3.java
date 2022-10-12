package Desafios;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        // System.out.print("Informe um valor: ");
		    int valor = somatorio(numero.nextInt());
		
		    System.out.println(valor);
		
		    numero.close();
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
