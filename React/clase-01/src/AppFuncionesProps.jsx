import React from "react";


const arreglo = [1,2,3,4,5];
//map( e -> e*2)
function AppFuncionesProps(props) {
    return (
        <>
            <h4>{props.nombre}</h4>
            <h6>{props.profesion}</h6>
           { //<p>{arreglo.map(e=><h2>{e*3}</h2>)}</p>
           }
        </>
    );
}
export default AppFuncionesProps;
