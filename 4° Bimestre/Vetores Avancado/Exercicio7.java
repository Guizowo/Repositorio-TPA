import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		int i, a[],b[],j,r = 1;
		final int tam = 15;
		a = new int[tam];
		b = new int[tam];
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os 15 Numeros:");
		
		for(i=0;i<tam;i++) {
			a[i] = ler.nextInt();
			for (j = a[i]; j>0; j--) {
	            r *= j;}
			
			b[i] = r;
			r = 1;
		}
		for(i=0;i<tam;i++) {
			System.out.println("O Fatorial de " + a[i] + " é " +b[i]);}
		
	}

}
