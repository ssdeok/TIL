fetch('https://abcnplaceholder.typicode.com/todos/1')
  .then((response) => response.json()) // 응답 데이터를 JSON으로 변환
  .then((json) => {
    // console.log(json);
    const title = json.title;
    console.log(title); // 데이터를 처리
  })
  .catch((error) => console.error(error)); // 에러 처리

  async function getPostById(postId){ 
    const reponse = await fetch (
      'https://abcnplaceholder.typicode.com/todos/1'
    );
    const data = await reponse.json();
    console.log(data);
  }
  
  async function getPosts() {
    const response = await 
  }