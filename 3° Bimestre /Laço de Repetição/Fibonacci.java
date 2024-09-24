import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva o número de termos para a série fibonnaci");
        int termos = ler.nextInt();

        int b=1, a=0, i=3;
        System.out.println("Série de Fibonnaci: "+a);
        System.out.println(+b);

        while (i <= termos) {
            int c = a+b;
            System.out.println(+c);

            a=b;
            b=c;
            i = i+1;

        }
        ler.close();
    }
    
}


