var assert = require('assert'),
    megasena = require('./megasena')
    fs = require('fs')
    ;

exports.testMegaSize = function (test) {
   	megasena.downloadZip(function(file){
   	  fs.stat(file, function(error, stat){
   	    assert(stat.size > 0);
        test.done();	
   	  })
      
   	});
}