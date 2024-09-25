import java.util.Scanner;
public class Desconto {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		double preco, desconto, valor;
		
		//ler vari�vel preco
		System.out.print("Insira o pre�o do produto R$");
		preco = ler.nextDouble();
		
		//calcule o desconto
		desconto = preco/100*5;
		
		//calcule o valor do produto com o desconto
		valor = preco-desconto;
		System.out.println("O valor do produto com o desconto de 5% �: R$" + valor);
		ler.close();
	}
}
