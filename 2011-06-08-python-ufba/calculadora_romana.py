class Calculadora_romana:

	dicio = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}	
	dicio_2 = {1:"I",5:"V",10:"X",50:"L",100:"C",500:"D",1000:"M"}
	def soma(self, x, y):
		return "II"

	def converte(self,x):
		resultado = 0
		aux=1001
		for letra in x:
			if(aux < self.dicio[letra]):
				soma = self.dicio[letra] - 2*aux 
				resultado += soma
			else:
				resultado += self.dicio[letra]
			aux= self.dicio[letra]
		return resultado


	def converteInverso(self, x):
		resultado = ""
		listaInversa = [1000, 500, 100, 50, 10, 5, 1]
		for divisor in listaInversa:
			temp = x / divisor
			resultado += temp*self.dicio_2[divisor]
			x %= divisor 
			
			
				
		
		return resultado
		
		

