function getCoords() {
    var a={};
    
    navigator.geolocation.getCurrentPosition(function(pos) {
        a.pos=pos;
    });
    return {'latitude':-12.9620022,'longitude':-38.4313161};
}

function getCountry(coords){
//    var a={};
//    $.ajax({
//        url:'http://maps.google.com/maps/api/geocode/json?latlng='+coords.latitude+','+coords.longitude+'&sensor=false',
//        dataType:'jsonp text',
//        //type:'POST',
//        success:function(response){
//           a = response;
//        }
//    });
//    console.dir('http://maps.google.com/maps/api/geocode/json?latlng='+coords.latitude+','+coords.longitude+'&sensor=false');
//    console.dir(a);
    return 'Brasil';
    

}


function getMusica(pais){
    var a=[];
    $.ajax({
        url:'http://ws.audioscrobbler.com/2.0/?method=geo.gettoptracks&country=brasil&api_key=b25b959554ed76058ac220b7b2e0a026&format=json&limit=10',
        dataType:'jsonp',
        //type:'POST',
        async: false,
        success:function(response){
           $(response.toptracks.track).each(function(e) {
               
               a.push(response.toptracks.track[e].name);
           })

           $(document).ready(function(){
               
               $('#lista-musicas').append(a.join('<br/>'));
           });
           
        }
    });
    //console.dir('http://maps.google.com/maps/api/geocode/json?latlng='+coords.latitude+','+coords.longitude+'&sensor=false');
    console.dir(a);
    return a;
}   
