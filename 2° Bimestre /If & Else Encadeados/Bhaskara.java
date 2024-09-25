import java.util.Scanner;
public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double x1, x2, delta, a, b, c, x3;
		
		System.out.println("Insira o primeiro valor");
		a = in.nextDouble();
		System.out.println("Insira o segundo valor");
		b=in.nextDouble();
		System.out.println("Insira o terceiro valor");
		c = in.nextDouble();
		
		delta = (b*b)-4*a*c;
		
		if(delta< 0) {
			System.out.println("Não existem raízes reais para a equação");
		}else if(delta == 0) {
			x1 = (-b)/(2*a);
			System.out.println("Existe uma raiz real para a equação sendo ela: "+x1);
		}else {
			x3 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("Existem duas raízes para a equação: "+ x3+" e "+x2);
		}
		in.close();
	}

}
