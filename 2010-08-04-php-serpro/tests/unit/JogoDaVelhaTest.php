<?php
require ("../../JogoDaVelha.php");

class JogoDaVelhaTest extends PHPUnit_Framework_TestCase
{    
    /*
     *
     * testGanhouNaHorizontalA
     * testGanhouNaHorizontalB
     * testGanhouNaHorizontalC
     * testGanhouNaVertical1
     * testGanhouNaVertical2
     * testGanhouNaVertical3
     * testGanhouNaDiagonal1
     * testGanhouNaDiagonal2
     * testJogadaDeveSerAlternada
     * testNaoPodeJogarNaCasaPreenchida
     * testEmpate
     *
     */

    public function testSoPodeJogarEmCasaVazia()
    {
        try {
            $jogo = new JogoDaVelha();
            $jogo->jogada('A1', 'X');
            //$this->assertEquals(false, $jogo->jogada('A1', 'X'));
            $jogo->jogada('A1', 'O');
            $this->fail();
        } catch (Exception $e)
        {
            $this->assertEquals('Casa Preenchida!', $e->getMessage());
        }

        }


    /**
     * @expects JogadaNaoAlternadaException
     */
    public function testJogadaDeveSerAlternada() {
        //try {
            $jogo = new JogoDaVelha();
            $jogo->jogada('A1', 'X');
            $jogo->jogada('A2', 'X');
//            $this->fail();
        //} catch (Exception $e)
        //{
//            $this->assertEquals('Jogador repetido!', $e->getMessage());
        //}

    }

        public function testGanhouNaHorizontalA() {

            try {
                $jogo = new JogoDaVelha();
                $jogo->jogada('A1', 'X');
                $jogo->jogada('C1', '0');
                $jogo->jogada('A2', 'X');
                $jogo->jogada('C2', '0');
                $jogo->jogada('A3', 'X');
                $this->assertEquals('Ganhou na Horizontal A!', $jogo->verificarResultado());
            } catch (Exception $e)
            {
                $this->fail();
            }
        }


        
}