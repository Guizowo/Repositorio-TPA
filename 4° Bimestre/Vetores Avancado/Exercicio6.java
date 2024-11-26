
public class Exercicio6 {
	public static void main(String[] args) {
		int i,j, a[],r=2;
		final int tam=11;
		a = new int[tam];
	
		for(i=0; i <tam;i++) {
			a[i] = i;
		}
		
		
		for(i=0;i<tam-1;i++) {
			if(a[i] == 0) {System.out.println("1");}
			else {
				r = 2;
				for(j = 0;j < a[i];j++) {
			r = 2*r;
		} }
		System.out.println(r);}
		

	}
}

