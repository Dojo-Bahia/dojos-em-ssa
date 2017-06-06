require 'test/unit'
require './app/arquivo'


class ArquivoTeste < Test::Unit::TestCase

  def test_arquivo_existe
    a = Arquivo.new("resultados.txt")
    assert_equal true, a.arquivo_existe?
  end

  def test_arquivo_nao_existe
    a = Arquivo.new("nome_inexistente.txt")
    assert_equal false, a.arquivo_existe?
  end

  def test_arquivo_vazio
    a = Arquivo.new("resultados_vazio.txt")
    assert_equal true, a.arquivo_esta_vazio?
  end

  def test_arquivo_nao_vazio
    a = Arquivo.new("resultados.txt")
    assert_equal false, a.arquivo_esta_vazio?
  end
  
  def test_abrir_arquivo
  	arquivo = Arquivo.new("resultados.txt")
  	assert_not_nil arquivo.abrir("r")
  end

end