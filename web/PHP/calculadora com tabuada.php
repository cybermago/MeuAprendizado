<!DOCTYPE html>
<html>
<head>
	<title></title>
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
     width:30%;
     margin:auto
    }

fieldset{margin:auto;
         width:92.9%;
         height:250px;
         padding:10px;
         display:grid;
         grid-template-columns:auto auto;
         border:1.5px ridge darkblue
        }

input:focus{box-shadow:0px 0px 5px blue}

input{border-radius:0px 2.5px 2.5px 0px;float:left;padding:5px}

.bt1{margin:0px 0px 0px 0px;
  padding:5px;
  background-color:darkblue;
  color:white;
  width:;
  height:;
 }

 .bt1{cursor:pointer;float:none}

.bt1:hover:{background-color:blue;
            transition:all 0.5s linear
          }


fieldset label{float:left;
               background-color:darkblue;
               color:white;
               margin:0px 0px 0px 0%;
               padding:5px
             }

fieldset h1{text-shadow:0px 0px 2.5px darkblue,0px 0px 2.5px lightblue }

table{border:10px ridge red}

</style>
</head>
<body>

<h1>Calculadora de tabuada</h1>
<hr>
<form name="formulario" method="get" action="#">
  <fieldset>
<p>

<label>Numero:</label>
<input type="number" required pattern="[0-9]" name="numero">
<input class="bt1" type="submit" value="Calcular">

</p>
</form>
<?php

if(isset($_GET["numero"]))
if ($_GET["numero"] != "") calcula();

	function calcula(){
    echo"<table cellspacing = 2.5 cellpadding = 2.5 border = 2 rules = none>";
    echo"<tr class = linha><td colspan = 5 >Tabuada do " . $_GET["numero"] . "</td></tr>";
    for($i=1; $i<=10; $i++){
    $resultado = $_GET["numero"] * $i ;
    echo "<tr ";
    if(($i % 2) == 0){
    echo "class = linha";
    echo ">";
    echo"<br><td>".$i . "<td>";
    echo "<td>X</td>";
    echo "<td>".$_GET["numero"]."</td>";
    echo "<td>=</td>";
    echo "<td>". $resultado . "</td>";
    echo "</tr>";
      }
      echo "</table>";
      }
    }
     ?>
</fieldset>
<hr />
</body>
</html>