import java.util.Scanner;
public class exercicio15 {
	public static void main(String[] args) {
		int a[],b[],c[],i,temp,j = 0;
		final int tam=10;
		a = new int[tam];
		b = new int[tam];
		c = new int[tam];
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os 10 numeros do vetor A:");
		for(i = 0; i < tam-1;i++) {
			a[i] = ler.nextInt();
			}
		for(i=0;i<tam-1;i++) {
			b[i] = a[i];
		}
		for(i=0;i<tam;i++) {
			for(j=0;j<tam-1;j++) {
			if(b[j]> b[j+1]){
				temp = b[j];
				b[j] = b[j+1];
				b[j+1] = temp;
			}
			
		}
			
	}
		j = 0;
		for (i=tam-1;i>-1;i--) {
			
			c[j] = b[i];
					j++;}
					 
		System.out.print("A sequencia ficou: ");
		for(i=0; i < tam;i++) {
			System.out.print(b[i]);}
		System.out.print("A sequencia decrescent ficou: ");
		for(i=0; i < tam;i++) {
			System.out.print(c[i]);}
	}
	}
	    

