import leia from "readline-sync"

var codigosenha= leia.questionInt("DIGITE A SENHA")



 switch (senha){
    case  1234:
        console.log("Acesso Permitido")
        break;
    default: 
        console.log("Acesso Negado")
        break;
    
 }
