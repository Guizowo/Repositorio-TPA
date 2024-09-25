import java.util.Scanner;
public class Escola {
public static void main (String args[]) {
    Scanner in = new Scanner(System.in);

    int year;

    System.out.println("Insira sua idade:");
    year = in.nextInt();

    switch(year){
        case 6:
            System.out.println("categoria dente de leite");
            break;
        case 7:
            System.out.println("categoria junior");
            break;
        case 8:
            System.out.println("categoria junior max");
            break;
        case 9:
            System.out.println("categoria junior master");
            break;
        case 10:
            System.out.println("categoria master");
            break;
        default:
            System.out.println("Idade invalida");
    }
    in.close();
}

}
