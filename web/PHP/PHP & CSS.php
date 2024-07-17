<?php header('Content-type:text/css'); ?>
body {
   background-color: <?php echo (isset($_GET['fundo']) && $_GET['fundo'] == 'verde') ? '#0f0' /* Verde */ : '#00f' /* Azul */; ?>
}