import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		int i,x,a[],t = 0;
		final int tam = 10;
		a = new int[tam];
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira os 10 numeros do vetor A:");
		for(i=0;i<tam;i++) {
			a[i] = ler.nextInt();
			}
		System.out.println("Insira o numero que você deseja verificar se esta no vetor:");
		x = ler.nextInt();
		for(i=0; i < tam; i++) {
			if( x == a[i]) {
				System.out.println("O Numero esta localizado no seguinte indice:" + (i+1));
				t++;
				
			}
			else {}
		}
		if(t == 1) {}
		else {
			System.out.println("O Numero não esta dentro do vetor");
		}
	}

}
