import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i, valor = 0;
		float soma = 0;
		a = new int[TAM];
		
		// Lendo o vetor
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}
		
		// Calculando a m�dia
		for (i=0; i<TAM; i++) {
			soma = soma+a[i];		
		}
		soma = soma/i;
		System.out.println("A m�dia do vetor � "+soma);
		
		// Identificando o maior
		for (i=0; i<TAM; i++) {
			if (valor < a[i]) {
				valor = a[i];	
			}
		}
		System.out.println("O maior n�mero � "+valor+" e sua posi��o no vetor � "+i);
	}

}
