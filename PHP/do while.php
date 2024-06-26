<?php

$i=0;
$tam=3;

echo "<H3>LOOP DO WHILE<BR>";

do{
echo "<h3><pre>Valor de i: $i<br>";
echo "Valor de tam: $tam</pre></h3><br>";
$i++;
}while($i < $tam);

echo "<hr><br>";

echo "<h3>LOOP WHILE<br>";

$i=0;
$tam=3;
while ($i < $tam) {
echo "<h3><pre>Valor de i: $i<br>";
echo "Valor de tam: $tam</pre></h3><br>";
$i++;
}

?>