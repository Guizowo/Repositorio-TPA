import java.util.Scanner;
public class Triangulos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Declarando variáveis
		float a,b,c;
		
		// Atribuindo valores
		
		System.out.println("Insira o primeiro valor");
		a = ler.nextFloat();
		
		System.out.println("Insira o segundo valor");
		b = ler.nextFloat();
		
		System.out.println("Insira o terceiro valor");
		c = ler.nextFloat();
		
		// If e Else
		
	
		if((a<b+c) && (b<c+a) && (c<a+b)) {
			if ((a == b) && (b==c)) {
				System.out.println("Triangulo equilátero");
			} 
			else if((a == b) || (b==c) || (c==a)) {
				System.out.println("Triangulo isósceles");
			}
			else {
				System.out.println("Triangulo escaleno");
			}
		} else {
			System.out.println("Não é triangulo");
		}
		ler.close();
	}

}
