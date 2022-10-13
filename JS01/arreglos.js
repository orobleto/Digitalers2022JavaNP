nombres = ["Octavio", "Rafael", "Sol", "Malena"];
// nombres= new Array();
document.write(nombres);

objetos = ["cadena", 2, true, [1, 2], "-", NaN, undefined, null];
console.log(objetos);


for (indice = 0; indice < nombres.length; indice++) {
    console.log(nombres[indice]);
}

// for of analogo de foreach
for (nombre of nombres) {
    console.log("Nombre: "+nombre);
}

// ordenar
nombres.sort();

console.log(nombres);

// eliminar
nombres.pop();
console.log(nombres);
//agregar
nombres.push("Analia");
console.log(nombres);

// agregar al comienzo
nombres.unshift("Ivanna");
console.log(nombres);

// eliminar al principio
nombres.shift();
console.log(nombres);


cadena = "cada uno de estos elementos puedes ser dividido e insertado en un arreglo";
arregloCadena = cadena.split(" ");
console.log(arregloCadena);