get "/sorteio/@max", forward: "/sorteioz.groovy?max=@max"
get "/user/@id", forward: "/user.groovy?id=@id"

post "/sendmail", forward: "/sendmail.groovy"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
