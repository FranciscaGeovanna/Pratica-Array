package Questao_03;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		int[] arrayA = new int[10];
		
		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;
		arrayA[3] = 4;
		arrayA[4] = 5;
		arrayA[5] = 6;
		arrayA[6] = 7;
		arrayA[7] = 8;
		arrayA[8] = 9;
		arrayA[9] = 10;
		
		int[] arrayB = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe 10 valores...");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			arrayB[i] = scanner.nextInt();
		}
		
		arrays array = new arrays();
		int [] arrayC = new int[10]; 
		arrayC = array.valores(arrayA, arrayB);
		
		System.out.print("\nARRAY A: ");
		for (int num: arrayA) {
			System.out.print(num + " ");
		}
		
		System.out.print("\nARRAY B: ");
		for (int num: arrayB) {
			System.out.print(num + " ");
		}
		
		System.out.print("\nARRAY C: ");
		for (int num: arrayC) {
			System.out.print(num + " ");
		}
		
		scanner.close();
	}

}
