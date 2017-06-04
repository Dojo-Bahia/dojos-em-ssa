require 'test/unit'
require './app/bolao'

class BolaoTeste < Test::Unit::TestCase

  def test_bolao_deve_ter_pelo_menos_um_jogo_valido
    jogos = []
    bolao = Bolao.new(jogos << Jogo.new(dezenas=[1,2,3,4,5,6]))
    assert_equal true, bolao.valido?
  end

  def test_bolao_vazio
    bolao = Bolao.new([])
    assert_equal false, bolao.valido?
  end

end