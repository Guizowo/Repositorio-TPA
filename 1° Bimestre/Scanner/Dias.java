import java.util.Scanner;
public class Dias {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dias, mes;
		double ano;
		
		//leia o n�mero de dias
		System.out.println("Coloque o n�mero de dias");
		dias = ler.nextInt();
		
		//converter em meses e anos
		mes = dias/30;
		ano = dias/365;
		
		System.out.println("O n�mero de dias em meses �:" + mes);
		System.out.println("O n�mero de dias em anos �:" + ano);
		
		ler.close();
	}
}
