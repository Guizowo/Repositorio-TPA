import java.util.Scanner;
public class exercicio1 {
 
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			final int tam =20;
			int a[], b[], i, par = 0,impar;
			a = new int [tam];
			b = new int [tam];
			impar = tam-1;
		
			
			
			for(i = 0;i<tam;i++) {
				System.out.println("Digite o " + (i+1) + " valor ");
				a[i] = ler.nextInt();
			}
			for(i = 0; i < a[tam-1];i++) {
				if (a[i] % 2 == 0) {
					b[par] = a[i];
					par++;
					
				}
				else {
					b[impar] = a[i];
					impar--;
				}
				
				
				
			}
			System.out.print("Vetor b:");
			for (i = 0; i < tam;i++) {
				System.out.print(b[i] + " ");
			}
			
			
					
			
			
		}

	}



