import leia from "readline-sync";

var nomeC1 = leia.question("DIGITE O NOME \ n");
var valorC1 = leia.questionFloat("DIGITE O VALOR");

var nomeC2 = leia.question("DIGITE O NOME \n");
var valorC = leia.questionFloat("DIGITE O VALOR");

var total = valorC1 + valorC2;
console.log("VALOR TOTAL:" + total);

var media = total / 2;
console.log("VALOR MEDIO:"+ media);

var clientes = (valorC1 > 20) ? nomeC1 +"\n" : "";
clientes += (valorC2  > 20) ? nomeC2 +"\n" : "";
console.log(Cclientes;)

