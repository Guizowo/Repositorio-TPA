import java.util.Scanner;
public class AnoNascimento {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//declara��o de vri�veis
		int anoNascimento, anoAtual, idade;
		
		//leitura de vari�veis
		System.out.println("Coloque seu ano de nascimento");
		anoNascimento = ler.nextInt();
		
		System.out.println("Coloque o ano atual");
		anoAtual = ler.nextInt();
		
		idade = anoAtual-anoNascimento;
		
		System.out.println("Sua idade �:" + idade);
		
		ler.close();
		
	}

}
