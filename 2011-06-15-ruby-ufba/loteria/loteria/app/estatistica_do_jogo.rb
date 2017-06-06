class EstatisticaDoJogo
	
	def initialize(jogos)
		@jogos = jogos
		@dezenas_mescladas = []
	end
	
	def analisar(dezenas)
		@dezenas_mescladas += dezenas
	end
	
	def dezenas_mais_frequentes
		@jogos.each {|jogo| jogo.analisar(self)}
		contador = Hash.new(0)
		@dezenas_mescladas.each { |dezena| contador[dezena] += 1 }
		frequencias = contador.values
		maior_frequencia = frequencias.sort!.last
		contador.keep_if { |dezena, frequencia| frequencia == maior_frequencia }
		contador.keys
	end
	
end