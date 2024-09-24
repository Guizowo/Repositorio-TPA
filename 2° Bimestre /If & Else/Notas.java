import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	// Declarando variáveis
	
	System.out.println("Escreva a primeira nota");
	double nota1 = ler.nextDouble();
	
	System.out.println("Escreva a segunda nota");
	double nota2 = ler.nextDouble();
	
	double media = (nota1+nota2)/2;
	
	// If else
	if (media >=6) {
		System.out.println("Aluno aprovado! Sua nota é "+media);
	}
	else if (media >=3 && media < 6) {
		System.out.println("Aluno em exame");
		
		System.out.println("Escreva a nota do exame");
		double exame = ler.nextDouble();
		
		double media2 = (exame+media)/2;
		
		if (media2 >=6 ) {
			System.out.println("Aluno aprovado! Sua nota é "+media2);
		}
		else {
			System.out.println("Aluno reprovado! Sua nota é "+media2);
		}
	}
	else {
		System.out.println("Aluno reprovado! Sua nota é "+media);
	}
	ler.close();
	}

}
