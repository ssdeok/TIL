// 배열 생성
let arr = [1, 3, 5, -3, 9, 10, 23, -6, 44, 22, -10, 5, 20];

// 양수 출력
arr.forEach((num) => {
  if (num > 0) {
    console.log(num);
  }
});

console.log('----------');

// 곱하기2
let multi = arr.map((num) => {
  return num * 2;
});
console.log(multi);

console.log('----------');

// 양수 홀수 배열
let hol = arr.filter((num) => {
  return num > 0 && num % 2 !== 0;
});
console.log(hol);

console.log('----------');

// 첫 번째 5 찾기
let firstIn = arr.findIndex((num) => {
  return num % 5 === 0;
});
console.log(firstIn);

console.log('----------');

// 배열 내 객체 출력하기 1

const todos = [
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

todos.forEach((num) => {
  console.log(num);
});

console.log('----------');

// 배열 내 객체 출력하기 2

let todos1 = [
  {
    todoId: 1,
    content: '예습하기',
    isCompleted: false,
  },
  {
    todoId: 2,
    content: '강의듣기',
    isCompleted: true,
  },
  {
    todoId: 3,
    content: '복습하기',
    isCompleted: true,
  },
];
let second = todos1.filter((num) => {
  return num.isCompleted === true;
});
second.forEach((num) => console.log(num));

// todos1.forEach((num) => {
//   if (num.isCompleted === true) {
//     console.log(num);
//   }
// });

console.log('----------');

// 이차원 배열 출력
let matrix = [
  [4, 2],
  [3, 2],
  [5, 7],
  [10, 1],
];

matrix.forEach((arr) => {
  console.log(arr[1]);
});

console.log('----------');

// 이차원 배열의 합
let matrix2 = [
  [4, 2],
  [3, 2],
  [5, 7],
  [10, 1],
];

let sums = matrix2.filter((num) => {
  let total = num[0] + num[1];
  return total % 2 === 0;
});
console.log(sums);
