import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double s, v;
		int d;
		
		System.out.println("Escreva o sal�rio");
		s = ler.nextDouble();
		System.out.println("Escreva o n�mero de dependentes");
		d = ler.nextInt();
		
		v = (d*55)+s;
		System.out.println("O valor final � " + v);
		ler.close();
	}
}
