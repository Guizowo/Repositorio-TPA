import java.util.*;
public class Pesoideal {
    public static void main(String[] args) {
        Scanner ge = new Scanner(System.in);
        int resposta;

        do{
            System.out.println("Insira o seu sexo");
            String sexo = ge.next();
            System.out.println("Insira a sua altura");
            double altura = ge.nextDouble();

            if (sexo.equals("f")) {
                double pesoideal = 52 + (0.67*(altura - 152.4));
                System.out.println("O seu peso ideal e igual a:"+pesoideal);
            }else if (sexo.equals("m")) {
                double pesoideal = 52 + (0.75*(altura - 152.4));
                System.out.println("O se peso ideal e igual a: "+pesoideal);
            }else{
                System.out.println("Sexo inválido");
            }

            System.out.println("Deseja continuar a execução, responda 1 para sim e 2 para não");
            resposta = ge.nextInt();
        }while(resposta == 1);

        ge.close();
    }
}
