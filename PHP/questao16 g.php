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
         display:grid;
         grid-template-columns:auto auto;
         border:1.5px ridge darkblue
        }

input:focus{box-shadow:0px 0px 5px blue}

input{border-radius:0px 2.5px 2.5px 0px;float:left;padding:5px}

.bt1{margin:0px 0px 0px 14.1%;
	padding:7px;
	background-color:darkblue;
	color:white;
	width:;
	height:
 }

 .bt1,.bt2{cursor:pointer;float:none}

.bt1:focus,.bt2:focus{box-shadow:none}

.bt2{margin:0px 0px 0px 21%;
	padding:7px;
	background-color:darkblue;
	color:white;
    width:;
    height:
   }

fieldset label{float:left;
               background-color:darkblue;
               color:white;
               margin:0px 0px 0px 15%;
               padding:5px
             }

fieldset h1{text-shadow:0px 0px 2.5px darkblue,0px 0px 2.5px lightblue }

</style>
</head>

<body>

<form method="post" action="#">
<fieldset>

<center>

<h1>Data de nascimento</h1>

<label>Data:</label>
<input type="text" name="data" size="20" maxlegth="14" placeholder="Data">
<br><br>

<input class="bt1" type="submit" name="validar" value="Validar">
<input class="bt2" type="reset" name="apagar" value="Apagar">

</form>
</fieldset>
<?php

if(isset($_POST['data'])){
$data = $_POST['data'];
ValidarData($data);
}
function ValidarData($dat) {
$data = explode('/',"$dat");

$d = $data[0];
$m = $data[1];
$y = $data[2];
$res = checkdate($m,$d,$y);
if($res == 1){
echo ("<fieldset><p>data ok!</p></fieldset>");
}
else{
echo ("<fieldset><p>data invalida!</p></fieldset>");
 }
}
?>
</body>
</html>