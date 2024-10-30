// 과제 08-2

// 객체와 배열 1
let todos = [];

todos.push(
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
  }
);
console.log(todos);

// 객체와 배열 2
for (let arr1 of todos) {
  console.log(`content: ${arr1.content}, isCompleted: ${arr1.isCompleted}`);
}

// 객체와 배열 3
for (let arr2 of todos) {
  if (arr2.todoId === 2) {
    console.log(arr2);
  }
}

// 객체와 배열 4
for (let arr3 of todos) {
  if (arr3.todoId === 2) {
    arr3.isCompleted = true;
  }
}
console.log(todos);

// Todo List 웹 페이지
