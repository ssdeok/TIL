import axios from "axios";

async function fetchData() {
  const url =
    "https://jsonplaceholder.typicode.com/todos/1?key=value?key=value";
  const paramsObj = {
    key: "value",
    key: "value",
  };
  const params = new URLSearchParams(paramsObj);
  const response = await fetch(url);
  const jsonData = await response.json();
  console.log(jsonData);
}
fetchData();

async function fetchDataWithAxios() {
  const url =
    "https://jsonplaceholder.typicode.com/todos/1?key=value?key=value";

  const response = await axios({
    url: url,
  });
  console.log(response.data);
}
fetchDataWithAxios();
