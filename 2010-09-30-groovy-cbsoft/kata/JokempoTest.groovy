/*
+--> PEDRA --amassa--> TESOURA --corta--> PAPEL --+
|                                                 |  
+---------------- embrulha -----------------------+
Pedra ganha da tesoura (amassando-a ou quebrando-a).<--
Tesoura ganha do papel (cortando-o). 
Papel ganha da pedra (embrulhando-a).
Pedra e Pedra empata <--
Tesoura e Tesoura empata
Papel e Papel empata
*/
class JokempoTest extends GroovyTestCase {
    void testPedraComPedraDaEmpate() {
        assertEquals "empate", new Jokempo().jogar("pedra","pedra")
    }
    
    void testPapelComPapelDaEmpate() {
        assertEquals "empate", new Jokempo().jogar("papel","papel")
    }
    
    void testTesouraComTesouraDaEmpate() {
        assertEquals "empate", new Jokempo().jogar("tesoura","tesoura")
    }
    
    void testJogador1ComPedraGanhaSeJogador2ForTesoura() {
        assertEquals "jogador 1 ganhou", new Jokempo().jogar("pedra","tesoura")
    }

    void testJogador1ComTesouraPerdeSeJogador2ForPedra() {
        assertEquals "jogador 2 ganhou", new Jokempo().jogar("tesoura","pedra")
    }
    
    void testJogador1ComTesouraGanhaSeJogador2ForPapel() {
        assertEquals "jogador 1 ganhou", new Jokempo().jogar("tesoura","papel")
    }
    
    void testJogador1ComPapelPerdeSeJogador2ForTesoura() {
        assertEquals "jogador 2 ganhou", new Jokempo().jogar("papel","tesoura")
    }
    
    void testJogador1ComPedraPerdeSeJogador2ForPapel() {
        assertEquals "jogador 2 ganhou", new Jokempo().jogar("pedra","papel")
    }
    void testJogador1ComPapelGanhaSeJogador2ForPedra() {
        assertEquals "jogador 1 ganhou", new Jokempo().jogar("papel", "pedra")
    }
    
}
