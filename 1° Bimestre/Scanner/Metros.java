import java.util.Scanner;
public class Metros {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metros, quilometros;
		
		System.out.println("Insira o valor em metros:");
		metros = ler.nextDouble();
		
		quilometros = metros/1000;
		
		System.out.println("O valor em quilometros é igual a: " + quilometros);
		ler.close();
		
	}
}
