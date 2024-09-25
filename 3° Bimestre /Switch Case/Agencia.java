import java.util.Scanner;
public class Agencia {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int des, dia;
	        double val;

	        System.out.println("Escolha a praia que voce ira com numeros inteiros:");
	        des = in.nextInt();
	        System.out.println("Coloque o numero de dias que ira ficar:");
	        dia = in.nextInt();
	        switch(des) {
	        case 1:
                System.out.println("Ilha Bela");
                if(dia<=5){
                    val = dia*240;
                    System.out.println("O valor da sua estadia e: R$"+val);
                }else if(dia<11){
                    val = 130+(dia*220);
                    System.out.println("O valor da sua estadia e: R$"+val);
                }else{
                    val = 150+(dia*210);
                    System.out.println("O valor da sua estadia e: R$"+val);
                }
                break;
            case 2:
                System.out.println("Fernando de Noronha");
                if(dia<=5){
                    val = 100+(dia*400);
                    System.out.println("O valor da sua estadia e: R$"+val);
                }else if(dia<11){
                    val = 150+(dia*410);
                    System.out.println("O valor da sua estadia e: R$"+val);
                }else{
                    val = 200+(dia*420);
                    System.out.println("O valor da sua estadia e: R$"+val);
                }
                break;
             default:
                    System.out.println("Lugar invalido!!!");
	        
	        }
	        in.close();   
	    }
	   
	}


