function adicionar(valor) {
    document.getElementById("display").value += valor;
}
function limpar() {
    document.getElementById("display").value = "";
}
function calcular() {
    let expressao = document.getElementById("display").value;
    fetch("http://127.0.0.1:5000/calcular", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ expressao })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById("display").value = data.resultado;
    })
    .catch(error => {
        console.error("Erro na API:", error);
    });
}