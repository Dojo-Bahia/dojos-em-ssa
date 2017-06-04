class Arquivo

  def initialize(nome_arquivo)
    @nome_arquivo = nome_arquivo
  end

  def arquivo_existe?
    File.exist?(@nome_arquivo)
  end

  def arquivo_esta_vazio?
    File.zero?(@nome_arquivo)
  end
  
  def abrir(modo_de_abertura)
  	File.open(@nome_arquivo, modo_de_abertura)
  end

end