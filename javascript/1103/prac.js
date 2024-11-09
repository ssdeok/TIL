async function createTodo(newTodo) {
  /*
    POST /todos : 리소스 생성을 요청하는 엔드포인트
  */
  const response = await fetch('http://localhost:3000/todos', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    // body : 생성할 리소스 정보를 전송
    body: JSON.stringify(newTodo),
  });
  const todo = await response.json();
  return todo;
}

async function createTodoExample() {
  /*
    newTodo : 생성할 리소스 정보
  */
  let newTodo = {
    id: 3,
    content: '복습 하기',
    completed: false,
  };

  let response = await createTodo(newTodo);
  console.log(todo);
}

createTodoExample();
