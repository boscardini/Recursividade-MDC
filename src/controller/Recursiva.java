package controller;

public class Recursiva {
	public Recursiva() {
		super();
	}
	public int divisorComum (int A, int B) {
		if (A==B) {
			return A;
		}
		if (A>B) {
			return divisorComum(A-B,B);
		}
		return divisorComum(B,A);
	}
}
