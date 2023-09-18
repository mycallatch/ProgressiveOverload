import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <title>Home</title>
      <label><h1>Progressive Overload</h1></label>
        <p>Everything you need to know for your fitness!</p>
      <link rel = "stylesheet" href = "App.css"></link>
      </header>
      <body className="App-body">
        <label><h2>Macro Calculator</h2><br /></label>
        <p>By inputting your statistics we can calculate your approximate macronutrient <br /> needs</p>
        <form>
          <label for = "weight">Weight(kg):</label><br></br>
          <input type = "number" id = "weight" name = "weight"></input>
        </form>
        
      </body>
    </div>
  );
}

export default App;
