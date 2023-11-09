package Questao_03;

public class arrays {
	public int[] valores(int[] A, int[] B) {		
		int[] C = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			C[i] = A[i] * B[i];
		}
		
		return C;
	}
}
