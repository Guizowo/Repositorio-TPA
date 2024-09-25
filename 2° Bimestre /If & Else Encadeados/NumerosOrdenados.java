import java.util.Scanner;
public class Ordemdosnumeros {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		// Declarando variáveis
		float a, b, c;
		
		// Atribuindo valores
		System.out.println("Escreva o primeiro valor (a)");
		a = ler.nextFloat();
		
		System.out.println("Escreva o segundo valor (b)");
		b = ler.nextFloat();
		
		System.out.println("Escreva o terceiro valor (c)");
		c = ler.nextFloat();
		
		// If e Else
		if(a<b) {
			if(b<c) {
				System.out.println(a+"\n"+b+"\n"+c);
			}
			else if(a<c) {
				System.out.println(a+"\n"+c+"\n"+b);
			}
			else
				System.out.println(c+"\n"+a+"\n"+b);
		}
		else if(b<c) {
			if(a<c) {
				System.out.println(b+"\n"+a+"\n"+c);
			}
			else {
				System.out.println(b+"\n"+c+"\n"+a);
			}
		}
		else {
			System.out.println(c+"\n"+b+"\n"+a);
		}
		ler.close();
	}

}
