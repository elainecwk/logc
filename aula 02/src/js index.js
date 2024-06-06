import leia from "readline-sync"



var corrida1 = leia.questionFloat("DIGITE PRIMEIRO VALOR");
var corrida2 = leia.questionFloat("DIGITE SEGUNDO VALOR");
var corrida3 = leia.questionFloat("DIGITE TERCEIRO VALOR ");
var corrida4 = leia.questionFloat("DIGITE QUARTO VALOR");
var corrida5 = leia.questionFloat("DIGITE QUINTO VALOR");

var valorBruto = corrida1 + corrida2 + corrida3 +corrida4 + corrida5;
var valorLiqudo = valorBruto - ( valorBruto * 0,25);

    
console.log ("VALOR LIQUDO: R$" + valor)


