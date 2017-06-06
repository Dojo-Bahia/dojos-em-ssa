import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperSenhaTest {

	P    P
	@Before
	public void setUp() throws Exception {
	}    charArray
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAcertouTodasAsCoresNoLugarCerto() {
		SuperSenha jogo = new SuperSenha();
		String palpite = "ABCDE";
		Assert.assertEquals(jogo.testarPalpite(palpite), "PPPPP");
	}

	@Test
	public void testAcertouTodasCoresComLugaresErrados() {
		SuperSenha jogo = new SuperSenha();
		String palpite = "CDEBA";
		Assert.assertEquals(jogo.testarPalpite(palpite), "BBBBB");
	}

	@Test
	public void testAcertouUmaCor() {
		SuperSenha jogo = new SuperSenha();
		String palpite = "FFFFA";
		Assert.assertEquals(jogo.testarPalpite(palpite), "    B");
	}
}
