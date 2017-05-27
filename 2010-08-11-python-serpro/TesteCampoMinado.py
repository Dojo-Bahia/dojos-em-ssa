import unittest
from CampoMinado import CampoMinado

class Tests(unittest.TestCase):
    '''
    testar quantidade de bombas
    testar se a bomba esta dentro da matriz
    testar se eu escolher uma casa que tem bomba ele mostrar que tem bomba
    se eu escolher uma casa que nao tem bomba, verificar se o retorno
    testar se ja jogou na posicao
    testar fim do jogo
    '''
    def testSeQuantidadeDeBombasETres(self):
        self.campoMinado = CampoMinado()
        self.assertEquals(3, self.campoMinado.getQtdBombas())

    def testCasaComBomba(self):
        self.campoMinado = CampoMinado()
        self.assertEquals(-1,self.campoMinado.jogar(3,3))

    def testCasaSemBomba(self):
        self.campoMinado = CampoMinado()
        self.assertTrue(self.campoMinado.jogar(1,1)!=-1)

    def testNumeroBombaProximo(self):
        self.campoMinado = CampoMinado()
        self.assertTrue(self.campoMinado.jogar(1,1)>=0)
    
    def testJogadaRepetida(self):
        self.campoMinado = CampoMinado()
        self.campoMinado.jogar(2,2)
        self.assertTrue(self.campoMinado.jogar(2,2)==-2)














if __name__ == "__main__":
    unittest.main()

