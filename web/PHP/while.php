<?php  

$i=0;
$tam=5;
$vet=array($tam);

while ($i < $tam) {
echo "Valor de i: $i</br>";
$i++;
}
echo "<hr>";

$i=0;
while ($i < $tam) {
	$vet[$i]="PHP";
	$i++;
}
$i=0;
while ($i < $tam) {
echo "$vet[$i]<br>";
$i++;
}
?>