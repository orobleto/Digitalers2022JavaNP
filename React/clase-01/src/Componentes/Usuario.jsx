import React from "react";
import { Component } from "react";
import '../recursos/css/cards.css';
class Usuario extends Component {
    constructor(props) {
        super(props);
        this.state = {
            first_name: this.props.first_name,
            last_name: this.props.last_name,
            email: this.props.email,
            avatar: this.props.avatar,
            mostrarNombre: true
        }
    }

    render() {
        return (
            <div class="card">
                <div class="card-side front">
                    <div>
                        <h3>{this.state.first_name + " " + this.state.last_name}</h3>
                        <img class="card-image" src={this.state.avatar}></img>
                    </div>
                </div>
                <div class="card-side back">
                    <div>
                        <h3>{this.state.mostrarNombre ? this.state.first_name : this.state.last_name}</h3>
                        <br />
                        <br />
                        <br />
                        <button onClick={() => this.setState({ mostrarNombre: !this.state.mostrarNombre })} class="button-swing">Mostrar {this.state.mostrarNombre ? "Apellido" : "Nombre"}</button>
                    </div>
                </div>
            </div>
        );
    }

}

export default Usuario;