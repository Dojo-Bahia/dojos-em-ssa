class Jogo
	
	def initialize(dezenas)
		@dezenas = dezenas
	end
	
	def valido?
		validar_quantidade_de_dezenas and
		validar_unicidade_das_dezenas and
		validar_limites_das_dezenas
	end
	
	def analisar(analisador)
		analisador.analisar(@dezenas)
	end
	
	private
	
	def validar_quantidade_de_dezenas
		(@dezenas.size < 6 or @dezenas.size > 15) ? false : true
	end
	
	def validar_unicidade_das_dezenas
		(@dezenas.uniq.size != @dezenas.size) ? false : true
	end
	
	def validar_limites_das_dezenas
	  @dezenas.sort!
	  (@dezenas.first.to_i < 1 or @dezenas.last.to_i > 60) ? false : true
	end
	
	def to_s
		"dezenas: " + @dezenas.to_s
	end
	
end