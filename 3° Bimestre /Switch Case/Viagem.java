import java.util.Scanner;
public class Viagem {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int vi;
		double r, con;
		
		System.out.print("Apresente sua quantia para a viagem: R$");
		r = in.nextDouble();
		
		System.out.println("Apresente o lugar que irá viajar:");
		vi = in.nextInt();
		
		switch (vi) {
		case 1:
			System.out.println(" Viagem Nacional!");
			System.out.println("Seu valor em reais: R$"+r);
			break;
		case 2:
			System.out.println("Viagem europeia!");
			con = r/5.81;
			System.out.printf("Seu valor em euros: %.2f \n",con);
			break;
		case 3:
			System.out.println("Viagem norte-americana!");
			con = r/5.43;
			System.out.printf("Seu valor em dolares: US$%.2f \n",con);
			break;
		case 4:
			System.out.println("Viagem sul-americana!");
			con = r/0.0060;
			System.out.printf("Seu valor em pesos argentinos: ARS$%.2f \n",con);
			break;
		default:
				System.out.println("Viagem invalida!");
				
			}
		in.close();
		}

	}


