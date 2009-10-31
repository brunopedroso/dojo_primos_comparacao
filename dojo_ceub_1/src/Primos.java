import java.util.ArrayList;
import java.util.List;


public class Primos {

	public static List calcular(int i) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int j = 0; j <= i; j++) {
			lista.add(j);			
		}
		lista.remove(0);
		lista.remove(0);
		
		for (int z = 0; z < lista.size(); z++) {
			if(lista.get(z)%2 == 0){
				lista.remove(z);
			}
		}

		if (i >= 5)
			lista.add(5);
		
		return lista;
	}

}
