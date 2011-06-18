import unittest
from calculadora_romana import *

class TesteCalculadoraRomana(unittest.TestCase):
	def testSomaUmMaisUm(self):
		calc = Calculadora_romana()
		self.assertTrue(calc.soma("I","I") == "II")

	def testConverteIParaUm(self):
		calc = Calculadora_romana()
		self.assertTrue(calc.converte("I") == 1)
	
	def testConverteIIParaDois(self):
		calc = Calculadora_romana()
		self.assertTrue(calc.converte("II") == 2)
	
	def testConverteVIParaSeis(self):
		calc = Calculadora_romana()
		self.assertTrue(calc.converte("VI") == 6)
	
	def testConverteIVParaQuatro(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converte("IV"), 4)
	
	def testConvertXIVParaQuatorze(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converte("XIV"), 14)

	def testConverteMCMLXXXIPara1981(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converte("MCMLXXXI"), 1981)
	
	def testConverteMCDXLIXPara1449(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converte("MCDXLIX"), 1449)


	def testConverte1ParaI(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converteInverso(1), "I")

	def testConverte5ParaV(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converteInverso(5), "V")

	def testConverte15ParaXV(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converteInverso(15), "XV")

	def testConverte1580ParaMDLXXX(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converteInverso(1580), "MDLXXX")

	def testConverte4ParaIV(self):
		calc = Calculadora_romana()
		self.assertEquals(calc.converteInverso(4), "IV")

	

if __name__ == '__main__':
	unittest.main()
