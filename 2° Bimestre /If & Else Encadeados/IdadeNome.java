import java.util.Scanner;
public class IdadeNome {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	

	System.out.println("Digite o nome da primeira pessoa: ");
	String nome = ler.next();
	System.out.println("Digite a idade da primeira pessoa: ");
	int idade = ler.nextInt();
	
	int idadeVelho = idade;
	String nomeVelho = nome;
	
	int idadeNovo = idade;
	String nomeNovo = nome;
	
	System.out.println("Digite o nome da segunda pessoa: ");
	nome = ler.next();
	System.out.println("Digite a idade da segunda pessoa: ");
	idade = ler.nextInt();
	
	if (idade > idadeVelho) {
		idadeVelho = idade;
		nomeVelho = nome;
	}
	else {
		idadeNovo = idade;
		nomeNovo = nome;
	}
	
	System.out.println("Digite o nome da terceira pessoa: ");
	nome = ler.next();
	System.out.println("Digite a idade da terceira pessoa: ");
	idade = ler.nextInt();
	
	if (idade > idadeVelho) {
		idadeVelho = idade;
		nomeVelho = nome;
	}
	else if (idade < idadeNovo) {
		idadeNovo = idade;
		nomeNovo = nome;
	}
		System.out.println("Digite o nome da quarta pessoa: ");
		nome = ler.next();
		System.out.println("Digite a idade da quarta pessoa: ");
		idade = ler.nextInt();
		
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		}
		else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
			System.out.println("Digite o nome da quinta pessoa: ");
			nome = ler.next();
			System.out.println("Digite a idade da quinta pessoa: ");
			idade = ler.nextInt();
			
			if (idade > idadeVelho) {
				idadeVelho = idade;
				nomeVelho = nome;
			}
			else if (idade < idadeNovo) {
				idadeNovo = idade;
				nomeNovo = nome;
			}
			System.out.println("A pessoa mais nova é "+nomeNovo+" e sua idade é "+idadeNovo);
			System.out.println("A pessoa mais velha é "+nomeVelho+" e sua idade é "+idadeVelho);
			
			ler.close();
		}
}
