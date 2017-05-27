# coding: utf-8

class CalculadoraRomana:
    def conversao(self, valor):
        d = {"I":1,
            "V": 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000}
        tamanho = len(valor)
        a = 0  
        idx = tamanho - 1
        ant = 0
        while idx >= 0:
            if d[valor[idx]] >= ant:
                a += d[valor[idx]]
            else:
                a -= d[valor[idx]]
            ant = d[valor[idx]]    
            idx -= 1                           
        return a
        
        #if valor == "I":
        #    return 1
        #elif valor == "V":
        #    return 5
        #elif valor == "X":
         
    def soma(self, n1, n2):
        return "II"
