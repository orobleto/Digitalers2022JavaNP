// una linea

/*
multiples
*/

// variables y constantes en JS TS

numero = 1;
decimal = 3.16;
cadena1 = "Hola' Mundo";
cadena2 = 'Hola "Mundo';
estaActivo = true;
arreglo = ["Octavio", "Rafael", "sol"];
console.log(typeof (estaActivo));

// operadores 
// matematicos
// * / + - %

console.log(2 - 3.3);
// operadores de comparacion  > < >= <= ! == === != !===

// si puede transforma la cadena en numero y compara
console.log("2" == 2); //true
console.log("2" != 2); // false
console.log(1 == true);//true
console.log(0 == false);//true
console.log(["Octavio"] == false);//false

// operadores de asignacion 
// +=, -=, *=, /=, %=
// ++, --
num1 = 5;
num2 = 6;
total = 0;
total += num1;

console.log(total);
console.log(total++);
console.log(++total);
console.log(total);

// operadores logicos || &&

console.log(true && true); //true
console.log(true || false);//true



var octavio;//

console.log(typeof (octavio) == "undefined");// true
console.log("2" + 3);//23
console.log(+"2" + 3);//5

console.log("2" - 3);//-1

console.log("A" - 3);// NaN

console.log(typeof (null));//object
console.log(typeof (NaN));//number
// no es lo mismo undefined que null

console.log(typeof ([]));



// var let y const


// condicionales

//calculadora
numero1 = 5;
numero2 = 6;
total = 0;
operador = "+";

// simple
if (operador == "+") {
    console.log(numero1 + numero2);
}


// if else
operador = "-";
if (operador == "+") {
    console.log(numero1 + numero2);
} else {
    console.log(numero1 - numero2);
}

// anidado
operador = "/";
if (operador == "+") {
    console.log(numero1 + numero2);
} else if (operador == "-") {
    console.log(numero1 - numero2);
} else if (operador == "/") {
    if (numero2 == 0) {
        console.log("No se puede dividir por cero");
    } else {
        console.log(numero1 / numero2);
    }
} else if (operador == "*") {
    console.log(numero1 * numero2);
} else {
    console.log("No es un operador valido");
}

//switch

switch (operador) {
    case "s":
    case "+":
        console.log(numero1 + numero2);
        break;
    case "r":
    case "-":
        console.log(numero1 - numero2);
        break;
    case "m":
    case "*":
        console.log(numero1 * numero2);
        break;
    case "d":
    case "/":
        if (numero2 == 0) {
            console.log("No se puede dividir por cero");
        } else {
            console.log(numero1 / numero2);
        }
        break;
    default:
        console.log("No es un operador valido");
}


// operador ternario 
console.log(2 == "2" ? "Es un dos" : "No es un dos");//es un dos


// bucles 

contador = 0;

while (contador < 10) {
    console.log(contador++);
}


do {
    console.log(contador++);
} while (contador < 10);


for (i = 0; i < 20; i++) {
    console.log(i);
}


