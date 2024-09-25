import java.util.Scanner;
public class Porcentagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int fem, masc, total;
		double pm, pf;
		
		System.out.print("Coloque o número de alunos do sexo masculino:");
		masc = ler.nextInt();
		
		System.out.print("Coloque o número de alunas do sexo feminino:");
		fem = ler.nextInt();
		
		total = fem + masc;
		pm = masc*100/total;
		pf = fem*100/total;
		
		System.out.print("A porcentagem de alunos do sexo masculino é de "+pm+"% e a do sexo feminino é de "+pf+"%");
		ler.close();
		
	}
}
