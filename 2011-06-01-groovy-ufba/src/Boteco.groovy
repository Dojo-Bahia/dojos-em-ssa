
class Boteco {

	int estoque
	int mesas = 3
	Map cliente = [:]
	List fila  = []
	
	def put(b) {
		println "rodou"
	}
	def beber(nome) {

		if (mesas == 0) {
			fila << nome
			return false
		}
		if (estoque ==0) return false
		if (cliente[nome]){
			if (cliente[nome] > 2){
				return false
			}
			cliente[nome]++
		}

		else {
			if(fila.size()>0){
				if(fila[0] == nome) {
					cliente[nome] = 1
					fila.remove 0
				} else {
					return false
				}
			} else
				cliente[nome] = 1

			mesas--
		}
		estoque--
		true
	}

	def pagar(nome){
		mesas++
		cliente.remove(nome)
	}
}
