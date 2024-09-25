import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sal;
		System.out.println("Coloque o valor do seu salário:");
		sal = ler.nextDouble();
		
		if (sal>1302) {
			System.out.println("Seu salário está acima do salário mínimo");

		}else {
			System.out.println("O seu salário está abaixo do salário mínimo");
		}
		ler.close();
	}

}
