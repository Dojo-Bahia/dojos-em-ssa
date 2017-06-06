import groovy.util.GroovyTestCase

/*
- palavra min 5
- palavra max 15
- max 10 tentativas
- 1 letra por vez
- não pode repetir letra que já foi acertada
- palpite retorna 0 se não acerto nenhuma letra
- palpite retorna >0 indicando a qtd de letras acertadas
- ganha quando acertar todas as letras. retorna 100
- perde ao esgotar o máximo de tentativas. retorna -1
*/
class ForcaGameTest extends GroovyTestCase {
//	
	
    void testGanhou() {
	def forca = new ForcaGame("GROOVY")
	forca.palpite 'G'
	forca.palpite 'R'
	forca.palpite 'O'
	forca.palpite 'V'
	assertEquals 100, forca.palpite('Y')
    }

    void testAcertouUma() {
	def forca = new ForcaGame("GROOVY")
	assert forca.palpite('G') == 1
    }

    void testAcertouDuas() {
	def forca = new ForcaGame("GROOVY")
	assert forca.palpite('O') == 2 : "Falha: Acertou Duas"
    }

    void testAcertouZero() {
	def forca = new ForcaGame("GROOVY")
	assertEquals 0, forca.palpite('X')
    }

    void testAcertouTudo() {
	def forca = new ForcaGame("GROOVY")
	def palpite = ['G','R','O','V']
	palpite.each { forca.palpite(it) }
	assertEquals 100, forca.palpite('Y')
    }

    void testEnforcouSe() {
	def forca = new ForcaGame("GROOVY")
	('A'..'J').each { forca.palpite(it) }
	assertEquals(666, forca.palpite('X'))
    }

    void testLetraRepetida() {
	def msg = shouldFail(LetraRepetidaException) {
		def forca = new ForcaGame("GROOVY")
		2.times { forca.palpite('V') }
	}
	assertEquals "Essa letra já foi! Tente outra!", msg
    }
}
