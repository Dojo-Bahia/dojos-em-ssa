## code.py

import web
import random
from google.appengine.ext import db

urls = (
  '/', 'index',
  '/frase', 'frase',
  '/pesquisa', 'pesquisa',
  '/source', 'source',
  '/crash', 'crash'
)

render = web.template.render('templates/')

class Frase(db.Model):
    texto = db.StringProperty(multiline=True)
    flag = db.BooleanProperty()
    

class Note(db.Model):
    content = db.StringProperty(multiline=True)
    date = db.DateTimeProperty(auto_now_add=True)

class index:
    def GET(self):
        frases = db.GqlQuery("SELECT * FROM Frase")
        return render.index(frases)

class pesquisa:
    def GET(self):        
        frases = db.GqlQuery("SELECT * FROM Frase")
        total = frases.count()
	id = random.randint(1,total)
        
	frase = db.GqlQuery("SELECT * FROM Frase where id=1" )
        return render.pesquisa(frase)

    def POST(self):
       	f = web.input('flag')
        frase = Frase()
	frase.flag = eval(f.flag)
        frase.put()
        return web.seeother('/')

class frase:
    def POST(self):
        i = web.input('texto')
	f = web.input('flag')
        frase = Frase()
        frase.texto = i.texto
	frase.flag = eval(f.flag)
        frase.put()
        return web.seeother('/')

class source:
    def GET(self):
        web.header('Content-Type', 'text/plain')
        return (
          '## code.py\n\n' + 
          file('code.py').read() + 
          '\n\n## templates/index.html\n\n' + 
          file('templates/index.html').read()
        )

class crash:
    def GET(self):
        import logging
        logging.error('test')
        crash

app = web.application(urls, globals())
main = app.cgirun()


