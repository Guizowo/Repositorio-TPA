import java.util.Scanner;

public class mencoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.print("Informe a quantidade total de alunos: ");
        int alunos = ler.nextInt();

        int MB, B, R, I;

        System.out.print("Informe a quantidade de alunos com menção MB: ");
        MB = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção B: ");
        B = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção R: ");
        R = ler.nextInt();
        System.out.print("Informe a quantidade de alunos com menção I: ");
        I = ler.nextInt();


        double pctMB = (MB * 100.0) / alunos;
        double pctB = (B * 100.0) / alunos;
        double pctR = (R * 100.0) / alunos;
        double pctI = (I * 100.0) / alunos;


        System.out.printf("Porcentagem de MB: %.2f%%\n", pctMB);
        System.out.printf("Porcentagem de B: %.2f%%\n", pctB);
        System.out.printf("Porcentagem de R: %.2f%%\n", pctR);
        System.out.printf("Porcentagem de I: %.2f%%\n", pctI);

        ler.close();
    }
}

