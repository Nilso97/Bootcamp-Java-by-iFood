package br.com.springboot.primeirospassos;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    
    public int Somar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
