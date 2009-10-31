import java.util.List;
import java.util.ArrayList;


public class Primos {

	public static List<Integer> geraPrimos(int i) {
		ArrayList<Integer> primos = new ArrayList<Integer>();
		for (int j=2 ; j<=i ; j++){
			primos.add(j);
		}
		
		int ultimo = primos.get(primos.size()-1);
		
		for (int indice = 0; indice < primos.size();indice++) {
			int multiplo = primos.get(indice);
			int primo = multiplo;
			while (multiplo < ultimo) {
				multiplo+=primo;
				primos.remove(new Integer(multiplo));
			}
			
		}
		
		return primos;
	}

}
