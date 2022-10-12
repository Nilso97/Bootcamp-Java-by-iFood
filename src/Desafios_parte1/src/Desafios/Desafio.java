// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        
        Scanner leitor = new Scanner(System.in);
		
		    // System.out.print("Informe o primeiro valor: ");
		    int a = leitor.nextInt();
		
		    // System.out.print("Informe o segundo valor: ");
		    int b = leitor.nextInt();
		
		    if (a == b) {
		       System.out.println("\nSao iguais!");
		    } else {
			     System.out.println("\nNao sao iguais!");
		    }
		
		    leitor.close();
    }
}