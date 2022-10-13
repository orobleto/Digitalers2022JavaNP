import React from 'react';
import ReactDOM from 'react-dom/client';
import Tarjeta from './Componentes/Tarjeta';
/*
// obtengo el objeto root => div del html     <div id="root"></div>
const contenedor = document.getElementById("root");
// creamos un h1 => <h1></h1>
const h1 = document.createElement("h1");
//String con el saludo
const saludo = "Hola Mundo desde Digitalers";

// insertar texto en un elemento html
// h1 => <h1>Hola Mundo desde Digitalers</h1>
h1.innerText = saludo;

// insertar dentro del div id root el h1  <div id="root"><h1>Hola Mundo desde Digitalers</h1></div>
contenedor.appendChild(h1);
*/


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Tarjeta
      nombre="Octavio Robleto"
      correo="octavio.robleto@gmail.com"
      titulo="Ingeniero"
      >

    </Tarjeta>
    <Tarjeta
      nombre="Matias Acevedo"
      correo="matias.acevedo@gmail.com"
      titulo="Ingeniero"
    />


  </React.StrictMode>
);


