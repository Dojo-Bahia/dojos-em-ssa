class Jokempo {
    def jogar(jogador1, jogador2) {
        if (jogador1 == jogador2) {
            return "empate"
        }
        if ((jogador1 == "pedra" && jogador2 == "tesoura") || 
            (jogador1 == "papel" && jogador2 == "pedra") ||    
            (jogador1 == "tesoura" && jogador2 == "papel"))
            return "jogador 1 ganhou"
        
        "jogador 2 ganhou"
    }
}
