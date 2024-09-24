import java.util.Scanner;

public class cantina {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o código do produto");
        int cod = ler.nextInt();

        switch (cod) {
            case 1:
                System.out.println("Cachorro Quente: Valor: R$ 8,00");
                break;
            case 2:
                System.out.println("Cheeseburguer: Valor: R$ 12,00");
                break;
            case 3:
                System.out.println("X-Salada: Valor: R$ 15,00");
                break;
            case 4:
                System.out.println("Misto Quente: Valor: R$ 11,00");
                break;
            case 5:
                System.out.println("Pão na Chapa: Valor: R$ 6,00");
                break;
            default:
                System.out.println("Código Inválido");
                break;
        }
        ler.close();
    }
}
