package Desafios;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int posicao = -1;
        int [] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        
        // System.out.print("Digite um valor: ");
        int valor = leitor.nextInt();
        
        posicao = buscarValor(valor, elementos);
        
        if (posicao == -1) {
            System.out.println("Numero " + valor + " nao encontrado! ");
       } else {
            System.out.println("Achei " + valor + " na posicao " + posicao);
       }
    }
    
    static int buscarValor(int numero, int[] elementos) {
        int posicao = -1;
        
        for (int i = 0; i < elementos.length; i++) {
            if (numero == elementos[i]) {
                posicao = i;
            }
        }
        
        return posicao;
    }
}


/*
 * 
 * Outra forma de realizar o Desafio 5
 *
 * 
package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        // System.out.print("Digite um valor: ");
        int valor = leitor.nextInt();
        
        int posicao = buscarValor(valor, elementos);

        leitor.close();
    }
    
    static int buscarValor(int valor, Integer[] elementos) {
        int posicao = Arrays.asList(elementos).indexOf(valor);

        if (posicao != -1) {
            System.out.println("Achei " + valor + " na posicao " + posicao);
        } else {
            System.out.println("Numero " + valor + " nao encontrado! ");
        }
        
        return posicao;
    }
}
*/
