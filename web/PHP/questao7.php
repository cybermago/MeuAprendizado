<?php

$idade = array("5-7 anos","8-10 anos","11-13 anos","14-17 anos","Maiores de 18");

echo "<h1>Categoria/Idade<br>";
switch ($idade) {
	
	case ($idade >= 5):
	echo "Infantil A:5-7 anos<br>";
    
    case ($idade >= 8):
    echo "Infantil B:8-10 anos<br>";

    case ($idade >= 11):
    echo "Juvenil A:11-13 anos<br>";	

    case ($idade >= 14):
    echo "Juvenil B:14-17 anos<br>";	

    case ($idade >= 18):
    echo "Senior:Maiores de 18";	
    break;

	default:
		# code...
		break;
}

?>