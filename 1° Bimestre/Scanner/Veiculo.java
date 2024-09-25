import java.util.Scanner;
public class Veiculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double veiculo, ipva;
		
		System.out.println("Insira o valor do veículo: ");
		veiculo = ler.nextDouble();
		
		ipva = (veiculo/100*4);
		
		System.out.println("O valor do IPVA é de: " + ipva);
		ler.close();
		
	}
}
