
// routes for the blobstore service example
get "/upload",  forward: "/upload.gtpl"
get "/success", forward: "/success.gtpl"
get "/failure", forward: "/failure.gtpl"

get "/sorteio/@max", forward: "/sorteioz.groovy?max=@max"
get "/user/@id", forward: "/user.groovy?id=@id"

get "/favicon.ico", redirect: "/images/gaelyk-small-favicon.png"
