import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {

    state = {
        status: {}

    }

    render() {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <p>
                        Hello there! Your service is {this.state.status.status} as of {this.state.status.statusDate}
                    </p>
                </header>
            </div>
        );
    }

    componentDidMount() {
        let fail;
        fetch('http://localhost:8080/health')
            .then(
                res => res.json()
            )
            .then((data) => {
                this.setState({status: {
                        status: 'up',
                        statusDate: data.statusDate
                    }})
            })
            .catch(
                fail = { status: 'down', statusDate: 'now'},
                this.setState( { status: fail})
            )
    }
}

export default App;
