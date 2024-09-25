import java.util.Scanner;
public class NumerosInteiros {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, antecessor, sucessor;
		
		System.out.println("Insira um número:");
		num = ler.nextInt();
		
		antecessor = num - 1;
		sucessor = num + 1;
		
		System.out.println("O antecessor é: "+antecessor+" e o sucessor é: "+sucessor);
		
		ler.close();
	}
}
