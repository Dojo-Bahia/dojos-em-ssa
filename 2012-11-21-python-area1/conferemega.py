"""COnferencia de mega sena"""
from BeautifulSoup import BeautifulSoup

class ConfereMega:

	def __init__(self):
		htmlmega = open("D_MEGA.HTM").read()
		self.soup = BeautifulSoup(htmlmega)

	def titulo(self):
		return self.soup.title.text
		
	def data_sorteio(self,concurso):
		return self.soup.findAll('tr')[concurso].findAll("td")[1].string
