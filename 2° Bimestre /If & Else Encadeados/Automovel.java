import java.util.Scanner;
public class Automovel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double km, l, m;
		
		System.out.println("Insira a distância percorrida pelo automóvel:");
		km = in.nextDouble();
		
		System.out.println("Insira a capacidade do tanque de combustível:");
		l = in.nextDouble();
		
		m = km/l;
		
		System.out.printf("O gasto médio de combustível do seu automóvel é %.2f \n ",m,"km/h");
		
		if(m>=10) {
			System.out.println("Econômico");
		}else {
			System.out.println("Não econômico");
		}
		
		in.close();

	}

}
