<?php
if (isset($_POST['enviar'])):
    $aluno = $_POST['nome'];
    $nota1 = $_POST['nota1'];
    $nota2 = $_POST['nota2'];
    $nota3 = $_POST['nota3'];

    $media = ($nota1 + $nota2 + $nota3) / 3;

    echo "Olá " . $aluno ." suas notas foram: <br>"
        ."Primeiro Bimestre: " . $nota1 . "<br>"
        ."Segundo Bimestre: " . $nota2 . "<br>"
        ."Terceiro Bimestre: " . $nota3 . "<br>"
        ."Sua média final é " . $media . " - ";

    if ($media >= 7):
        echo "Aluno Aprovado!";
    elseif (($media < 7) && ($media >= 5)):
        echo "Aluno em Exame!";
    else:
        echo "Aluno Reprovado!";
    endif;
endif;
?>