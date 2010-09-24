<?php
require ("../../JogoDaVelha.php");
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/

/**
 * Description of JogoDaVelhaTest
 *
 * @author 91900603500
 */
class JogoDaVelhaTest extends PHPUnit_Framework_TestCase
{

    public function testGanhouNaHorizontalA()
    {
        $jogodavelha = new JogoDaVelha();
        
        $jogodavelha->jogada("A1", "X");
        $jogodavelha->jogada("B2", "O");
        $jogodavelha->jogada("A2", "X");
        $jogodavelha->jogada("C2", "O");
        $jogodavelha->jogada("A3", "X");
        $this->assertEquals($jogodavelha->linha("A"), "XXX");
    }

    public function testGanhouNaHorizontalB()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("B1", "X");
        $jogodavelha->jogada("A2", "O");
        $jogodavelha->jogada("B2", "X");
        $jogodavelha->jogada("A3", "O");
        $jogodavelha->jogada("B3", "X");
        $this->assertEquals($jogodavelha->linha("B"), "XXX");
    }

    public function testGanhouNaHorizontalC()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("C1", "O");
        $jogodavelha->jogada("A2", "X");
        $jogodavelha->jogada("C2", "O");
        $jogodavelha->jogada("A3", "X");
        $jogodavelha->jogada("C3", "O");
        $this->assertEquals($jogodavelha->linha("C"), "OOO");
    }

    public function testGanhouNaVertical1()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("A1", "X");
        $jogodavelha->jogada("A2", "O");
        $jogodavelha->jogada("B1", "X");
        $jogodavelha->jogada("A3", "O");
        $jogodavelha->jogada("C1", "X");
        $this->assertEquals($jogodavelha->coluna("1"), "XXX");
    }

    public function testGanhouNaVertical2()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("A2", "X");
        $jogodavelha->jogada("C3", "O");
        $jogodavelha->jogada("B2", "X");
        $jogodavelha->jogada("A3", "O");
        $jogodavelha->jogada("C2", "X");
        $this->assertEquals($jogodavelha->coluna("2"), "XXX");
    }

    public function testGanhouNaVertical3()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("A3", "O");
        $jogodavelha->jogada("C1", "X");
        $jogodavelha->jogada("B3", "O");
        $jogodavelha->jogada("B2", "X");
        $jogodavelha->jogada("C3", "O");
        $this->assertEquals($jogodavelha->coluna("3"), "OOO");
    }

    public function testGanhouNaDiagonalA()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("A1", "O");
        $jogodavelha->jogada("B1", "X");
        $jogodavelha->jogada("B2", "O");
        $jogodavelha->jogada("C2", "X");
        $jogodavelha->jogada("C3", "O");
        $this->assertEquals($jogodavelha->diagonalA(), "OOO");
    }

    public function testGanhouNaDiagonalB()
    {
        $jogodavelha = new JogoDaVelha();

        $jogodavelha->jogada("A3", "O");
        $jogodavelha->jogada("C1", "X");
        $jogodavelha->jogada("B2", "O");
        $jogodavelha->jogada("A2", "X");
        $jogodavelha->jogada("C1", "O");
        $this->assertEquals($jogodavelha->diagonalB(), "OOO");
    }

    public function testJogadaNaoPodeSerDaMesmaLetraConsecutiva(){
        $jogodavelha = new JogoDaVelha();
        try
        {
            $jogodavelha->jogada("A3", "O");
            $jogodavelha->jogada("B2", "O");
            $this->assertTrue(false);
        }
        catch (Exception $e)
        {
            $this->assertEquals('Usuário Ladrão', $e->getMessage());
        }
    }
    
    
}
?>