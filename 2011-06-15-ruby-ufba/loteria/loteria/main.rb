require './app/arquivo'
require './app/jogo'
require './app/estatistica_do_jogo'

  arquivo = Arquivo.new("resultados.txt")
  if arquivo.arquivo_existe? and !arquivo.arquivo_esta_vazio? then
    jogos = Array.new
    arquivo.abrir("r").each_line do |resultado|
      resultado.chomp!
      jogo = Jogo.new(resultado.split(";"))
      jogos << jogo if jogo.valido?
    end
    
    jogos.each { |jogo| puts jogo } #+ " valido? " + jogo.valido?.to_s }
    
    estatistica = EstatisticaDoJogo.new(jogos)
    
    puts "Dezenas mais frequentes: " + estatistica.dezenas_mais_frequentes.to_s
    
  end