import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p, a, imc;
		
		System.out.println("Insira o seu peso:");
		p = in.nextDouble();
		
		System.out.println("Insira sua altura:");
		a = in.nextDouble();
		
		imc = p/(a*a);
		
		System.out.printf("Seu IMC é %.2f \n",imc);
		
		if(imc<18.5) {
			System.out.println("Excesso de magreza");
		}else if(imc<26) {
			System.out.println("Peso normal");
		}else if(imc<31) {
			System.out.println("Excesso de peso");
		}else if(imc<36) {
			System.out.println("Obesidade(grau I)");
		}else if(imc<41) {
			System.out.println("Obesidade(grau II)");
		}else {
			System.out.println("Obesidade(grau III)");
		}
		in.close();

	}

}
