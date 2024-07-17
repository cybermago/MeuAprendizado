<?php

if (isset($_POST['a'])) {
    $a = $_POST['a'];
    verificar($a);
}

function verificar($a){
$nome = "Jonata Mendes";
$a = $nome;
echo "$a";
}

?>