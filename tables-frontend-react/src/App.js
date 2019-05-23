import React from 'react';
import './App.css';
import { Button, Navbar, Nav, Container, Card, InputGroup, FormControl  } from 'react-bootstrap';
import { fetchTables, createTable } from './actions';

class App extends React.Component {
  state = {
    tables: [],
    currentPage: 'main',
    number: '',
    capacity: '',
    position: '',
    createdTable: null,
  }

  componentDidMount() {
    fetchTables().then((tables => {
      this.setState({ tables })
      console.log('yeah')
    })).catch(err => console.log('some errror', err))
  }

  onChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value
    })
  }

  render() {
    // console.log(this.state)
    const main = (
      <Card>
        <Card.Header>Choose a table</Card.Header>
        <Card.Body>
          {
            // console.log(this.state.tables)
            this.state.tables.map((table, i) => {
              return (
                <Card style={{ margin: '0.3em' }} key={`card-${i}`}>
                  <Card.Body>
                    <Card.Title>Table no {table.number}</Card.Title>
                    <Card.Subtitle>Position: {table.position}</Card.Subtitle>
                    <Card.Text>Capacity: {table.capacity ? table.capacity : 'N/A'}</Card.Text>
                  </Card.Body>
                  <Card.Footer>
                    <Button variant="link">Select</Button>
                  </Card.Footer>
                </Card>
              )
            })
          }
          <div>
            <Card.Footer style={{ 'textAlign': 'right' }}>
              <Button style={{ margin: '0 0.3em' }} variant="outline-danger">Cancel</Button>
              <span></span>
              <Button style={{ margin: '0 0.3em' }} variant="outline-success">Proceed</Button>
            </Card.Footer>
          </div>
        </Card.Body>
      </Card>
    )
    
    const sep = <div style={{margin: '0.5em'}}></div>
    const createTableComponent = (
      <div>
        <Card>
          <Card.Header>Create table</Card.Header>
          <Card.Body>
            <form onSubmit={(e)=> {
              e.preventDefault()
              const body = {
                number: this.state.number,
                capacity: this.state.capacity,
                position: this.state.position,
              }
              createTable(body).then(table => {
                this.setState({createdTable: table, tables: [...this.state.tables, table]})
                setTimeout(()=> {
                  this.setState({createdTable: false})
                }, 3000)
              })
            }}>
            <InputGroup>
              <InputGroup.Prepend>
                <InputGroup.Text style={{minWidth: '6em'}}>Number</InputGroup.Text>
              </InputGroup.Prepend>
              <FormControl name="number" value={this.state.number} onChange={this.onChange} />
            </InputGroup>
            {sep}
            <InputGroup>
              <InputGroup.Prepend>
                <InputGroup.Text style={{minWidth: '6em'}}>Capacity</InputGroup.Text>
              </InputGroup.Prepend>
              <FormControl name="capacity" value={this.state.capacity} onChange={this.onChange} />
            </InputGroup>
            {sep}
            <InputGroup>
              <InputGroup.Prepend>
                <InputGroup.Text style={{minWidth: '6em'}}>Position</InputGroup.Text>
              </InputGroup.Prepend>
              <FormControl name="position" value={this.state.position} onChange={this.onChange} />
            </InputGroup>
            {sep}
            <Button type="submit" variant="success" style={{margin: '0.5em'}}>Create</Button>
            <Button variant="outline-danger" style={{margin: '0.5em'}} onClick={() => this.setState({currentPage: 'main'})}>Back</Button>
            {this.state.createdTable ? <div style={{color: 'green'}}>Success</div> : null}
            </form>
          </Card.Body>
        </Card>
        
      </div>
    )


    return (
      <div className="App">
        <Navbar>
          <Navbar.Brand>Tables on the beach</Navbar.Brand>
          <Nav>
            <Nav.Link onClick={() => this.setState({ currentPage: 'main' })}>Home</Nav.Link>
            <Nav.Link onClick={() => this.setState({ currentPage: 'main' })}>Tables</Nav.Link>
            <Nav.Link onClick={() => this.setState({ currentPage: 'createTable' })}>Create table</Nav.Link>
          </Nav>
        </Navbar>
        <Container>
          {this.state.currentPage === 'main' && main}
          {this.state.currentPage === 'createTable' && createTableComponent}
        </Container>
      </div>
    );
  }

}

export default App;
