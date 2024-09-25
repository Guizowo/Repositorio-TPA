import java.util.Scanner;
public class PositivoNegativo {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Escreva o numero");
	int num;
	num = ler.nextInt();
	
	if (num > 0) {
		System.out.println("Numero positivo");
	} else if (num == 0) {
		System.out.println("Neutro");
	} else {
		System.out.println("Numéro negativo");
	}
	ler.close();
}
}
