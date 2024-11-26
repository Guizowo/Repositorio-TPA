import java.util.Scanner;
public class exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i;
		final int tam = 10;
		a = new int[tam];
		b = new int[tam];
		System.out.println("Digite os 10 numeros:");
		for(i = 0; i < tam;i++) {
			a[i] = ler.nextInt();
			}
		for(i=0; i < tam; i++) {
			if( a[i] % 2 == 0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
			}
			
		}
		System.out.print("A sequencia ficou: ");
		for(i=0; i < tam;i++) {
			System.out.print(b[i]);
		}
		}

}
