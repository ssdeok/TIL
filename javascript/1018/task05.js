let let_variable = 'Hello World';
console.log(let_variable);

const const_variable = 'Hello World';
console.log(const_variable);

let number_variable = 1;
console.log(typeof 1);
let string_variable = '1';
console.log(typeof '1');

// const variable = '상수형 변수에는 재할당 할 수 없다.';
let variable = '상수형 변수에는 재할당 할 수 없다.';
variable = '재할당';
console.log(variable);

let name = '정우영';
let hello = `안녕하세요. ${name} 입니다`;

console.log(hello);

let number1 = 100;
let number2 = 200;

console.log(number1 + number2);
console.log(number1 - number2);
console.log(number1 * number2);
console.log(number1 / number2);

let number11 = 10;
let number22 = 9;

console.log(number11 % 2);
console.log(number22 % 2);

let number_arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(number_arr[0], number_arr[2], number_arr[8], number_arr[9]);

let arr = [10, 20, 30, 40, 50];
console.log(arr);

let todo = {
  userId: 1,
  id: 1,
  title: 'delectus aut autem',
  completed: false,
};

console.log(todo.userId);
console.log(todo.Id);
console.log(todo.title);
console.log(todo.completed);

let person = {
  name: '정우영',
  age: 20,
  city: '서울',
  loaction: '성동',
  language: 'HTML, CSS, JavaScript',
};

console.log(person);
