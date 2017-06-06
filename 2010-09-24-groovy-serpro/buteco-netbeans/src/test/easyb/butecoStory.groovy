import br.com.linguagil.dojobahia.Buteco

narrative "buteco", {
    as_a "dono de buteco"
    i_want "atender meus clientes em ordem de chegada até a cerveja acabar"
    so_that "eles vão ficar satisfeitos e eu ganho dinheiro"
}

/*
buteco só tem 3 bancos
só serve cerveja
cada cerveja e 2 reais
so serve 15 cervejas por noite
até 3 cervejas por cliente
nao precisa pedir cerveja, quando acaba automaticamente chega outra
respeitando a ordem de chegada
cliente espera mesa vagar em fila, sua cerveja é prioritária
cliente sai quando pede a conta e paga OU quando acaba a 3a cerveja
*/
scenario "buteco vazio e chega 1 cliente", {
    given "o boteco está vazio", {
        buteco = new Buteco()
    }
    when "cliente serge chega", {
        situacaoCliente = buteco.atender("serge")
    }
    then "ele automaticamente senta na 1a mesa disponivel e recebe uma cerveja", {
        situacaoCliente.shouldBe "bebendo"
    }
}

scenario "buteco cheio e chega 1 cliente", {
    given "o boteco está vazio", {
        buteco = new Buteco()
    }
    when "chegam 3 clientes de vez", {
        buteco.atender("serge")
        buteco.atender("bruno")
        buteco.atender "andrei"
    }
    and "chega zé", {
        ze = buteco.atender("ze")
    }
    then "ele fica esperando vagar uma mesa", {
        ze.shouldBe "esperando"
    }
}