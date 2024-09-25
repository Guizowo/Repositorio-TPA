import java.util.Scanner;
public class Taxi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int b,s;
		double h, dis, bag, val, total;
		
		System.out.println("Informe quantos quilometros o taxi percorreu:");
		dis = in.nextDouble();
		System.out.println("Informe o horario da viagem:");
		h = in.nextDouble();
		System.out.println("Levou bagagem?");
		s = in.nextInt();
		switch (s) {
		case 1:
			System.out.println("Quantos volumes?");
			b = in.nextInt();
			bag = b*2.75;
			if(h>5 && h<21) {
				System.out.println("Bandeirada 1");
				val = 4.50+(2.75*dis);
				total = val+bag;
				System.out.println("Sua viagem: R$"+total);
			}else if(h>0 && h<6 || h>20 && h<25) {
				System.out.println("Bandeirada 2");
				val = 5.65+(dis*3.58);
				total = val+bag;
				System.out.println("Sua viagem: R$"+total);
			}else{
				System.out.println("Invalido");
			}
			break;
		case 2:
			if(h>5 && h<21) {
				System.out.println("Bandeirada 1");
				val = 4.50+(2.75*dis);
				System.out.println("Sua viagem: R$"+val);
			}else if(h>0 && h<6 || h>20 && h<25) {
				System.out.println("Bandeirada 2");
				val = 5.65+(dis*3.58);
				System.out.println("Sua viagem: R$"+val);
			}else{
				System.out.println("Invalido");
			}
			break;
			default:
				System.out.println("Invalido!!");
		}
		in.close();
	}

}
