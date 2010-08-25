class ForcaGame {
	def palavraSecreta
	def palavraRevelada = "" 
	int tentativas = 0
	int erros = 0
	def palpites = []

	def msg = [100: "***** ACERTOU!!!! :-D *****", 
                   666:"***** VOCÊ MORREU :-( *****"]

	def forca

	ForcaGame(String palavra) {
		palavraSecreta = palavra.toUpperCase()
		palavraRevelada <<= '-' * palavra.length()
		forca = new Forca("forca.txt")
	}

	def palpite(letra) {
		if (letra in palpites) throw new LetraRepetidaException()

		palpites << letra
		tentativas++

		int acertos = palavraSecreta.count(letra)
		if (acertos > 0) 
			palavraSecreta.findIndexValues{ it == letra }.each {
			    palavraRevelada[it..it] = letra 
			}
		else
			erros+=1

		println "\nPALAVRA: $palavraRevelada"
		print forca.getForca(erros)
		println "PALPITE:$letra TENTATIVAS:$tentativas ERROS:${erros} ${palpites}"
		println '-'*80

		if (palavraRevelada.toString() == palavraSecreta) 
			return 100
		else
			if (erros==10) 
				return 666
			else
				return acertos
	}

	def play() {
		println "JOGO DA FORCA EM GROOVY"
		println "-----------------------"
		println "\nPALAVRA: $palavraRevelada"
		System.in.eachLine() { 
			line ->  
			try {
				if(line.equals("exit"))  
					System.exit(0)  
				else {
					int retorno = palpite(line.toUpperCase())				
					if (retorno in [100,666]) {
						println msg[retorno]
						System.exit(0)
					}
				}
			} catch (Exception e) {
				println e.getMessage()
			}
		}  		
	}

	static main(args) {
		new ForcaGame(args[0]).play()
	}
}


