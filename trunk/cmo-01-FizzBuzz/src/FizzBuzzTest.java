import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

//multiplo de 3 - fizz
//multiplo de 5 - buzz
//multiplo dos 2 - fizzbuzz
//
//-----
//
//sequencia até X
//
//1,2,fizz,4,buzz,6,....fizzbuzz,....

public class FizzBuzzTest {

	private FizzBuzz fb;

	@Before
	public void init() {
		fb = new FizzBuzz();
	}

	@Test
	public void testarSequenciaAteUm() {

		Assert.assertEquals("1", fb.obterSequencia(1));
	}

	@Test
	public void testarSequenciaAteDois() {

		Assert.assertEquals("1,2", fb.obterSequencia(2));
	}

	@Test
	public void testarSequenciaAteTres() {
		Assert.assertEquals("1,2,fizz", fb.obterSequencia(3));
	}

	@Test
	public void testarSequenciaAteCinco() {
		Assert.assertEquals("1,2,fizz,4,buzz", fb.obterSequencia(5));
	}

	@Test
	public void testarSequenciaAteQuinze() {
		Assert.assertEquals(
				"1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,fizz,14,fizzbuzz",
				fb.obterSequencia(15));
	}

	@Test
	public void testarSequenciaAteVinteCinco() {
		Assert.assertEquals(
				"1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,fizz,14,fizzbuzz,16,17,fizz,19,buzz,fizz,22,fizz,fizz,buzz",
				fb.obterSequencia(25));
	}
}
