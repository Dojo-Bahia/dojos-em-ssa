import java.util.Random
Random rand = new Random()  
int max = params.max.toInteger()
int num = rand.nextInt(max) + 1

request.num = num

if (params.url) {
	def text = "$params.url/$num".toURL().getText("iso-8859-1")
	def texts = text.split(',')

	request.nome = texts[0]
	request.email = texts[1]
}

request.premio = params.premio ?: null

forward "sorteioz.gtpl"


