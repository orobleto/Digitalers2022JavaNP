import React from "react";
import Formulario from "./Componentes/Formulario";
import Usuario from "./Componentes/Usuario";
//import usuariosJSON from './recursos/json/users.json';
export default class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            usuarios: [],
            url: "https://reqres.in/api/users"
        }
    }

    componentDidMount() {
        this.buscarUsuarios();
    }

    agregarUsuario = (first_name, last_name, email) => {
        const usuario = {
            first_name: first_name,
            last_name: last_name,
            email: email,
            avatar: "https://reqres.in/img/faces/1-image.jpg"
        }

        const header = {
            method: "POST",
            body: JSON.stringify(usuario),
            headers: {
                "Content-Type": "application/json"
            }
        }

        fetch(this.state.url, header)
            .then(response => response.json())
            .then(json => this.setState({ usuarios: [...this.state.usuarios,json] }))
            .catch(error => console.error(error))
            .finally(() => console.info("Finalizo el llamando"))

    }

    buscarUsuarios = () => {
        fetch(this.state.url)
            .then(response => response.json())
            .then(json => { console.warn(json); this.setState({ usuarios: json.data }); })
            .catch(error => console.error(error))
            .finally(() => console.info("Finalizo el llamando"))
    }
    render() {
        return (
            <>
                <div>
                    <Formulario  funcionAgregar = {this.agregarUsuario}/>

                </div>
                {
                    this.state.usuarios.map(
                        usuario => (
                            <Usuario
                                first_name={usuario.first_name}
                                last_name={usuario.last_name}
                                email={usuario.email}
                                avatar={usuario.avatar} />
                        )
                    )


                }

            </>
        )
    }

}