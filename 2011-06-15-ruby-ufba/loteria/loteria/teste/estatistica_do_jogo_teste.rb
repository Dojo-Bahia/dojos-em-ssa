require 'test/unit'
require './app/jogo'
require './app/estatistica_do_jogo'

class EstatisticaDoJogoTeste < Test::Unit::TestCase
	
	def test_deve_identificar_a_dezena_mais_frequente_entre_os_jogos
		um_jogo = Jogo.new(dezenas = [1, 2, 3, 4, 18, 19])
		outro_jogo = Jogo.new(dezenas = [18, 20, 30, 40, 41, 50])
		estatistica = EstatisticaDoJogo.new(jogos = [um_jogo, outro_jogo])
		assert_equal [18], estatistica.dezenas_mais_frequentes
	end
	
	def test_deve_identificar_uma_ou_mais_dezenas_que_possuam_a_maior_frequencia
	  um_jogo = Jogo.new(dezenas = [18, 20, 3, 4, 5, 19])
	  outro_jogo = Jogo.new(dezenas = [18, 20, 30, 40, 41, 50])
	  estatistica = EstatisticaDoJogo.new(jogos = [um_jogo, outro_jogo])
	  assert_equal [18, 20], estatistica.dezenas_mais_frequentes
	end
	
end