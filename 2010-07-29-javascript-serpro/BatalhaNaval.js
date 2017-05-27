var Tabuleiro = function () {
	var tab = new Array(15*15);

	return {

		/*matriz_posicao: function (coluna){ 
		    tab[][1]		
 		    this.coluna=coluna;
		},*/


		preencherSubmarino: function(jogador, linha, coluna) {
			tab[((linha-1)*15)+coluna] = jogador;
		},

		preencherDestroyer: function(jogador, direcao, linha, coluna) {
			tab[((linha-1)*15)+coluna] = jogador;

			if(direcao == 0){
				// vertical
				linha++;
			} else {
				// horizontal
				coluna++;
			}

			tab[((linha-1)*15)+coluna] = jogador;
		},
preencherHidro: function(jogador, direcao, linha, coluna) {
			tab[((linha-1)*15)+coluna] = jogador;

			if(direcao == 0){
				// cima
			tab[(((linha+1)-1)*15)+coluna-1] = jogador;
			tab[(((linha+1)-1)*15)+coluna+1] = jogador;
			} else if(direcao == 1){
				// baixo
			tab[(((linha-1)-1)*15)+coluna-1] = jogador;
			tab[(((linha-1)-1)*15)+coluna+1] = jogador;
			}
			else if(direcao == 2){
				// esquerda
			tab[(((linha-1)-1)*15)+coluna+1] = jogador;
			tab[(((linha+1)-1)*15)+coluna+1] = jogador;
			}
			else if(direcao == 3){
				// direita
			tab[(((linha-1)-1)*15)+coluna-1] = jogador;
			tab[(((linha+1)-1)*15)+coluna-1] = jogador;
			}


		},
preencherCruzador: function(jogador, direcao, linha, coluna) {
			tab[((linha-1)*15)+coluna] = jogador;
		

			
			for(i = 0; i < 4; i++){
			if(direcao == 0){
				// vertical
				linha++;
			} else {
				// horizontal
				coluna++;
			}	
				tab[((linha-1)*15)+coluna]  = jogador;			
			}	
},

		posicao: function(linha, coluna) {
			return tab[((linha-1)*15)+coluna];
		}

	}
	
}
