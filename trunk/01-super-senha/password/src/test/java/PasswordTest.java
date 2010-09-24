import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PasswordTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCorrectPassword() {
		Password p = new Password("01234");
		assertEquals(p.guess("01234"),"CCCCC");
	}

	@Test
	public void testAllIncorrectPassword() {
		Password p = new Password("01234");
		assertEquals(p.guess("56789"),"");
	}

	@Test
	public void testCorrectColorsIncorrectPlaces() {
		Password p = new Password("01234");
		assertEquals(p.guess("10423"),"EEEEE");
	}

	@Test
	public void testCorrectAndIncorrectColors() {
		Password p = new Password("01234");
		assertEquals(p.guess("05264"),"CCC");
	}

	@Test
	public void testCorrectIncorrectColorsMixedWithCorrectColorAndIncorrectPlaces() {
		Password p = new Password("01234");
		assertEquals(p.guess("05243"),"CCEE");
		assertEquals(p.guess("10764"),"CEE");
		assertEquals(p.guess("05678"),"C");
		assertEquals(p.guess("50678"),"E");
	}

	@Test
	public void testGeneratePassword() {
		Password p = new Password();
		p.generateSecret();
		assertTrue(p.getSecret().length() == 5);
	}
}
