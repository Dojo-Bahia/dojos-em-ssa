package dojobahia

class ButecoTest extends GroovyTestCase {
    void testSeButecoVazioAtender1oCliente() {
        def buteco = new Buteco()
        assertEquals buteco.atender("otavio") , "bebendo"
    }
    void testButecoCheio(){
        def buteco= new Buteco()
        ["Wilson", "Douglas", "Serge"].each {
            buteco.atender(it)    
        }    
        assertEquals buteco.estaCheio(), true
    }

    void testBebe2CervejaSai() {
        def buteco= new Buteco()
        ["Wilson", "Wilson"].each {
            buteco.atender(it)    
        }

        assertEquals buteco.atender("Wilson"), "va pagar"
        
    }

    void testPagouESaiu() {
        def buteco= new Buteco()
        ["Wilson", "Wilson"].each {
            buteco.atender(it)    
        }

        buteco.pagar("Wilson")

        assertFalse buteco.taBebendo("Wilson")
    }

    void testSeBotecoEstaCheioVaiParaFilaDeEspera() {
        def buteco = new Buteco()
        ["Paulo", "Marcio", "Otavio"].each { cliente ->
            buteco.atender(cliente)
        }

        assertEquals buteco.atender("Novo Cliente"), "esperando"
        assertTrue buteco.taEsperando("Novo Cliente")
    }
}

/*
buteco só tem 3 bancos OK
só serve cerveja N
cada cerveja e 1 real N
so serve 15 cervejas por noite N
até 2 cervejas por cliente S
nao precisa pedir cerveja, quando acaba automaticamente chega outra
respeitando a ordem de chegada
cliente espera mesa vagar em fila, sua cerveja é prioritária +-
cliente sai quando pede a conta e paga OU quando acaba a 2a cerveja +-

*/
