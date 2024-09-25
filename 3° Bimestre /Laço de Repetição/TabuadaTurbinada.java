public class TabuadaTurbinada {
public static void main(String[] args) {
    int i=1 , f = 1 , t;

        while(i<=11){
            t = f*i;
            System.out.println(f+" X "+i+" = "+t);
            i++;
            while (i==10 && f<=10) {
                System.out.println(" ");
                    f++;
                    i=1; 
                
            }
        }
       
    }

   
}

