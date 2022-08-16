import { useState } from "react";
import './App.css';
import List from "./List";
function App() {
  const [inputItem, setInputItem] = useState(null);
  const [itmeList, updateItemList] =useState([]);
  const onChangeHandler = (e) => {
   console.log("input value",e.target.value);
   setInputItem(e.target.value);
  };
  const addItemToList = () => {
    updateItemList([...itmeList,inputItem]);
    console.log("list items",{item: itmeList,key: Date.now() });
    setInputItem("");
  };

  return (
    <div className="App">
      <header className="App-header">
        <div className="Wrapper">
          <div className='input-wrapper'>
            <input value={inputItem} onChange={onChangeHandler}/>
            <button onClick={addItemToList}>+</button>
          </div>
          <List itmeList={itmeList}/>
        </div>
      </header>
    </div>
  );
}

export default App;
