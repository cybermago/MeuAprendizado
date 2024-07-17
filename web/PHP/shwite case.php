<!DOCTYPE html>
<html lang="pt-br" accesskey="" xmlns="" contenteditable="" contextmenu="" version="" manifest="">
<head>
	<title></title>
</head>
<body>

<form name="cadrasto" method="post"  accesskey="" autocomplete="" accept="" accept-charset="utf-8" action="#">
	
<label>Selecione um número</label><br>
<input type="number" name="opc" required placeholder="Digite um número">

<input type="submit" name="enviar" value="Comfirmar">

<?php

if(isset($_POST['opc'])) {
$opc = $_POST['opc'];
}

$opc=2; //1:Carro - 2:Moto - 3:Bike
//4:Navio - 5:Avião
switch ($opc) {
	case '1':
	$opc-1;
		echo "<h1>Carro</h1>";
		break;
	
    case '2':
    	echo "<h1>Moto</h1>";
    	break;

    case '3':
    $opc+1;
    	echo "<h1>Bike</h1>";
    	break;

    case '4':
    $opc+2;	
    	echo "<h1>Navio</h1>";
    	break;

    case '5':
    $opc+3;
    	echo "<h1>Avião</h1>";
    	break;

	default:
		echo "<h1>Essa opção não existe</h1>";
		break;
}

echo "<hr color=red width=99%>";

switch ($opc) {
	case ($opc <= 3 and $opc > 0):
		echo "<h1>Tranporte Terrestre</h1>";
		break;
	
case '4':
	echo "<h1>Tranporte Maritimo</h1>";
	break;

case '5':
	echo "<h1>Tranporte Aereo</h1>";
	break;
}

?>
</form>
</body>
</html>