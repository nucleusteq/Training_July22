
import Todo from './MyComponent/Todo';
import './MyComponent/Todos.css'
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";


function Home() {
  return <h2>Home</h2>;
}

function About() {
  return <h2>About</h2>;
}

function Users() {
  return <h2>Users</h2>;
}

function App() {
  return (
    <>
    <div className="App">
    <Router>
      <div>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/about">About</Link>
            </li>
            <li>
              <Link to="/users">Users</Link>
            </li>
          </ul>
        </nav>

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Routes>
        <Route path="/about" element={<About />}/>
          <Route path="/users" element={ <Users />}/>
          <Route path="/" element={ <Home />}/>
        </Routes>
      </div>
    </Router>
        <h2>Todo App</h2>
       <Todo/>
     </div>
   </>);
 }

export default App;
