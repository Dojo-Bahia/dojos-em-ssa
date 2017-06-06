class ZeroACemTest extends GroovyTestCase {

	def verificaNumero

	void testAcertou () {
		verificaNumero = new ZeroACem(5)
		assertTrue  verificaNumero.palpite(5)
	}

	void testMaior(){
		verificaNumero = new ZeroACem(5)
		assertEquals 'maior', verificaNumero.palpite(7) 
	}

	void testMenor(){
		verificaNumero = new ZeroACem(5)
		assertEquals 'menor', verificaNumero.palpite(2) 
	}

	void testApertadinho(){
		verificaNumero = new ZeroACem(5)
		verificaNumero.palpite(4) 
		assertEquals 'bebi', verificaNumero.palpite(6) 
	}
}
