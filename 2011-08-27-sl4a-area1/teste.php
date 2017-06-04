<?php

include 'Android.php';

$droid = new Android();
$droid->makeToast('Funcionou!!!');
$droid->dialogCreateInput('Janela', 'Nome');
$droid->dialogSetPositiveButtonText('OK');
$droid->dialogShow();
$nome = $droid->dialogGetResponse();

$droid->makeToast('Bem vindo, '.$nome['result']->value);