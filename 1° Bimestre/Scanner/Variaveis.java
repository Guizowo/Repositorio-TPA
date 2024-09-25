import java.util.Scanner;
public class Variaveis {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int A,B,C;
		
		System.out.println("Insira o valor A");
		A = ler.nextInt();
		
		System.out.println("Insira o valor B");
		B = ler.nextInt();
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("Os valores foram trocados");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		ler.close();
	}

}
