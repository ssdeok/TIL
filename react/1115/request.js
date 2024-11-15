import axios from "axios";

async function fetchData(arms) {
  const url = 'https://jsonplaceholder.typicode.com/todos/1'
  

  const response = await 
  
}

fetchData();

async function fetchDataWithAxios() {
  const url =
  'https://jsonplaceholder.typicode.com/todos/1'

  const reponse = await axios ({
    url: url,
  })
console.log(response.data)
}
fetchDataWithAxios()