describe('Retornando o local', function() {
     it('Existe pais', function() {
        
       expect(getCountry(getCoords())).toEqual('Brasil');
       
    });
});

describe('Retornando o as coordenadas', function() {
    it('Existe coordenadas', function() {
        expect(getCoords()).toBeDefined();
    });
    it('Existe latitude', function() {
        expect(getCoords().latitude).toBeDefined();
    });
    it('Existe longitude', function() {
        expect(getCoords().longitude).toBeDefined();
    });
});

describe('Retornando lista de musicas', function() {
     it('Existe lista', function() {
        
        expect(getMusica(getCountry(getCoords()))).toBeDefined();
       //expect(getCountry(getCoords())).toEqual('Brasil');
       
    });
});