function myTest() {
    return 'Marcio';
}

function Pessoa(nome, sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
}

Pessoa.prototype.getNomeCompleto = function() {
    return this.nome+' '+this.sobrenome;
};