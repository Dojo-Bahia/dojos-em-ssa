class JogoForca {

    String palavra
    def palavraRevelada

    JogoForca( String palavra){
        this.palavra = palavra
        this.palavraRevelada = "_" * palavra.size()    
    }

    def palpite ( letra){
        if (palavra.count(letra) > 0) {
            palavra.findIndexValues { it == letra}.each { pos ->             
                palavraRevelada = palavraRevelada.substring(0,pos) + letra + palavraRevelada.substring(pos+1)
            }
        }
        return palavra.count(letra)
    }

}
