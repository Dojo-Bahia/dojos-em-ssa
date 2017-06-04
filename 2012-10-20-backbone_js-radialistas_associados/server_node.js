var sys = require("sys"),
my_http = require("http"),
path = require("path"),
url = require("url"),
filesys = require("fs");
my_http.createServer(function(request,response){
	var my_path = url.parse(request.url).pathname;

//	sys.puts(my_path);
    if (my_path == '/')
        my_path = '/index.html';

	var full_path = path.join(process.cwd(),my_path);

	path.exists(full_path,function(exists){
		if(!exists){
			response.writeHeader(404, {"Content-Type": "text/plain"});
			response.write("404 Not Found\n");
			response.end();
		}
		else{
			filesys.readFile(full_path, "binary", function(err, file) {
			     if(err) {
			         response.writeHeader(500, {"Content-Type": "text/plain"});
			         response.write(err + "\n");
			         response.end();

			     }
				 else{
					 sys.puts("- "+ full_path);

					response.writeHeader(200);
			        response.write(file, "binary");
			        response.end();
				}

			});
		}
	});
}).listen(80);
sys.puts("Server Running on 80");
