import java.util.Scanner;
public class Média {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nota1, nota2, media, exame, m2 = 0;
		
		System.out.println("Apresente sua primeira nota");
		nota1 = in.nextDouble();
		System.out.println("Apresente sua segunda nota");
		nota2 = in.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media < 3) {
			System.out.println("Aluno Reprovado! Sua média é: "+media);
		}else if (media >=6) {
			System.out.println("Aluno Aprovado! Sua média é: "+ media);
		}else {
			System.out.println("Aluno em Exame!!!");
			System.out.println("Apresente a nota do exame:");
			exame = in.nextDouble();
			m2 = (exame+media)/2;
		}
		if(m2>=6) {
			System.out.println("Aprovado na Média do exame! Sua média é: "+m2);
		}else {
			System.out.println("Reprovado na média do exame! Sua média é: "+m2);
		}
		in.close();

	}
	
}
