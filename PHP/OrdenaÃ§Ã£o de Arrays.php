<style type="text/css">

h1{}	

</style>

<?php

$a = $array = array(5,3,7,1,2);

echo "<h1>Desordenado</h1>";

for ($i=0; $i<=count ($a)-1; $i++){
echo "<h1></h1>".$a[$i];
}

for ($i=0; $i<count($a)-1; $i++){
 if($a[$i] > $a[$i+1]){
   
   $tmp = $a[$i+1];

   $a[$i+1] = $a[$i];

   $a[$i] = $tmp;

   $i=-1;	
}
}
echo "<h1>Ordenado</h1>";

for ($i=0; $i<=count($a); $i++){
	 echo "<h1><div></div></h1>".$a[$i];
	}
?>