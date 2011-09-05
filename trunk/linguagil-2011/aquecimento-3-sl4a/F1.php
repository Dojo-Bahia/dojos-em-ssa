<?php


class F1 {
    public function recuperarUrl($url){
         return file_get_contents($url);
    }
    public function recuperarJson($url){
        return json_decode($this->recuperarUrl($url));
    }
    public function recuperarSeasons(){
        $seasons = $this->recuperarJson("http://ergast.com/api/f1/seasons.json");
        return $seasons->MRData->SeasonTable->Seasons;
    }
    public function recuperarCorridas($ano){
        $corridas = $this->recuperarJson("http://ergast.com/api/f1/$ano.json");
        return $corridas->MRData->RaceTable->Races;
        
    }   
}