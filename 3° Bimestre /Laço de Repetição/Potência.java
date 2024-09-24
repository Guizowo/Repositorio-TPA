import java.util.Scanner;
public class Potência {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Escreva a base da potência");
    int b = ler.nextInt();

    System.out.println("Escreva o expoente da potência");
    int e = ler.nextInt();

    int i = e;
    int r = 0;
    int p = b;

    while (i > 1) {
        p = b*p;
        i = i-1;
        r = p;
    }
    
    System.out.println("A potência é "+r);
    ler.close();
    }
}



