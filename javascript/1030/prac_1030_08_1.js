// 과제 08-1

// 1부터 N까지 출력 1
let N = 5;
console.log(N);
for (i = 1; i <= N; i++) {
  console.log(i);
}

// 1부터 N까지 출력 2
let N1 = 5;
console.log(N1);
let i2 = 1;
while (i2 <= N1) {
  console.log(i2);
  i2++;
}

console.log('----------');
// 1부터 N까지의 합
let N2 = 10;
let total = 0;
console.log(N2);

for (i3 = 1; i3 <= N2; i3++) {
  total += i3;
}
// let i3 = 1;
// while (i3 <= N2) {
//   total += i3;
//   i3++;
// }
console.log(total);

console.log('----------');
// 짝수의 합
let N3 = 5;
let total1 = 0;
console.log(N3);
// let i4 = 1;
for (i4 = 1; i4 <= N3; i4++) {
  if (i4 % 2 === 0) {
    total1 += i4;
  }
}
console.log(total1);

console.log('----------');

// 짝수의 개수
let N_2 = 5;
let count = 0;
for (i5 = 1; i5 <= 5; i5++) {
  if (i5 % 2 === 0) {
    count++;
  }
}
console.log(count);

console.log('----------');
// 반복문 제어
arr = [1, 9, 3, 11, 4, 5, 2, 7];
for (let arr2 of arr) {
  if (arr2 % 2 === 0) {
    break;
  } else {
    console.log(arr2);
  }
}
