
// existen 3 formas de declarar en JS var let const
// por defecto var

// var tiene un alcance de funcion
function ciclarVar() {
// var cadena;
// var ciclo;
    console.log(cadena);
    console.log(ciclo);

    for (i = 0; i < 10; i++) {
        console.log(i);

        if (true) {
            var ciclo = 5;
        }
    }

    console.log("Cuanto vale"+i);

    var cadena = "cadena de caracteres";
    console.log(cadena);
}

ciclarVar();
console.log("Voy con let");
function ciclarLet() {

    for (let i = 0; i < 10; i++) {
        console.log(i);
        if (true) {
       
            let variable = 8;
            console.log(variable);
        }
    }
}

ciclarLet();


const num = 5;
num=6;
// el orden deberia ser const -> let -> var NOOOOOOOOOOOOOOO

