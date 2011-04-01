from web.template import CompiledTemplate, ForLoop


def index():
    loop = ForLoop()
    _dummy  = CompiledTemplate(lambda: None, "dummy")
    join_ = _dummy._join
    escape_ = _dummy._escape

    def __template__ (frases):
        yield '', join_('<h1>Cadastro de frase Primeiro de Abril</h1>\n')
        yield '', join_('\n')
        for frase in loop.setup(frases):
            yield '', join_('<p>', escape_(frase.texto, True), ' -- ', escape_(frase.flag, True), '</p>\n')
            yield '', join_('\n')
            yield '', join_('\n')
        yield '', join_('<h2>Crie sua frase</h2>\n')
        yield '', join_('<form method="post" action="/frase">\n')
        yield '', join_('  <textarea name="texto"></textarea>\n')
        yield '', join_('  <input type="radio" name="flag" value="True" checked="true" />Verdade&nbsp;\n')
        yield '', join_('  <input type="radio" name="flag" value="False" />Mentira&nbsp;</br>\n')
        yield '', join_('<button type="submit">salvar</button>\n')
        yield '', join_('\n')
        yield '', join_('\n')
    return __template__

index = CompiledTemplate(index(), 'templates/index.html')


def pesquisa():
    loop = ForLoop()
    _dummy  = CompiledTemplate(lambda: None, "dummy")
    join_ = _dummy._join
    escape_ = _dummy._escape

    def __template__ (frase):
        yield '', join_('<h1>Pesquisa de frases Primeiro de Abril</h1>\n')
        yield '', join_('\n')
        yield '', join_('   <p>', escape_(frase, True), '</p>\n')
        yield '', join_('  \n')
        yield '', join_('\n')
        yield '', join_('<h2>A frase \xc3\xa9 verdade ou mentira?</h2>\n')
        yield '', join_('<form method="post" action="/pesquisa">\n')
        yield '', join_('  <input type="text"  name="idFrase" value="', escape_(frase.id, True), '" />       \n')
        yield '', join_('  <input type="radio" name="flag" value="True" checked="true" />Verdade&nbsp;\n')
        yield '', join_('  <input type="radio" name="flag" value="False" />Mentira&nbsp;</br>\n')
        yield '', join_('<button type="submit">Responder</button>\n')
        yield '', join_('\n')
        yield '', join_('\n')
    return __template__

pesquisa = CompiledTemplate(pesquisa(), 'templates/pesquisa.html')

