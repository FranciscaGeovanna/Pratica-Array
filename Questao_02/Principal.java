package Questao_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<>();
		
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(5);
		array1.add(6);
		array1.add(7);
		array1.add(7);
		array1.add(8);
		array1.add(9);
		array1.add(10);
		
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
		
		ComparacaoDeValores pares = new ComparacaoDeValores();
		int totalPares = pares.TotalPares(array1);
		System.out.println("A quantidade de números pares no array é: " + totalPares);
		
		ComparacaoDeValores maior = new ComparacaoDeValores();
		int maiorValor = maior.MaiorValor(array1);
		System.out.println("O número " + maiorValor +" é o maior valor no array!");
		
		ComparacaoDeValores iguais = new ComparacaoDeValores();
		int numsIguais = iguais.TotalIguais(array1, array2);
		System.out.println("Existem " + numsIguais + " números iguais no array 1 e 2!");
	}

}
