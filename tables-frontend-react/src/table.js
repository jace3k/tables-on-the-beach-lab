import React, { Component } from 'react'
import { Card } from 'react-bootstrap';

export default class TableView extends Component {
    render() {
        const table = this.props.table
        return (
            <div>
                <Card>
                    <Card.Header>Table no {table.number}</Card.Header>
                    <Card.Body>This is detail view of a table.</Card.Body>
                </Card>
            </div>
        )
    }
}
