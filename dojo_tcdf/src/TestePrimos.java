import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class TestePrimos {

	@Test
	public void testePrimosAtehDois() {
		
		List primos = Primos.geraPrimos(2);
		Assert.assertEquals(1, primos.size());
		Assert.assertEquals(2, primos.get(0));
		
	}
	

	@Test
	public void testePrimosAtehTres() {
		
		List primos = Primos.geraPrimos(3);
		Assert.assertEquals(2, primos.size());
		Assert.assertEquals(2, primos.get(0));
		Assert.assertEquals(3, primos.get(1));
		
	}
	
	@Test
	public void testePrimosAtehQuatro() {
		
		List primos = Primos.geraPrimos(4);
		Assert.assertEquals(2, primos.size());
		Assert.assertEquals(2, primos.get(0));
		Assert.assertEquals(3, primos.get(1));
		
	}

	@Test
	public void testePrimosAtehDez() {
		
		List primos = Primos.geraPrimos(10);
		Assert.assertFalse(primos.contains(10));

		Assert.assertEquals(4, primos.size());
		
		Assert.assertEquals(2, primos.get(0));
		Assert.assertEquals(3, primos.get(1));
		Assert.assertEquals(5, primos.get(2));
		Assert.assertEquals(7, primos.get(3));
		
	}
	
	@Test
	public void teste2000() {
		List primos = Primos.geraPrimos(2000);
		Assert.assertFalse(primos.contains(10));
		Assert.assertFalse(primos.contains(2000));
		Assert.assertFalse(primos.contains(1000));
		Assert.assertFalse(primos.contains(100));
		Assert.assertFalse(primos.contains(500));
		Assert.assertFalse(primos.contains(630));

		Assert.assertFalse(primos.contains(731));

		Assert.assertTrue(primos.contains(733));
		
		Assert.assertTrue(primos.contains(1999));
	}
	
	
}
