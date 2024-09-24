import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		
	Scanner	ler = new Scanner(System.in);
	
	System.out.println("Escreva o n�mero do qual voc� quer saber a tabuada");
	int n = ler.nextInt();
	
	int i;
	i = 1;
		
	while (i <= 10) {
			int r = n*i;
			System.out.println(+r);
			i = i+1;
		}
		ler.close();
	}

}
