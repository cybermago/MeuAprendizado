<?php

echo "<h1>DIFERENÇA ENTRE A FUNÇÃO EXPLODE E IMPLODE<br><br>";

echo "IMPLODE<br>";

$vetor = array("Jonata Mendes","Antonio Gustavo");

$a = implode("/", $vetor);

echo $a."<br><hr>EXPLODE<br>";

$estado = "Maranhão/MA,São Paulo/SP";
$vetorEstado = explode("/", $estado);

echo $vetorEstado[0].$vetorEstado[1].$vetorEstado[2];

?>