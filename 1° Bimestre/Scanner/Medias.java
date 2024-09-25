import java.util.Scanner;
public class Medias {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		
		//Nota 1
		System.out.println ("Escreva a 1a nota");
		nota1 = ler.nextDouble();
		
		//Nota 2
		System.out.println ("Escreva a 2a nota");
		nota2 = ler.nextDouble();
		
		//Media
		media=(nota1+nota2)/2;
		System.out.println ("A sua m�dia �" + media);
		ler.close();
	}
}
