import java.util.Scanner;
public class Produto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double produto, desconto, preco, porcentagem;
		
		System.out.print("Coloque o valor do produto:R$");
		produto = ler.nextDouble();
		
		System.out.print("Coloque o valor da porcentagem: ");
		porcentagem = ler.nextDouble();
		
		desconto = produto/100*porcentagem;
		
		preco = produto - desconto;
		
		System.out.println("O valor do produto Final é:R$" + preco);
		
		ler.close();
		
	}

}
