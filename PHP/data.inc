<?php

$dia = date("d");
$mes = date("m");
$ano = date("Y");

$meses=array("Janeiro","Fevereiro","Março","Abril","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro");

echo "<h1>Dia ".$dia." de ".$meses[$mes-1]." $ano ";

?>