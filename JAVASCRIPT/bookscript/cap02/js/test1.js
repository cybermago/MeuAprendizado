const resp = document.querySelector("h1")
const sub = document.querySelector("form")

const x = 10 / 2 * Math.sqrt(9) - 4

sub.addEventListener("submit", (e) => {
    const number = sub.inNumber.value   //obtém o nome digitado no form
    10 / 2 * Math.sqrt(number) - 4
    resp.innerText = `olá ${number}`  //exib a resposta
    e.preventDefault()  //evita envio do form
})

const nome = document.querySelector("form").inNumber.value