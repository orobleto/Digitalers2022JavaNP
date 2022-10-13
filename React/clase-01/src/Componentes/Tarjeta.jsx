import React, { Component } from "react";
import '../recursos/css/tarjeta.css';

const ccs1 = {
    color: "red",
    boxShadow: "0 5px 10px 0 blue"
}

const css2 = {
    color: "blue",
    boxShadow: "0 5px 10px 0 yellow"
}
export default class Tarjeta extends Component {
    constructor(props) {
        super(props);
        this.state = {
            nombre: this.props.nombre,
            correo: this.props.correo,
            titulo: this.props.titulo,
            mostrarNombre: true
        }

    }

    CambiarEstadoMostrarNombre = () => {

        this.setState({ mostrarNombre: !this.state.mostrarNombre });

    }

    render() {
        return (

            <div className="tarjeta">
                <img src="https://e7.pngegg.com/pngimages/84/165/png-clipart-united-states-avatar-organization-information-user-avatar-service-computer-wallpaper-thumbnail.png" alt="" height="50px" width="50px" />
                <div className="contenedor">
                    <h2 style={this.state.mostrarNombre ?ccs1:css2}>{this.state.mostrarNombre ? this.state.nombre : this.state.correo}</h2>
                    <h4>{this.state.titulo}</h4>
                    { /*<button onClick={()=> this.setState({ mostrarNombre: !this.state.mostrarNombre })} >Cambiar Nombre por Correo</button>*/}

                    <button onClick={this.CambiarEstadoMostrarNombre} >{this.state.mostrarNombre ? "Mostrar Correo" : "Mostrar Nombre"}</button>
                </div>
            </div>
        );
    }

}