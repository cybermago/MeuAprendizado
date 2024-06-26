<?php

define("ver",PHP_VERSION);
define("file",__FILE__);
define("dir",__DIR__);
define("OS",PHP_OS);

echo "<font size=5px color=darkred>Versão do PHP:".ver."<br><br>";

echo "".file."<br><br>";

echo "".dir."<br><br>";

echo "Versão do Sistema Operacional:".OS."<br><br>";

echo $_SERVER['HTTP_USER_AGENT']."<br><br>";

?>