class Tesouro
	
	def initialize pedras
		@pedras = pedras
	end
	
	def dividido_em piratas
		return "ERRO" if @pedras.inject {|sum,p| sum}
		return "ERRO" if piratas > @pedras.size
		return @pedras.map {|p| [p]} if piratas > 1
		@pedras
	end
	
end