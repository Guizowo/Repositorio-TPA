import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		int a[],b[],i,j = 0,p = 0;
		final int tam = 10;
		a = new int[tam];
		b = new int[tam];
	    Scanner ler = new Scanner(System.in);
		System.out.println("Digite os 10 elementos:");
		for(i = 0; i< tam; i++) {
			a[i] = ler.nextInt();
		}
		for (i=tam-1;i>-1;i--) {
			b[j] = a[i];
			j++;
			
		}
		for(i=0;i<tam;i++) {
			if (a[i] == b[i]) {
				p++;

			}
			else {}
		}
		
		if (p == 10) {
			System.out.println("É palindromo");
		}
		else {
			System.out.println("Não é palindromo");
		}
		
	}

}
