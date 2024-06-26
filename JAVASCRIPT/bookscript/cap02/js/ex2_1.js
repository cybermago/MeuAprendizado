// cria referencia ao form e ao elemento h3 (onde será exibida a resposta)
const frm = document.querySelector("form")
const resp = document.querySelector("h3")
const cor = document.querySelector("#inCor")
const list = document.querySelector(".lista")

//cria um ouvinte de evento， acionado botão submit for clicado 
frm.addEventListener("submit", (e) => {
    const nome = frm.inNome.value   //obtém o nome digitado no form
    resp.innerText = `olá ${nome}`  //exib a resposta
    e.preventDefault()  //evita envio do form
})

const nome = document.querySelector("form").inNome.value
frm.addEventListener("submit", (e) => { comandos })