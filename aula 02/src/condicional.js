//IF/ELSE
import leia from "readline-sync"
var numero = 1;


//if (numero > 0) {
//    console.log("NUMERO POSITIVO..M");

//}else if(NUMERO < 0) {
 // console.log("NÂO NUMERO NEGATIVO.".);
//} else {
//    console.log("O NUMERO E ZERO");
//}

//var x = 10;
//if(x < 100){
//    console.log("MENOR QUE CEM");
//}

//if(x < 1000){
//    console.log("MENOR QUE MIL");
//}


var codigoErro = leia.questionInt("DIGITE O CODIGO DO ERRO");
switch (codigoErro){
    case 400:
    case 401:
    case 404:
       console.log("HTTP CODE ERROR APLICAÇAO")
       break;
case 500:
case 501:
case 502:
       console.log("HTTP CODE ERROR DE SERVIDOR")
      break;
 default:
       console.log("NAO E ERRO")
    break;     

}
    

