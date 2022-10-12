package Lists;

import java.util.*;

public class ExemploList {

	public static void main(String[] args) {

		Double [] arrayOriginal = {7d, 8.5, 9.3, 5d, 7d, 0d, 3.6};
		
		List<Double> notas = new ArrayList<Double>();
		
		System.out.println("Desafio 1 - Crie uma lista e adicione as sete notas: ");		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas.toString());
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Desafio 2 - Exiba a posição da nota 5.0: ");
		System.out.println("Posição: " + notas.indexOf(5d));
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Desafio 3 - Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Desafio 4 - Substitua a nota 5.0 pela 6.0: ");
		notas.set(notas.indexOf(5d), 6d);
		System.out.println(notas);
		System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 5 - Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Desafio 6 - Exiba todas as notas na ordem em que foram informadas: ");
		for (Double nota : notas) System.out.println(nota);
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 7 - Exiba a terceira nota adicionada: " + notas.get(2).toString());
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 8 - Exiba a menor nota: " + Collections.min(notas));
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 9 - Exiba a maior nota: " + Collections.max(notas));
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 10 - Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 11 - Exiba a média das notas: " + (soma / notas.size()));
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 12 - Remova a nota 0: ");
		notas.remove(0d); // ou desta forma ==> notas.remove(notas.indexOf(0d));
		System.out.println(notas);
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 13 - Remova a nota na posição 0: ");
		notas.remove(0);
		System.out.println(notas);
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 14 - Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(notas);
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 15 - Apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
        System.out.println("-------------------------------------------------------");

		
		System.out.println("Desafio 16 - Confira se a lista está vazia: " + notas.isEmpty());
        
		
		System.out.println("--------------- Utilizando o LinkedList ---------------");
		System.out.println("Desafio 1 - Crie uma lista chamada notas2: ");
		List notas2 = Collections.synchronizedList(new LinkedList());
		notas2.add(5.0);
		notas2.add(8.0);
		notas2.add(9.3);
		notas2.add(5.2);
		notas2.add(7.8);
		notas2.add(0.5);
		notas2.add(3.6);
		System.out.println(notas2.toString());
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Desafio 2 - Mostre a primeira nota da nova lista sem removê-la: " + notas2.get(0));
        System.out.println("-------------------------------------------------------");
		
		
		System.out.println("Desafio 2 - Mostre a primeira nota da nova lista removendo-a: ");
		System.out.println(notas2.get(0));
		notas2.remove(0);
		System.out.println(notas2);
	}
}
