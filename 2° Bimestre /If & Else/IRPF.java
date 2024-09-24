import java.util.Scanner;
public class IRPF {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
	
	// Declarando vari�veis
	System.out.println("Escreva seu sal�rio");
	double salario = ler.nextDouble();
	
	// If else
	if (salario <=1434.59) {
		System.out.println("Sal�rio sem desconto do IRPF");
	}
	else if (salario >=1434.60 && salario <=2150.00) {
		double irpf1 = ((salario*7.5)/100)-107.59;
		double desconto1 = salario-irpf1;
		System.out.println("O sal�rio com desconto � "+desconto1+" O IRPF � %.2f"+irpf1);
	}
	else if ((salario >=2150.01 && salario <=2866.70)) {
		double irpf2 = ((salario*15)/100)-268.84;
		double desconto2 = salario-irpf2;
		System.out.println("O sal�rio com desconto � "+desconto2+" O IRPF � "+irpf2);
	}
	else if ((salario >=2866.71 && salario <=3582.00)) {
		double irpf3 = ((salario*22.5)/100)-483.84;
		double desconto3 = salario-irpf3;
		System.out.println("O sal�rio com desconto � "+desconto3+" O IRPF � "+irpf3);
	}
	else {
		double irpf4 = ((salario*27.5)/100)-662.94;
		double desconto4 = salario-irpf4;
		System.out.println("O sal�rio com desconto � "+desconto4+" O IRPF � "+irpf4);
	}
	ler.close();
}
}