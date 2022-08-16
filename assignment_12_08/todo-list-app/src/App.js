import './App.css';
import PageHeader from './components/PageHeader';
import FilterTodoList from './components/FilterTodoList';
function App() {
  
  return (
    <div className='appContainer'>
    <PageHeader></PageHeader>
    <FilterTodoList></FilterTodoList>
    </div>
    
  );
}

export default App;
