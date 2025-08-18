package view;
import controller.Recursiva;
public class Main {

	public static void main(String[] args) {
		Recursiva rec= new Recursiva();
		int A= 20;
		int B= 24;
		int result= rec.divisorComum(A, B);
		System.out.println(result);
	}

}
