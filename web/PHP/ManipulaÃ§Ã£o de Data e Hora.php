<?php

$dia = date("d");
$mes = date("m");
$ano = date("Y");

$hora=date("H");
$minuto=date("i");
$segundo=date("s");

$meses=array("Janeiro","Fevereiro","Março","Abril","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro");

echo "<h1>Dia ".$dia." de ".$meses[$mes-1]." $ano<br>";

echo $hora.":".$minuto.":".$segundo;

?>