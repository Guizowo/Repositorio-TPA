import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        Scanner ck = new Scanner(System.in);

        int i = 1, a, n, id;

        while (i<7) {
            System.out.println("Entre com o ano de nasimento do usuario "+i);
            n = ck.nextInt();
            System.out.println("Entre com o ano atual");
            a = ck.nextInt();
            id = a-n;
            System.out.println(id);
            if (id<19) {
                System.out.println("Menor de idade");
            }else{
                System.out.println("Maior de idade");
            }
            i++;
        }
        ck.close();

    }
}

