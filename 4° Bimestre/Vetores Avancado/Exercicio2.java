import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int tam = 5;
		int i,j, a[];
		a = new int[tam];
		
		System.out.println("Digite 5 inteiros que você deseja saber a tabuada:");
		for(i = 0; i < tam;i++) {
			a[i] = ler.nextInt();	
			}
		for(i=0; i < tam; i++) {
			for(j=1; j < 11;j++) {
				System.out.println(a[i] + " x " + j + "=" + (a[i]*j) );
				
			}
			System.out.println(" ");
			
		}
		
		
	}

}
