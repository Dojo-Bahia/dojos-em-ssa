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
from google.appengine.ext import webapp,db
from google.appengine.ext.webapp import util
from google.appengine.ext.webapp import template

class Game(db.Model):
    jogo = db.StringProperty()
    maxParticipantes = db.IntegerProperty()


class AdminGameHandler(webapp.RequestHandler):
    def get(self):
        if self.request.get('acao') == 'new':
            self.response.out.write(template.render('game.html', []))
        elif self.request.get('acao') == 'listar':
            self.response.out.write(template.render('games.html', {'jogos': Game.all()}))
        elif self.request.get('acao') == 'edit':
            key = self.request.get('jogo')
            j = Game.get(key)
            self.response.out.write(template.render('gameEdit.html', {'jogo': j}))
            
    
    def post(self):
        if self.request.get('acao') == 'save':
            j = Game()
            j.jogo = self.request.get('jogo')
            j.maxParticipantes = self.request.get('maxParticipantes')
            j.put()
            #self.response.out.write(template.render('game.html', template_values))    
            self.redirect('/admin/game?acao=listar')
        

class MainHandler(webapp.RequestHandler):
    def get(self):
        self.response.out.write('Hello world!')

routes = [('/', MainHandler),
('/admin/game.*', AdminGameHandler)]

def main():
    application = webapp.WSGIApplication(routes, debug=True)
    util.run_wsgi_app(application)


if __name__ == '__main__':
    main()
