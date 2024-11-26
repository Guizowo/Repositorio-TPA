import java.util.Scanner;

public class Exercicio10 {

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
            int encontrado = 0; 
            for (j = 0; j < tam; j++) {
                if (a[i] == b[j]) {
                    encontrado = 1; 
                }
            
            if (encontrado == 0) {
                c[tamC] = a[i];
                tamC++;
            }
        }
          System.out.print("A diferença é: C = [ ");
        for (i = 0; i < tamC; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("]\n");

        ler.close();
    }
}

