import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			b[i] = in.nextInt();
			c[i] = a[i]+b[i];			
		}
		System.out.println(" ");
		
		// apresentando A
		
		System.out.print("A = [");
		for(i=0; i<TAM; i++) {
			if (i==4) {
				System.out.print(a[i]+"]");
			} else {
				System.out.print(a[i]+ " ");
			}
		} System.out.println(" ");
			
		// Apresentando B
			
			System.out.print("B = [");
			for(i=0; i<TAM; i++) {
				if (i==4) {
					System.out.print(b[i]+"]");
				}
				else {
					System.out.print(b[i]+ " ");

				}
			} System.out.println(" ");
			
			// Apresentando C
			
						System.out.print("C = [");
						for(i=0; i<TAM; i++) {
							if (i==4) {
								System.out.print(c[i]+"]");
							}
							else {
								System.out.print(c[i]+ " ");

							}
						}
	}
}
