$(document).ready(function() {
    $('#latitude').append(getCoords().latitude);
    $('#longitude').append(getCoords().longitude);
    $('#pais').append(getCountry(getCoords()));
    getMusica(getCountry(getCoords()));
})
