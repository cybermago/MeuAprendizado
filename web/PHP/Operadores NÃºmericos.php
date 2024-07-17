<!doctype html>
<html lang="pt-br">
<head><title>Operadores Aritmetcos</title>

<meta charset="utf-8">

</head>

<body>

   <?php

     echo "<font color=red><h2>Adição:soma = n1+n2 ou (n1+n2)<br><br>Subtração:subtração = n1-n2 ou (n1-n2)<br><br>Multiplicação:multiplicação = n1*n2 ou (n1*n2)<br><br>Divisão:divisão = n1/n2 ou (n1/n2)<br><br>Modulo:modulo = n1%n2 ou (n1%n2)<br><br>";

     $av1=7.0;
     $av2=5.8;
     $av3=9.7;
     $num1 = 4;
     $num2 = 6;
     $soma = $num1 + $num2;
     $subtração = $num1 - $num2;
     $multiplicação = $num1 * $num2;
     $divisão = $num1 / $num2;
     $modulo = $num1 % $num2;
     $media = ($av1+$av2+$av3)/3;

     echo "Soma e igual:".$soma."<br>";
     echo "Soma e igual:".($num1+$num2)."<br><br>";

     echo "Subtração e igual:".$subtração."<br>";
     echo "Subtração e igual:".($num1-$num2)."<br><br>";

     echo "Multiplicação e igual:".$multiplicação."<br>";
     echo "Multiplicação e igual:".($num1*$num2)."<br><br>";

     echo "Divisão e igual:".$divisão."<br>";
     echo "Divisão e igual:".($num1/$num2)."<br><br>";

     echo "Modulo e igual:".$modulo."<br>";
     echo "Modulo e igual:".($num1%$num2)."<br><br>";

     echo "Media e igual:".$media."<br>";
     echo "Media e igual:".($av1+$av2+$av3)/3;

   ?>

</body>
</html>
