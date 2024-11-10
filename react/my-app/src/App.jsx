function App() {
  function handelClick() {
    alert('클릭했네!');
  }

  return <div onClick={handelClick}>App</div>;
}

export default App;
