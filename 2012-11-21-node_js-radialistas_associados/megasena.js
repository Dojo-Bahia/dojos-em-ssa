var http = require('http');
var util = require('util');
var fs   = require('fs');

exports.downloadZip = function(callback){
	var file = fs.createWriteStream('/tmp/resultado.zip');

	var con = http.get("http://www1.caixa.gov.br/loterias/_arquivos/loterias/D_megase.zip", function(res) {
  		//console.log("Got response: " + util.inspect(res)) ;
  		res.on('data', function (chunk) {
  			file.write(chunk);
 	   	//	console.log('BODY: ' + chunk);
 	   	});
 	   	res.on('end', function() {
		  file.end();
		  console.log("baixou resultado");
		  callback(file);
		});
	});

	con.on('error', function(e) {
		console.log("Got error: " + e.message);
	});
	//return "resultado.zip";
};