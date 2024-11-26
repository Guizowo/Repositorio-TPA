import java.util.Scanner;
public class exercicio14 {
	public static void main(String[] args) {
		int a[],b[],c[],i;
		final int tam=10;
		a = new int[tam];
		b = new int[tam];
		c = new int[tam];
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os 10 numeros do vetor A:");
		for(i = 0; i < tam;i++) {
			a[i] = ler.nextInt();
			}
		System.out.println("Digite os 10 numeros do vetor B:");
		for(i = 0; i < tam;i++) {
			b[i] = ler.nextInt();
			}
		for(i = 0; i < tam; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			}
			else if(a[i] < b[i]) {
				c[i] = -1;
			}
			else { c[i] = 0;}
		}
		System.out.print("A sequencia ficou: ");
		for(i=0; i < tam;i++) {
			System.out.print(c[i]);}

	}

}
