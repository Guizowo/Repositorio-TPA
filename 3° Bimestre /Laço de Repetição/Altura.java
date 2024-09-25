public class Altura {

	public static void main(String[] args) {
		double i = 134, p = 145;
		int n = 0;

		while(i<p) {
			p=p+2;
			i=i+2.5;
			n++;
		}
		System.out.println("João será mais alto que Pedro"
				+ " após "+n+" anos com altura de "+i);

	}

}
