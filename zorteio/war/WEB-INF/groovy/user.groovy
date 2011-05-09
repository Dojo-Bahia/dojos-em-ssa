
def users = ['Leandro,leandronunes@gmail.com','Serge,serge.rehem@gmail.com', 'Maux,mauricio.vieira@gmail.com', 'Joao,jopacanario@gmail.com', 'Zyc,cleverson.sacramento@gmail.com', 'Rafael,rafaelmbr@gmail.com', 'Wilson,wegneto@gmail.com', 'Mario,mariojp@gmail.com','Luciano,lucianosantosborges@gmail.com', 'Marlon,marlon.carvalho@gmail.com', 'Victor,vfcosta@gmail.com']

println users[params.id.toInteger() - 1]
