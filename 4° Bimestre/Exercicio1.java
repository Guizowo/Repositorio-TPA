//Criar um programa que leia um vetor A com 10 posiçoes de inteiro e imprima na tela
//um vetor B sendo que cada elemento B seja o quadrad de A
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			b[i] = a[i] * a[i];
		}
		
		// apresentando A
		
				System.out.print("A = [");
				for(i=0; i<TAM; i++) {
					if (i==9) {
						System.out.print(a[i]+"]");
					} else {
						System.out.print(a[i]+ " ");
					}
				} System.out.println(" ");
					
				// Apresentando B
					
					System.out.print("B = [");
					for(i=0; i<TAM; i++) {
						if (i==9) {
							System.out.print(b[i]+"]");
						}
						else {
							System.out.print(b[i]+ " ");

						}
					} System.out.println(" ");
		

	}

}
