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
        <label><h2>Macro Calculator</h2></label>
        <p>By inputting your statistics we can calculate your approximate macronutrient <br /> needs</p><br></br>
        <form>
          <label for = "weight">How heavy are you? (kg):</label><br></br>
          <input type = "number" id = "weight" name = "weight"></input><br></br><br></br>
          <label for = "height">How tall are you? (cm):</label><br></br>
          <input type = "number" id = "height" name = "height"></input><br></br><br></br>
          <label for = "age">How old are you? (years):</label><br></br>
          <input type = "number" id = "age" name = "age"></input><br></br><br></br>
          <label for = "sex">What were you born as?:</label><br></br>
          <select>
            <option value="m">Male</option>
            <option value="f">Female</option>
          </select><br></br><br></br>
          <label for = "goal">What are your goals?:</label><br></br>
          <select>
            <option value="m">Maintain</option>
            <option value="b">Bulk</option>
            <option value="c">Cut</option>
          </select><br></br><br></br>
        </form>
        
      </body>
    </div>
  );
}

export default App;
