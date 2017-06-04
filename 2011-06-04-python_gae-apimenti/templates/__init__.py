from web.template import CompiledTemplate, ForLoop


def listar():
    loop = ForLoop()
    _dummy  = CompiledTemplate(lambda: None, "dummy")
    join_ = _dummy._join
    escape_ = _dummy._escape

    def __template__ (respostas):
        yield '', join_('<h1>Pesquisa</h1>\n')
        yield '', join_('\n')
        yield '', join_('<h2>Responda a Pesquisa</h2>\n')
        yield '', join_('\n')
        for resposta in loop.setup(respostas):
            yield '', join_(escape_(resposta.usuario, True), ' : ', escape_(resposta.opcao, True), ' <br>\n')
            yield '', join_('\n')
    return __template__

listar = CompiledTemplate(listar(), 'templates/listar.html')


def perguntas():
    loop = ForLoop()
    _dummy  = CompiledTemplate(lambda: None, "dummy")
    join_ = _dummy._join
    escape_ = _dummy._escape

    def __template__ (perguntas):
        yield '', join_('<h1>Criar Perguntas</h1>\n')
        yield '', join_('\n')
        yield '', join_('<form method="post" action="/perguntas">\n')
        yield '', join_('    <label for="pergunta">Pergunta: </label><input type="text" name="pergunta" /><br>\n')
        yield '', join_('    <label for="opcoes">Op\xc3\xa7\xc3\xb5es:</label><textarea name="opcoes"></textarea><br>\n')
        yield '', join_('<button type="submit">save</button>\n')
        yield '', join_('</form>\n')
        yield '', join_('\n')
        yield '', join_('\n')
        yield '', join_('<h1>Perguntas feitas</h1>\n')
        yield '', join_('\n')
        for pergunta in loop.setup(perguntas):
            yield '', join_(escape_(pergunta.pergunta, True), ' : ', escape_(pergunta.opcoes, True), ' <br>\n')
    return __template__

perguntas = CompiledTemplate(perguntas(), 'templates/perguntas.html')


def index():
    loop = ForLoop()
    _dummy  = CompiledTemplate(lambda: None, "dummy")
    join_ = _dummy._join
    escape_ = _dummy._escape

    def __template__ (respostas, pergunta):
        yield '', join_('<h1>Pesquisa</h1>\n')
        yield '', join_('\n')
        yield '', join_('<h2>Responda a Pesquisa</h2>\n')
        yield '', join_(escape_(pergunta, True), '\n')
        yield '', join_('<form method="post" action="/">\n')
        yield '', join_('    <label for="usuario">Usu\xc3\xa1rio: </label><input type="text" name="usuario" /><br>\n')
        for opcao in loop.setup(respostas):
            yield '', join_('<label for="opcao">Op\xc3\xa7\xc3\xa3o:</label><input type="radio" name="opcao" value="', escape_(opcao, True), '">', escape_(opcao, True), '</input><Br>\n')
        yield '', join_('<button type="submit">save</button>\n')
        yield '', join_('</form>\n')
    return __template__

index = CompiledTemplate(index(), 'templates/index.html')

