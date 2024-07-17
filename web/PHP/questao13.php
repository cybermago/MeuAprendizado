<?php

$nota=40;

$idade=18;

if($idade >= 18) {
$vota = true;
}else{
$vota = false;
}  

if ($nota >= 70){
	echo "<font color=blue><h1>Aprovado</h1></font><hr>";
}else if($nota >= 50){
	echo "<font color=orange><h1>Recuperação</font><hr></h1>";
}else{
    echo "<font color=red><h1>Reprovado</font><hr></h1>";
}

if(($nota >= 40)&($nota <= 60)){
   echo "<font color=green><h1>Aluno Selecionado</h1></font><hr>";
}else{
  echo "<font color=darkred><h1>Aluno fora da faixa</font></h1>";
}

?>