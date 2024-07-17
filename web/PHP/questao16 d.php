<?php
 $array1 = array('Brasil', 'Espanha', 'Argentina', 'Estados Unidos');

 $array2 = array('Estados Unidos', 'Argentina', 'Brasil');

 $arrayDiferenca = array_diff($array1, $array2);

 print_r($arrayDiferenca); 
?>