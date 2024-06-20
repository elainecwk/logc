import leia from"readline-sync"

var naopoderodar = leia.questionInt("DIGITE O ULTIMO DIGITO DA PLACA ");

switch(ultimoDigito){
    case "0":
    case "1": 
      console.log("NAO PODE RODAR NA SEGUNDA");
      break;
    case "2":
    case "3":
    console.log("NAO PODE RODAR NA TERCA-FEIRA");
    break;
    case "4":
    case "5":
        console.log("NAO PODE RODAR NA QUARTA-FEIRA");
        break;
    case "6":
    case "7":
        console.log("NAO PODE RODAR NA QUINTA-FEIRA");
        break;
    case "8":
    case "9":
        console.log("NAO PODE RODAR NA SEXTA -FEIRA");
        break;
        default;
        console.log("DIGITO INVALIDO");
        break;

   


}





