import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[],b[],c[],i,j,k = 0,t=0;
		final int tam = 5;
		a = new int[tam];
		b = new int[tam];
	    c = new int[tam];
	    System.out.println("Digite os 5 inteiros de A:");
	    for(i=0;i < tam;i++) {
	    	a[i] = ler.nextInt();
	    }
	    System.out.println("Digite os 5 inteiros de B:");
	    for(i=0;i < tam;i++) {
	    	
	    	b[i] = ler.nextInt();}
	    for(i=0;i<tam;i++ ) {
	    	for(j=0;j < tam; j++) {
	    		if(b[j] == a[i]) {
	    			c[k] = b[j];
	    			k++;
	    			
	    		}
	    		else {}
	    	} 
	    }
	    System.out.print("A intersenção é: ");
	    for(k=0;i<=k; k++) {
	    	System.out.print(c[k]+ " ");
	    }
	}
}
	    


