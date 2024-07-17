<?php

$vet=array(5);
$vet2=array("nome"=>"Jonata","cidade"=>"coroata","estado"=>"maranhao");
$mat=array(
	 array("Fiat Uno","125000"),
     array("Pegeot argo","70000"),
     array("Hindai sitroen","50000"));
$i=0;

$vet[0]="arroz";
$vet[1]="feijão";
$vet[2]="salada";
$vet[3]="carne";
$vet[4]="macarrão";

echo "<font color=red><h1><b><i>Elemento do inice $i = ".$vet[$i]."<hr></strong></font></b></i>";

echo "Nome: ".$vet2["nome"]."<br>Cidade:".$vet2["cidade"]."<br>Estado:".$vet2["estado"]."<hr>";

echo "Carro A = ".$mat[0][0]." - Valor:".$mat[0][1]."<br>";
echo "Carro B = ".$mat[1][0]." - Valor:".$mat[1][1]."<br>";
echo "Carro C = ".$mat[2][0]." - Valor:".$mat[2][1]."<hr>";

?>