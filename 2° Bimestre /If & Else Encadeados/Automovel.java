import java.util.Scanner;
public class Automovel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double km, l, m;
		
		System.out.println("Insira a dist�ncia percorrida pelo autom�vel:");
		km = in.nextDouble();
		
		System.out.println("Insira a capacidade do tanque de combust�vel:");
		l = in.nextDouble();
		
		m = km/l;
		
		System.out.printf("O gasto m�dio de combust�vel do seu autom�vel � %.2f \n ",m,"km/h");
		
		if(m>=10) {
			System.out.println("Econ�mico");
		}else {
			System.out.println("N�o econ�mico");
		}
		
		in.close();

	}

}
