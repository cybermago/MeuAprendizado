<!doctype html>
<html lang="pt-br">
<head><title>formulario com php</title>
<style type="text/css">	
	body{color:black;
     background-color:#eeeeee;
     -webkit-background-size:cover;
     -moz-background-size:cover;
     -ms-background-size:cover;
     -o-background-size:cover;
     margin:0px;
     padding:0px;
     font-family:silver
    }

form{border-top:50px ridge darkblue;
     width:25%;
     margin:auto
    }

fieldset{margin:auto;
         width:92.9%;
         height:200px;
         padding:10px;
         border:1.5px ridge darkblue
        }

input:focus{box-shadow:0px 0px 5px blue}

input{border-radius:0px 2.5px 2.5px 0px;float:left;padding:8px}

.bt1{margin:0px 0% 0px 0%;
	padding:15px;
	background-color:darkblue;
	color:white;
	width:;
	height:
 }

 .bt1{cursor:pointer;float:none}

.bt1:focus{box-shadow:none}

fieldset label{float:left;
               background-color:darkblue;
               color:white;
               margin:0px 0px 0px 0%;
               padding:8px
             }

fieldset h1{text-shadow:0px 0px 2.5px darkblue,0px 0px 2.5px lightblue }
</style>
</head>

<body>

<form name="formulario" method="post" action="aula 5_02_calc.php">
	<fieldset>

<label>Número 1:</label>
<input type="text" name="n1"><br><br>

<label>Número 2:</label>
<input type="text" name="n2"><br><br>
<input type="radio" name="operacao" value="Soma" checked="checked">Soma<br>
<input type="radio" name="operacao" value="Subtração">Subtração<br>
<input type="radio" name="operacao" value="Multiplicação">Multiplicação<br>
<input type="radio" name="operacao" value="Divisão">Divisão<br>
<input class="bt1" type="submit" name="calcular">

<?php

if(isset($_POST["resultado"])){

if($_POST["resultado"] != ""){

echo'<h3><label>Resultado:</label>'.$_POST["resultado"].'</h3>';
 }
}
?>
</body>
</html>