<!doctype html>
<html lang="pt-br">
<head>
	<title></title>
</head>
<body>

<form  method="post" action="#">

<?php

   if (isset($_POST['a']['b']['tipo'])) {
   $a = $_POST['a'];
   $b = $_POST['b'];
   $tipo = ['tipo'];
   soma($a,$b);
   subtracao($a,$b);
   multiplicao($a,$b);
   divisao($a,$b);
   }

   function soma($a,$b){
   if ($tipo == 'Soma') {
   return $a + $b;
   echo "Soma e igual a = ";
    }
   }

   function subtracao($a,$b){
   if ($tipo == 'Subtração') {
   return $a - $b;
   echo "Subtração e igual a = ";
    }
   }

   function multiplicacao($a,$b){
   if ($tipo == 'Multiplicaçao') {
   return $a * $b;
   echo "Multiplicação e igual a = ";
    }
   }

   function divisao($a,$b){
   if ($tipo == 'Divisão') {
   return $a / $b;
   echo "Divisao e igual a = ";
    }
   }

?>

<label>Numero1:</label><br>	
<input type="number" name="a">

<select name="tipo">
<option value="So">Soma</option>
<option value="Su">Subtração</option>
<option value="Mu">Multiplicação</option>
<option value="Di">Divisão</option>	
</select>

<label>Número2</label>
<input type="number" name="b">

<input type="submit" name="emviar" value="emviar">

</form>
<br><br><br><br>
<form action="#" method="post">

<?php

if (isset($_POST['num'])) {
$num = $_POST['num'];
potencia($num);
}
function potencia($num){
$num;
$resultado = $num**2;
$exp = 2;
echo "<h3>potencia e igual a = ".$num."<sup>$exp</sup> = $resultado<br>";
}

?>
	
<label>Digite um número:</label><br>
<input type="number" name="num">

<input type="submit" name="emviar" value="emviar">

</form>

</body>
</html>