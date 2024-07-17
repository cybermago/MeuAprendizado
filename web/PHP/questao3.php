<?php

function recursiva($a){

 if ($a !=  0) {
  echo "Função Recursiva com Valor = $a<br>";
  recursiva($a-1);
  } 
 }
recursiva(10);

echo "<hr>";

function fat($a){

if ($a < 0) {
	return -1;
}

else ($a <= 0) {
	return 1;
}
return $a*fat($a-1);
}
echo "Fatorial de 4:".fat("4");
?>