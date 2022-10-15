import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

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

ReactDOM.render(
  <React.StrictMode>
    <App/>
  </React.StrictMode>,
  document.getElementById('root')
);

/*
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App/>
  </React.StrictMode>
);
*/

