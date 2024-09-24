import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um número inteiro");
        int n = ler.nextInt();
        int i = 2;
        int teste = 1;

        while (i <= n/2 ) {
            if (n % i == 0) {
                teste = teste+1;
                break;
            }
            i++;
        }

        if (teste == 1) {
            System.out.println(n + " é um número primo.");
        } 
        else {
            System.out.println(n + " não é um número primo.");
        }
        ler.close();
    }
}


