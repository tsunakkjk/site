botao = document.getElementById("entrar");

botao.addEventListener("click", function(){
    usuario = document.getElementById("usuario").value;
    senha = document.getElementById("passaword").value;

    if(usuario === "admin" && senha== "1234") { 
        window.location.href("../index.html") ;
    } else {
        alert("Usuário ou senha incorretos") ;
    }

});
