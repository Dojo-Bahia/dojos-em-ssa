<?php

include "Android.php";
include "F1.php";

$droid = new Android();
$f1 = new F1();

$droid->dialogCreateAlert();

$seasons = $f1->recuperarSeasons();

$season = array();

foreach ($seasons as $value) {
    $season[] = $value->season;
}

$droid->dialogSetItems($season);
$droid->dialogShow();

$ano = $droid->dialogGetResponse();

$droid->dialogDismiss();

$droid->dialogCreateAlert();
$corridas = $f1->recuperarCorridas($season[$ano['result']->item]);

$corrida = array();

foreach ($corridas as $value) {
    $corrida[] = $value->raceName;
}

$droid->dialogSetItems($corrida);
$droid->dialogShow();