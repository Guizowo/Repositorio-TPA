import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int aa, an, id;
		
		System.out.println("Coloque seu ano de nascimento");
		an = in.nextInt();
		
		System.out.println("Coloque o ano atual");
		aa = in.nextInt();
		
		id = aa-an;
		
		System.out.println("sua idade é "+id);
		
		if (id<10){
			System.out.println("Criança");
			
		}else if(id<18) {
			System.out.println("Adolescente");
		}else if(id<60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		
		in.close();
		}

	}


