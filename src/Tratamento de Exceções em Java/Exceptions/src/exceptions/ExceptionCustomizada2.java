package exceptions;

import javax.swing.JOptionPane;

public class ExceptionCustomizada2 {

    public static void main(String[] args) {

        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println("Resultado: " + resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.getStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}

// erro -> dividir ímpar por par - 5 / 4
// erro -> dividir número por zero - 8 / 0
// erro -> indíce faltando no array de numeradores
