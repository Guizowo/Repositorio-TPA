import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		int i,j,a[],p;
		final int tam = 10;
		a = new int[tam];
		Scanner ler = new Scanner(System.in);
		System.out.println("digite os 10 numeros que você deseja saber se são primos");
		for(i=0; i < tam;i++) {
			a[i] = ler.nextInt();
		}
		for(i=0; i  < tam; i++) {
			p = 0;
			for(j=1; j <= a[i];j++) {
				if( a[i] % j == 0 ) {
					p++;
				}
				else {}
				
				
			}
			if(p == 2) {
				System.out.println(a[i] + " É primo");
			}
			else {
				System.out.println(a[i] + " Não é primo");
			}
		}
		
	}

}
