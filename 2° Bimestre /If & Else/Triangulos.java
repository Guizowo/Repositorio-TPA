import java.util.Scanner;
public class Triangulos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		// Declarando vari�veis
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
				System.out.println("Triangulo equil�tero");
			} 
			else if((a == b) || (b==c) || (c==a)) {
				System.out.println("Triangulo is�sceles");
			}
			else {
				System.out.println("Triangulo escaleno");
			}
		} else {
			System.out.println("N�o � triangulo");
		}
		ler.close();
	}

}
