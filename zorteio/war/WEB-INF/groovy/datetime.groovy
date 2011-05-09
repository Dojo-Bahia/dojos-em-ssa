
log.info "Setting attribute datetime"

request.datetime = new Date().toString()

log.info "Forwarding to the template"

forward '/datetime.gtpl'
