import java.util.Scanner;
public class Medias3Notas {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 double nota1, nota2, nota3, media;
		 
		 System.out.println("Escreva a 1a nota");
		 nota1 = ler.nextDouble();

		 System.out.println("Escreva a 2a nota");
		 nota2 = ler.nextDouble();

		 System.out.println("Escreva a 3a nota");
		 nota3 = ler.nextDouble();

		 media = (nota1+nota2+nota3)/3;

		 System.out.println("A média das três notas é" + media);

		 ler.close();

	}
}
