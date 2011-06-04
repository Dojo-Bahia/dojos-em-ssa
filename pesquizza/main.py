#!/usr/bin/env python
#
# Copyright 2007 Google Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
import web
from google.appengine.ext import db

urls = (
  '/', 'index',
  '/responder', 'responder',
  '/perguntas', 'perguntas',
  '/listar', 'listar'
)

render = web.template.render('templates/')

class Note(db.Model):
    content = db.StringProperty(multiline=True)
    date = db.DateTimeProperty(auto_now_add=True)

class Resposta(db.Model):
    usuario = db.StringProperty()
    opcao = db.StringProperty()

class Pergunta(db.Model):
    pergunta = db.StringProperty()
    opcoes = db.StringProperty()

class index:
    def GET(self):
        pergunta = db.GqlQuery("SELECT * FROM Pergunta LIMIT 1")
        respostas = pergunta[0].opcoes.split(",")
        return render.index(respostas, pergunta[0].pergunta)

    def POST(self):
        i = web.input()
        resposta = Resposta()
        resposta.opcao = i.opcao
        resposta.usuario = i.usuario

        resposta.put()
        return web.seeother('/listar')

class listar: 
    def GET(self):
        respostas = db.GqlQuery("SELECT * FROM Resposta")
        return render.listar(respostas)

class perguntas:
    def GET(self):
        perguntas = db.GqlQuery("SELECT * FROM Pergunta")
        #print dir(perguntas)
        return render.perguntas(perguntas)
    
    def POST(self):
        i = web.input()
        pergunta = Pergunta()
        pergunta.pergunta = i.pergunta
        pergunta.opcoes = i.opcoes

        pergunta.put()

        perguntas = db.GqlQuery("SELECT * FROM Pergunta")
        #print dir(perguntas)

        return render.perguntas(perguntas)


class responder:
    def POST(self):
        i = web.input('content')
        responder
        note = Note()
        note.content = i.content
        note.put()
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

