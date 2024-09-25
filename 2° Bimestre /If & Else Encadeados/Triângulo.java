import java.util.Scanner;
public class Triângulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Insira o valor do lado 1");
		a = in.nextDouble();
		System.out.println("Insira o valor do lado 2");
		b = in.nextDouble();
		System.out.println("Insira o valor do lado 3");
		c = in.nextDouble();
		
		if (a> b+c || b> a+c || c> b+a) {
			System.out.println("Não é um triângulo");
		}else if (a==c && c==b && b==a) {
			System.out.println("Triângulo Equilátero!");
		}else if (a!=c && c!=b && b!=a) {
			System.out.println("Triângulo Escaleno!");
		}else {
			System.out.println("Triângulo Isóseles!");
		}
		in.close();
	}

}
