// 1. 2를 곱하는 함수를 만들어보자.

function twoDan(num) {
  let twoDo = num * 2;
  return twoDo;
}
let num = 2;

// 2. 소수를 판별하는 함수를 만들어보자.
function soPri(num) {
  let isPrime = true;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      isPrime = false;
      return isPrime;
    }
  }
  return isPrime;
}

// 3. 구구단 중 n단을 return하는 함수
let two = [];

for (i = 1; i <= 9; i++) {
  two.push(2 * i);
}
console.log(two);

function nDan(n) {
  let bae = [];
  for (i = 1; i <= 9; i++) {
    bae.push(n * i);
  }
  return bae;
}
console.log(nDan(3));

console.log('-------');

// 구구단 만들기
const gugudan = [];
for (let i = 1; i <= 9; i++) {
  gugudan.push(nDan(i));
}
console.log(gugudan);
