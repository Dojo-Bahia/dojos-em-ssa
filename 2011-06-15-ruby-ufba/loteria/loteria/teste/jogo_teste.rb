require 'test/unit'
require './app/jogo'

class JogoTeste < Test::Unit::TestCase
	
	def test_um_jogo_deve_ser_invalido_se_tiver_menos_de_6_dezenas
		jogo = Jogo.new(dezenas = [1, 2, 3, 4, 5])
		assert_equal false, jogo.valido?
	end
	
	def test_um_jogo_deve_ser_invalido_se_tiver_mais_de_15_dezenas
		dezenas = Array.new
		16.times { |dezena| dezenas.push(dezena + 1) }
		jogo = Jogo.new(dezenas)
		assert_equal false, jogo.valido?
	end
	
	def test_um_jogo_valido_tem_pelo_menos_6_dezenas
		jogo = Jogo.new(dezenas = [1, 2, 3, 4, 5, 6])
		assert jogo.valido?
	end
	
	def test_um_jogo_valido_tem_no_maximo_15_dezenas
		dezenas = Array.new
		(1..15).each { |dezena| dezenas.push(dezena) }
		jogo = Jogo.new(dezenas)
		assert jogo.valido?
	end
	
	def test_um_jogo_deve_ser_invalido_se_tiver_dezenas_repetidas
		jogo = Jogo.new(dezenas = [10, 20, 20, 30, 40, 50])
		assert_equal false, jogo.valido?
	end
	
	def test_um_jogo_valido_deve_ter_dezenas_entre_1_e_60
		jogo = Jogo.new(dezenas = [10, 30, 50, 55, 58, 61])
		assert_equal false, jogo.valido?
	end
	
	def test_um_jogo_deve_ser_analisavel
		jogo = Jogo.new(dezenas = [1, 2, 3, 4, 5, 6])
		assert jogo.respond_to? :analisar
	end
	
	def test_um_jogo_deve_permitir_a_analise_de_suas_dezenas
		jogo = Jogo.new(dezenas = [1, 2, 3, 4, 5, 6])
		analisador_fake = AnalisadorFake.new
		jogo.analisar(analisador_fake)
		assert_equal dezenas, analisador_fake.dezenas
	end
	
	class AnalisadorFake
		attr_reader :dezenas
		def analisar(dezenas)
			@dezenas = dezenas
		end
	end
	
end