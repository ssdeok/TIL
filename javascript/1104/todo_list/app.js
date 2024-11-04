// API 베이스 URL
const URL = 'http://localhost:3000/todos';
const todoListTag = document.querySelector('#todo-list');

// DOMContentLoaded : HTML 문서 로딩이 끝나면 실행되는 이벤트
// 페이지가 로드되면 Todo 목록 초기화 함수를 실행한다.
document.addEventListener('DOMContentLoaded', initTodos);

///////////////////////////////////////////////////////////////////
// 상태변경
// 완료 버튼을 눌렀을 때 => 취소선이 그어지고 / 취소선이 그어진 상태에서는 없어짐
// compoleted => true / false 토글
// db에 반영

///////////////////////////////////////////////////////////////////
// Todo 생성

// 데이터의 관점
// 데이터를 받아다가 db에 저장한다

// 사용자의 관점
// 1. 데이터를 입력한다
// 2. 추가 버튼을 누른다.
// -> todo가 추가된다.

// front의 관점
// 사용자의 관점 (입력을 받아서 추가버튼을 누르면)
// 데이터의 관점 (db에 저장을 시키고)
// 데이터를 rendering한다.

// 버튼을 누르면 동작이 실행됨.
const addButton = document.querySelector('#add-todo');
addButton.addEventListener('click', addTodo);

async function deleteTodo(todo) {
  const { id } = todo;
  const response = await fetch(URL + '/' + id, {
    method: 'DELETE',
  });
}

// completed 상태를 변경한다.
async function patchTodo(todo) {
  const { id } = todo;

  const response = await fetch(URL + '/' + id);
  const data = await response.json();
  const { completed } = data;
  // spanTag가 completed class를 가지고 있니?
  // 에서, completed class는 사용자가 controll할 수 있는 정보이기 때문에
  // 다시 서버에 요청을 보내 정확한 데이터를 가지고 동작을 하도록 하였다.
  // react에서는 state로 관리할 수 있다.

  const responsePatch = await fetch(URL + '/' + id, {
    method: 'PATCH',
    body: JSON.stringify({
      completed: !completed,
    }),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  });
  const dataPatch = await responsePatch.json();
  return dataPatch;
}

// addTodo함수를 실행한다
async function addTodo() {
  // 입력을 받아다가 => db에 저장하고 => 보여준다.

  // html의 todo-input을 선택하는 변수 inputTag를 생성한다
  const inputTag = document.querySelector('#todo-input');
  // inputTag의 value를 가리키는 변수 value를 생성한다
  const value = inputTag.value;

  // 그 value를 비동기로 실행하는 함수 postTodo를 data로 선언하고
  const data = await postTodo(value);

  // 그 data를 renderTodo 함수로 실행한다
  renderTodo(data);

  // 입력하기 전엔 공백이다라는 뜻이다
  inputTag.value = '';
}

// value를 전달받아 postTodo함수를 실행한다
async function postTodo(value) {
  // URL에 요청을 하는 비동기 행위를 repponse 변수로 만든다
  const response = await fetch(URL, {
    // 방식은 POST
    method: 'POST',
    // body는 무슨뜻이지?
    body: JSON.stringify({
      //가져올 value 2가지
      content: value,
      completed: false,
    }),
    // headers는 무슨뜻이지?
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  });
  // 요청했던것을 json으로 응답받는것을 data로 선언한다
  const data = await response.json();

  // data를 리턴한다.
  return data;
}

///////////////////////////////////////////////////////////////////

// 초기값 세팅
async function initTodos() {
  // 1. 데이터 가져오기
  const todos = await fetchTodos();
  // 2. 데이터 보여주기

  renderTodos(todos);
}

// Todos json 형태로 가져오기.
async function fetchTodos() {
  const response = await fetch(URL);
  const data = await response.json();
  return data;
}

// todos를 입력받아 보여주기.
function renderTodos(todos) {
  todos.forEach((todo) => {
    renderTodo(todo);
  });
}

function renderTodo(todo) {
  // 하나의 todo에 대한 태그들
  const liTag = document.createElement('li');

  // span
  const spanTag = document.createElement('span');
  const { content, completed } = todo;
  spanTag.textContent = content;
  if (completed) {
    spanTag.classList.add('completed');
  }

  // complete
  const completeButton = document.createElement('button');
  completeButton.textContent = '완료';
  completeButton.addEventListener('click', async (e) => {
    // 단순한 토글이 아니라, database의 patch가 성공하면 toggle해
    const data = await patchTodo(todo);
    const { completed } = data;
    // spanTag.classList.toggle('completed');
    if (completed) {
      spanTag.classList.add('completed');
    } else {
      spanTag.classList.remove('completed');
    }
  });

  // delete
  const deleteButton = document.createElement('button');
  deleteButton.textContent = '삭제';
  deleteButton.addEventListener('click', async () => {
    await deleteTodo(todo);
    liTag.remove();
  });

  liTag.append(spanTag, completeButton, deleteButton);
  todoListTag.append(liTag);
}
