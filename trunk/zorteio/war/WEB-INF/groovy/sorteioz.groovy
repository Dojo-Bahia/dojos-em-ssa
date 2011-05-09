import java.util.Random
Random rand = new Random()  
int max = params.max.toInteger()
int num = rand.nextInt(max) + 1


def text = "$params.url/$num".toURL().getText("iso-8859-1")

def texts = text.split(',')

request.nome = texts[0]
request.email = texts[1]
request.premio = params.premio

log.info "Enviando email para $request.nome ($request.email) do sorteio '$request.premio'"
mail.send from: "zsorteio@gmail.com",
        to: request.email,
        subject: "Você ganhou!!!",
        textBody: "Você ganhou $request.premio no sorteio realizado em ${new Date()}"

log.info "Email enviado com sucesso!!!"

forward "sorteioz.gtpl"


