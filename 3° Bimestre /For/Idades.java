import java.util.Scanner;
public class Idades {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

    int i=1;
    String nome, nomeVelho, nomeNovo;
    int idade, idadeVelho, idadeNovo;

    //  Iniciando a contagem do mais velho e do mais novo
    System.out.println("Digite o nome da "+i+"° pessoa");
        nome = ler.next();
        System.out.println("Digite a idade da "+i+"° pessoa");
        idade = ler.nextInt();
        System.out.println("O nome da "+i+"° pessoa é "+nome+" e sua idade é "+idade);
        System.out.println("");

        // Atribuindo variáveis

        nomeVelho = nome;
        idadeVelho = idade;

        idadeNovo = idade;
        nomeNovo = nome;

        // Laço de repetição 

    for (i=2; i<=5; i++) {
        System.out.println("Digite o nome da "+i+"° pessoa");
        nome = ler.next();
        System.out.println("Digite a idade da "+i+"° pessoa");
        idade = ler.nextInt();
        System.out.println("O nome da "+i+"° pessoa é "+nome+" e sua idade é "+idade);
        System.out.println("");

        if (idade > idadeVelho) {
            nomeVelho = nome;
            idadeVelho = idade;
        } 
        else if (idade < idadeNovo) {
            nomeNovo = nome;
            idadeNovo = idade;
        }
    }

    System.out.println("O nome da péssoa mais velha é "+nomeVelho+" e sua idade é "+idadeVelho);
    System.out.println("O nome da pessoa mais nova é "+nomeNovo+" e sua idade é "+idadeNovo);

    }
}