import java.util.Scanner;
public class OrdemNúmeros {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Insira o primeiro valor:");
		a = in.nextInt();
		System.out.println("Insira o segundo valor:");
		b = in.nextInt();
		System.out.println("Insira o terceiro valor:");
		c = in.nextInt();
		
		if (a<b && a<c && b<c) {
			System.out.println("A sua ordem crescente é: "+a+", " +b+" e "+c);
		}else if (a<b && a<c && c<b) {
			System.out.println("A sua ordem crescente é: "+a+", "+c+" e "+b);
		}else if(b<a && b<c && a<c) {
			System.out.println("A sua ordem crescente é: "+b+", "+a+" e "+c);
		}else if(b<a && b<c && c<a) {
			System.out.println("A sua ordem crescente é: "+b+", "+c+" e "+a);
		}else if(c<a && c<b && a<b) {
			System.out.println("A sua ordem crescente é: "+c+", "+a+" e "+b);
		}else {
			System.out.println("A sua ordem crescente é: "+c+", "+b+" e "+a);
		}
		in.close();
		}


}
