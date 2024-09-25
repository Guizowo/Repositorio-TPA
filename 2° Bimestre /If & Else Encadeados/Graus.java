import java.util.Scanner;
public class Graus {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double f, c;
		System.out.println("Entre com a temperatura em Fahrenheit:");
		f = ler.nextDouble();
		
		c = (f-32)*5/9;
		
		if(c<15) {
			System.out.println("A temperatura convertida em celsius é:"+c+"ºC e está frio");
			
		}else if (c<22) {
			System.out.println("A temperatura convertida em celsius é:"+c+"ºC e o clima está ameno");
		}else {
			System.out.println("A temperatura convertida em celsius é:"+c+"ºC e está calor");
		}
		ler.close();	
	}

}
