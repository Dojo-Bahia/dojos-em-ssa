<?php

class JogadaNaoAlternadaException extends Exception {
    protected $message;

    public function  __construct()
    {
        $this->message = "Jogada Não Alternada!";
    }
}

class JogoDaVelha {

    private $tabuleiro;
    private $ultimaJogada;

    public function  __construct()
    {
        echo 'teste';
        $this->tabuleiro = array();
    }
    public function jogada($posicao, $elemento) {
        if ($this->tabuleiro[$posicao] != null){
            throw new Exception ('Casa Preenchida!');
        }
        
        if( $this->ultimaJogada==$elemento){
            throw new JogadaNaoAlternadaException();
        }



        $this->tabuleiro[$posicao] = $elemento;
        echo 'Jogou';

        $this->ultimaJogada = $elemento;
        return true;
    }
    public function verificarResultado()
    {
        if ($this->tabuleiro['A1']==$this->tabuleiro['A2']
                && $this->tabuleiro['A2']==$this->tabuleiro['A3'])
        return 'Ganhou na Horizontal A!';

        if ($this->tabuleiro['B1']==$this->tabuleiro['B2']
                && $this->tabuleiro['B2']==$this->tabuleiro['B3'])
        return 'Ganhou na Horizontal B!';


        }
}

