import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		final int tam = 10;
		int i,j, a[];
		a = new int[tam];
				
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os 10 Inteiros:");
		for(i=0;i<tam;i++) {
			a[i] = ler.nextInt();
		}
		for (i = 0; i < tam;i++) {
			System.out.println("Os divisores de "+ a[i] + " São:");
			for (j=1; j <= a[i];j++) {
				if(a[i] % j == 0) {
					System.out.println(j);
				}
				else {}
				
			}
		}
		
	}


	}

