// 1부터 N까지 출력1

let N = 10;
console.log(N);

for (let i = 1; i <= N; i++) {
  console.log(i);
}

console.log('-------');
// 1부터 N까지 출력 2

let N1 = 5;
console.log(N1);
let i = 0;
while (i < N1) {
  i++;
  console.log(i);
}

console.log('-------');
// 1부터 N까지의 합
let N2 = 5;
let total = 0;
console.log(N2);

for (i = 1; i <= N2; i++) {
  total += i;
}
console.log(total);

console.log('-------');
// 짝수의 합
let N3 = 5;
let total1 = 0;
console.log(N3);

for (i = 2; i <= N3; i *= 2) {
  total1 += i;
}
console.log(total1);

console.log('-------');
// 짝수의 개수

let N4 = 5;
console.log(N4);
let count = 0;
for (let num = 1; num <= N4; num++) {
  if (num % 2 === 0) {
    count++;
  }
}
console.log(count);

// 반복문 제어
arr = [1, 9, 3, 11, 4, 5, 2, 7];

for (let i of arr) {
  if (i % 2 === 0) {
    break;
  }
  console.log(i);
}
