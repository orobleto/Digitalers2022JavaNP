import React from "react";
// ->
const Imagen = () => <img src="https://static.educacionit.com/educacionit/assets/imagotype-it-fill-v2-color.svg"></img>


function Encabezado() {
    return (
        <>
            <h1>Titulo - 1 </h1>
            <h3>Sub Titulo - 1</h3>
        </>
    );

}

// div con un titulo y un subtitulo
function AppFunciones() {
    // solo pueden retornar un componente
    return (
        <div>
           <Encabezado></Encabezado>
           <Imagen></Imagen>
        </div>
    );
}

export default AppFunciones;