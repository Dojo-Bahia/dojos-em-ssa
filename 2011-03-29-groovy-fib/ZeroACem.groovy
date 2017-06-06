class ZeroACem {
	def segredo

	def sup = 100
	def inf = 0

	def palpite(numero){		
		if (segredo == numero)
			return true

		if (numero > segredo) {
			sup = numero
		return 'maior'
			else
		return 'menor'
	}

	ZeroACem(segredo){
		this.segredo = segredo
	}
}
