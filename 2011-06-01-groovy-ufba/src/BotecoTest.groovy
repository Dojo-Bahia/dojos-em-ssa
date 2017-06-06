class BotecoTest extends GroovyTestCase {

	void testSeExisteEstoqueDisponivelDePiriguete(){
		Boteco b = new Boteco(estoque:5)
		b << "serge"
		assertTrue new Boteco(estoque:1).beber("Luciano")
	}
	
	void testNaoTemEstoqueDisponivelDePiriguete(){
		assertFalse new Boteco(estoque:0).beber("Luciano")
	}
	
	void testNaoTemMesaDisponivel(){
		def b = new Boteco(estoque:5)
		assertTrue b.beber("Luciano")
		assertTrue b.beber("serge")
		assertTrue b.beber("manuel")
		assertFalse b.beber("ze")
	}
	
	void testClieteChegouNoLimite(){
		def b = new Boteco(estoque:5)
		3.times {b.beber("Luciano") }
		assertFalse b.beber("Luciano")
	}
	
	void testClientePagaConta(){
		def b = new Boteco(estoque:5)
		["a","b","c"].each{b.beber(it)}
		b.pagar("a")
		assertTrue b.beber("ze")
	}
	
	void testVagouMesa() {
		def b = new Boteco(estoque:5)
		["a","b","c"].each{b.beber(it)}
		assertFalse b.beber("ze")
		assertFalse b.beber("bob")
		b.pagar("a")
		assertFalse b.beber("bob")
		assertTrue b.beber("ze")
		b.pagar "c"
		assertTrue b.beber("bob")
	}
	
	
}