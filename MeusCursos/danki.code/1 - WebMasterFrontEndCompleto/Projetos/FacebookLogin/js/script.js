
 // Obtendo o elemento select pelo ID
 let selectDias = document.getElementById("dia");
 // Loop para adicionar as opções de dia
 for (let i = 1; i <= 31; i++) {
 // Criando um novo elemento option
 let option = document.createElement("option");
 // Definindo o valor do option como o dia atual do loop
 option.value = i;
 // Definindo o texto do option como o dia atual do loop
 option.innerHTML = i;
 // Adicionando o option ao select
 selectDias.appendChild(option);
 }


 // Obtendo o elemento select pelo ID
 let selectAnos = document.getElementById("anos");
 // Loop para adicionar as opções de ano
 for (let ano = 1920; ano <= 2024; ano++) {
 // Criando um novo elemento option
 let option = document.createElement("option");
 // Definindo o valor do option como o ano atual do loop
 option.value = ano;
 // Definindo o texto do option como o ano atual do loop
 option.innerHTML = ano;
 // Adicionando o option ao select
 selectAnos.appendChild(option);
 }