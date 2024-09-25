import java.util.Scanner;
public class ferias {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s, f, abono;
        int e;
        System.out.println("Coloque o seu salário");
        s = in.nextDouble();

        System.out.println("Escolha se vai vender as ferias:");
        e = in.nextInt();

        switch (e) {
            case 1:
                System.out.println("Ferias vendidas");
                abono = (s/30)*10;
                f = abono+s;
                System.out.println("valor das ferias: R$"+f);
                break;
            default:
                f = (s/3)+s;
                System.out.println("valor das ferias: R$"+f);
                break;
        }
        in.close();
    }
}
