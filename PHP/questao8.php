<?php

$hora=date("H");
$minuto=date("i");
$segundo=date("s");

echo $hora.":".$minuto.":".$segundo."<br>";

if ($hora < 12) {
	echo "<h1>Bom dia!!!";
}
else if($hora < 18){
echo "Boa Tarde!!!";
}else{
echo "Boa Noite";
}

?>