$(function(){

	var frase = 'cybermago@gmail.com';

	var verifica = frase.match(/^(.*?)@(.*?)$/);
	console.log(typeof(verificarclique));

	if(verifica != null ){
		console.log("encontramos algo");
		console.log(verifica[1]);
		console.log(verifica[2]);
		console.log(verifica[3]);
	}else{
		console.log("não encontramos nada");
	}

	abrirjanela();
	verificarclique();

	function abrirjanela(){
		$('.btn').click(function(){
			e.stopPropagation();
			$('.bg').fadeIn();
		});
	}

	function verificarclique(){
		var el= $('body');

		el.click(function(){
			$('.bg').fadeOut();
		})
		$('.form').click(function(e){
			e.stopPropagation();
		});
	}

});