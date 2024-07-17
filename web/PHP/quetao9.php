<?php
$n1 = $_POST['n1'];
$n2 = $_POST['n2'];
$operacao = $_POST['operacao'];

function calcular($n1,$n2){
  global $n1;
  global $n2;
  global $operacao;
  if($n1 ==  "" || $n2 == ""){ 
  return "";
  switch($operacao){
    
    case 'Multiplicacao': 
    $resultado = $n1 * $n2; 
    echo "$resultado";
    break;
    
    case 'Divisao': 
    $resultado = $n1 / $n2; 
    echo "$resultado";
    break;
    
    case 'Soma': 
    $resultado = $n1 + $n2;
    echo "$resultado";
    break;
    
    case 'Subtracao': 
    $resultado = $n1 - $n2; 
    echo "$resultado";
    break;
 
    default:

    break;

 }

 return($resultado);
}
header('Location:aula 5_02_form.php?resultado='. calcular());
}
?>