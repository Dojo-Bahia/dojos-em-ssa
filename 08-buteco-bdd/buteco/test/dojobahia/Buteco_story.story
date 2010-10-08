import dojobahia.Buteco

description "estou testando se o buteco ta cheio"

narrative "buteco cheio", {
  as_a "bebum"
  i_want "cume agua"
  so_that "ficarei chapado"
}

scenario "cheguei e o buteco ta cheio", {
  given "o buteco foi aberto", {
    buteco = new Buteco()
  }
  when "toda as mesas estao ocupadas", {
    [ "Wilson", "Douglas", "Serge"].each {
            buteco.atender(it) }
  }
  then "eu vou que esperar minha vez",{

    buteco.estaCheio().shouldBe true
  }
}

scenario "estou na fila de espera, consegui uma mesa, comecei a beber e sai da fila de espera", {
  given "Serge é o próximo", {
     buteco = new Buteco();
    [ "MARLON", "Wilson", "Douglas", "Serge"].each {
            buteco.atender(it)
    }
  }
  when "vagou uma mesa", {
      buteco.pagar("Wilson")
  }
  then "Serge vai comer agua", {
      buteco.taBebendo("Serge").shouldBe true
  }
  then  'Serge saiu da lista de espera' ,{
     buteco.taEsperando("Serge").shouldBe false 
  }
}

scenario "estou na fila de espera perdi a paciencia e fui mimbora", {
  given "Serge e Otavavio são os próximos", {
     buteco = new Buteco();
    [ "MARLON", "Wilson", "Douglas", "Serge", "Otavio"].each {
            buteco.atender(it)
    }
  }
  when "Serge Desistiu", {
      buteco.desistir("Serge")
  }
  then "Serge sai da fila de espera", {
      buteco.taEsperando("Serge").shouldBe false
  }
  then  'Otavio e o proximo' ,{
     buteco.taEsperando("Otavio").shouldBe true
  }
}