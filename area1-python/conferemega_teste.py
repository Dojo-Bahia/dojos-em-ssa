import unittest
from conferemega import ConfereMega

class ConfereMegaTeste(unittest.TestCase):
	
	def setUp(self):
		self.cm = ConfereMega()

	def testTituloDaPagina(self):
		
		self.assertEquals(self.cm.titulo() ,"Resultado da Mega-sena")

	def testDataPrimeiroSorteio(self):
		
		self.assertEquals(self.cm.data_sorteio(1),"11/03/1996")

	def testDataTerceiroSorteio(self):
		
		self.assertEquals(self.cm.data_sorteio(3),"25/03/1996")


if __name__ == '__main__':
	unittest.main()