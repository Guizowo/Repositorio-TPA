import java.util.Scanner;
public class Quilometros {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
	
		double m, km;
		System.out.println("Coloque o valor em metros:");
		m = ler.nextDouble();
		
		km = m/1000;
		
		System.out.println("O valor de metros convertido em quil�metros �:"+km);
		
		ler.close();
		
	}
}
