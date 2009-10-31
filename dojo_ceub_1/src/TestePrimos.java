import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestePrimos {

	@Test
	public void testePrimosAteDois() {
		List primos = Primos.calcular(2);
		Assert.assertEquals(1,primos.size());
		Assert.assertEquals(2,primos.get(0));
	}
	
	@Test
	public void testePrimosAteTres() {
		List primos = Primos.calcular(3);
		Assert.assertEquals(2,primos.size());
		Assert.assertEquals(2,primos.get(0));
		Assert.assertEquals(3,primos.get(1));
	}
	
	@Test
	public void testePrimosAteQuatro() {
		List primos = Primos.calcular(4);
		Assert.assertEquals(2,primos.size());
		Assert.assertEquals(2,primos.get(0));
		Assert.assertEquals(3,primos.get(1));
	}
	
	@Test
	public void testePrimosAteCinco() {
		List primos = Primos.calcular(5);
		Assert.assertEquals(3,primos.size());
		Assert.assertEquals(2,primos.get(0));
		Assert.assertEquals(3,primos.get(1));
		Assert.assertEquals(5,primos.get(2));
	}
	
}
