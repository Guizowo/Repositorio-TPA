import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sal;
		System.out.println("Coloque o valor do seu sal�rio:");
		sal = ler.nextDouble();
		
		if (sal>1302) {
			System.out.println("Seu sal�rio est� acima do sal�rio m�nimo");

		}else {
			System.out.println("O seu sal�rio est� abaixo do sal�rio m�nimo");
		}
		ler.close();
	}

}
