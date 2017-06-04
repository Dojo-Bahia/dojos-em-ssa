log.info "Enviando email para $params.nome ($request.email) do sorteio '$params.premio'"
mail.send from: "zsorteio@gmail.com",
        to: params.email,
        subject: "Você ganhou!!!",
        textBody: "Você ganhou $request.premio no sorteio realizado em ${new Date()}"

log.info "Email enviado com sucesso!!!"

def message = "E-mail enviado com sucesso. Obrigado por usar o Zorteio!<br/><font size='1'>Retornando em 5 segundos...</font>"
println "<html><head><meta http-equiv='refresh' content='10;url=http://zorteio.appspot.com'></head><body>$message</html></body>"
