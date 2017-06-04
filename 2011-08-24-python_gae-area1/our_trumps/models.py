from google.appengine.ext import db

class SimpleModel(db.Model):
    goo_user = db.UserProperty()
