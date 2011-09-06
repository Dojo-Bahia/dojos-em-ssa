describe('Função Teste', function() {
    var pessoa;
    
    beforeEach(function() {
        pessoa = new Pessoa('Marcio', 'Albuquerque');
    });
    
    it('Precisa retornar o nome certo', function() {
        expect(myTest()).toBe('Marcio');
    });
    
    it('Precisa retornar o nome completo correto', function() {
        expect(pessoa.getNomeCompleto()).toEqual('Marcio Albuquerque');
    });
});