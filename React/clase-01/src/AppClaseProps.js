import React, { Component } from "react";


export default class AppClaseProps extends Component {


    render() {
        return (
        <>
            <h4>{this.props.first_name}</h4>
            <h6>{this.props.last_name}</h6>

        </>
        );
    }
}