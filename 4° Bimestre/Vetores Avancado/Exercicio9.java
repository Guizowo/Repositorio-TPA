import java.util.Scanner;
public class Interseccao {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

        int a[], b[], c[], i, j;
        final int tam = 5;
        a = new int[tam];
        b = new int[tam];
        c = new int[tam]; 
        int tamC = 0;   

        System.out.println("Digite os 5 inteiros de A:");
        for (i = 0; i < tam; i++) {
            a[i] = ler.nextInt();
        }

        System.out.println("Digite os 5 inteiros de B:");
        for (i = 0; i < tam; i++) {
            b[i] = ler.nextInt();
        }

        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                if (b[j] == a[i]) {
                    int duplicado = 0;
                    for (int k = 0; k < tamC; k++) {
                        if (c[k] == b[j]) {
                            duplicado = 1;
                            break;
                        }
                    }
                    if (duplicado == 0) {
                        c[tamC] = b[j];
                        tamC++;
                    }
                }
            }
        }

        System.out.print("A interseção é: C = [ ");
        for (i = 0; i < tamC; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("]\n");

        ler.close();
    }
}
	    


