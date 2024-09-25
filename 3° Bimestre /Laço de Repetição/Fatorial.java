import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);

        System.out.println("Insira um valor e descubra o seu fatorial");
        int n = gg.nextInt();

        int i = n, fator = 1;
        while(i>0){
            fator = fator*i;
            i = i-1;
        }
        System.out.println("O fatorial do valor "+n+" = "+fator);

        gg.close();
    }
}
