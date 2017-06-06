import unittest
from calcromana import CalculadoraRomana

class CalculadoraRomanaTest(unittest.TestCase):
    def testConversao2(self):
        calc = CalculadoraRomana()
        self.assertEquals(2,calc.conversao("II"))

    def testConversao3(self):
        calc = CalculadoraRomana()
        self.assertEquals(3,calc.conversao("III"))

    def testConversao10(self):
        calc = CalculadoraRomana()
        self.assertEquals(10,calc.conversao("X"))

    def testConversao400(self):
        calc = CalculadoraRomana()
        self.assertEquals(400,calc.conversao("CD"))

    def testConversao499(self):
        calc = CalculadoraRomana()
        self.assertEquals(499,calc.conversao("CDXCIX"))

    def testeImaisI(self):
        calc = CalculadoraRomana()
        self.assertEquals("II",calc.soma("I","I"))
    
   # def testIImaisI(self):
   #     calc = CalculadoraRomana()
   #     self.assertEquals("III",calc.soma("II","I"))


if __name__ == '__main__':
    unittest.main()

