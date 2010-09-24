class CampoMinado(object):
    Tabuleiro = []

    def __init__ (self):
        for i in range(5):
            self.Tabuleiro.append([])#criando linhas
            for j in range(5):
                self.Tabuleiro[i].append(0)#setando zero
        self.Tabuleiro[1][1] = -1
        self.Tabuleiro[2][2] = -1
        self.Tabuleiro[3][3] = -1
    
    def getQtdBombas(self):
        total=0

        for i in range(5):
            for j in range(5):
                if self.Tabuleiro[i][j] == -1:
                    total += 1
        return total

    def jogar(self,x,y):
        if  self.Tabuleiro[x][y] > 0:
            return -2
        elif self.Tabuleiro[x][y] == -1:
            return -1
        else:   
            self.Tabuleiro[x][y] = self.procuraBombasProximas(x,y)
            return self.Tabuleiro[x][y]

    def procuraBombasProximas(self,x,y):
         total = 0
         
         if self.Tabuleiro[x-1][y] == -1:
            total += 1
         if self.Tabuleiro[x+1][y] == -1:
            total += 1
         if self.Tabuleiro[x][y-1] == -1:
            total += 1
         if self.Tabuleiro[x][y+1] == -1:
            total += 1
         if self.Tabuleiro[x-1][y-1] == -1:
            total += 1
         if self.Tabuleiro[x-1][y+1] == -1:
            total += 1
         if self.Tabuleiro[x+1][y-1] == -1:
            total += 1
         if self.Tabuleiro[x-1][y-1] == -1:
            total += 1
         return total

#    def setBombas(self, bombas):
        

