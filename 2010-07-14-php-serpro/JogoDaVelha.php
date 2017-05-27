<?php
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of JogoDaVelha
 *
 * @author 91900603500
 */
class JogoDaVelha {
    private $tabuleiro = array();
    private $anterior;
    private $atual;

    public function anterior(){
        return $this->anterior;
    }

    public function atual(){
        return $this->atual;
    }
    
    public function jogada($posicao, $XouO) {
        if ($this->anterior == $XouO) {
            throw new Exception("Usuário Ladrão");
        }
        $this->tabuleiro[$posicao] = $XouO;
        $this->anterior = $XouO;
    }

    public function linha($linha) {
        return $this->tabuleiro[$linha."1"].$this->tabuleiro[$linha."2"].$this->tabuleiro[$linha."3"];
    }

    public function coluna($coluna) {
        return $this->tabuleiro["A".$coluna].$this->tabuleiro["B".$coluna].$this->tabuleiro["C".$coluna];
    }

    public function diagonalA() {
        return $this->tabuleiro["A1"].$this->tabuleiro["B2"].$this->tabuleiro["C3"];
    }

    public function diagonalB() {
        return $this->tabuleiro["A3"].$this->tabuleiro["B2"].$this->tabuleiro["C1"];
    }
}
?>
