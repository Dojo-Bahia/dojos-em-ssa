class Buteco {

    def clientes = [:]    
    def listaEspera = []

    def atender(cliente) {
        if (clientes.size() == 3) {
            listaEspera << cliente
            return "esperando"
        }

        if (clientes[cliente] == 2)
            return "va pagar"
          
        if (clientes[cliente]){
            println "cerveja++ " + clientes[cliente] 
            clientes[cliente]++   
        }else{
            clientes[cliente] = 1
        }

        "bebendo"
    }

    def taEsperando(cliente) {
        return listaEspera.contains(cliente)
    }

    def estaCheio(){
        if (clientes.size() >= 3){
            return true    
        }else{
            return false
        }
    }

    def pagar(cliente) {
        clientes.remove(cliente)
    }

    def taBebendo(cliente) {
        (clientes[cliente] != null)
    }

}
