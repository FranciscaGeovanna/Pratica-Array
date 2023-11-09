package Questao_02;

import java.util.ArrayList;

public class ComparacaoDeValores {
	public int TotalPares(ArrayList<Integer> numeros) {
		int numPares = 0;
		
		for (int num: numeros) {
			if(num % 2 == 0) {
				numPares++;
			}
		}
		return numPares;
	}
	
	public int MaiorValor(ArrayList<Integer> numeros) {
		int maiorNum = numeros.get(0);
		
		for (int num: numeros) {
			if(num > maiorNum) {
				maiorNum = num;
			}
		}
		return maiorNum;
	}
	
	public int TotalIguais(ArrayList<Integer> numeros1, ArrayList<Integer> numeros2){
		int numIguais = 0;
		
		for (int num: numeros1) {
			for(int nums: numeros2) {
				if(num == nums) {
					System.out.println("Os números iguais são: " + num);
					numIguais++;
				}
			}
		}
		return numIguais;
	}
}
