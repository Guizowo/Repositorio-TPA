import java.util.Scanner;
public class Quadrados {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A, B, C, soma, Q1, Q2, Q3;
		
		System.out.println("Insira o valor 1: ");
		A = ler.nextInt();
		
		System.out.println("insira o valor 2: ");
		B = ler.nextInt();
		
		System.out.println("Insira o valor 3: ");
		C = ler.nextInt();
		
		Q1 = A*A;
		Q2 = B*B;
		Q3 = C*C;
		
		soma = Q1+Q2+Q3;
		
		System.out.print("A soma dos quadrados dos três valores é: " +soma);
		ler.close();
		
	}

}

