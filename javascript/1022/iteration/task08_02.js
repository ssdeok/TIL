// 객체와 배열 1

let todos = [
  {
    todoId: 1,
    content: '예습하기',
    isCompleted: false,
  },
  {
    todoId: 2,
    content: '강의듣기',
    isCompleted: false,
  },
  {
    todoId: 3,
    content: '복습하기',
    isCompleted: false,
  },
];
console.log(todos);

// 객체와 배열2
for (let con of todos) {
  console.log(`content: ${con.content}, isCompleted: ${con.isCompleted}`);
}
// 객체와 배열3
for (let con2 of todos) {
  if (con2.todoId === 2) {
    console.log(con2);
  }
}

// 객체와 배열4
for (let con3 of todos) {
  if (con3.todoId === 2) {
    con3.isCompleted = true;
  }
}
console.log(todos);
