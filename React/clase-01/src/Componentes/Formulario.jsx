import React, { Component } from "react";
import '../recursos/css/form.css';
export default class Formulario extends Component {
    constructor(props) {
        super(props);
        this.state = {
            first_name: "",
            last_name: "",
            email: ""
        }
    }

    enviar = (event) => {
        event.preventDefault();
        //console.warn(this.state);
        this.props.funcionAgregar(this.state.first_name, this.state.last_name, this.state.email);
        this.limpiar();
    }

    asignarValores = (event) => {
        this.setState({ [event.target.id]: event.target.value });
    }

    limpiar = () => {
        this.setState(
            {
                first_name: "",
                last_name: "",
                email: ""

            }
        );
    }

    render() {
        return (<>
            <form onSubmit={this.enviar}>
                <input
                    id="first_name"
                    type="text"
                    placeholder="Nombre"
                    required={true}
                    value={this.state.first_name}
                    onChange={this.asignarValores}
                />
                <input
                    id="last_name"
                    type="text"
                    placeholder="Apellido"
                    required={true}
                    value={this.state.last_name}
                    onChange={this.asignarValores}
                />
                <input
                    id="email"
                    type="email"
                    placeholder="Correo"
                    required={true}
                    value={this.state.email}
                    onChange={this.asignarValores}
                />

                <button class="button success" type="submit">Enviar</button>
                <button class="button warning" type="reset" onClick={this.limpiar}>Limpiar</button>
            </form>

        </>);
    }
}