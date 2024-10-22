// 1 ~ 100 중에 7의 배수의 개수를 출력하세요.

let count = 0;

for (let i = 7; i <= 100; i = i + 7) {
  count++;
}
console.log(count);

console.log('-------');

let count1 = 0;
for (let num = 1; num <= 100; num++) {
  if (num % 7 === 0) {
    count1++;
  }
}
console.log(count1);

count2 = 0;
for (let num1 = 1; num1 <= 100; num1++) {
  if (num1 % 7) continue;
  count2++;
}
console.log(count2);

count3 = Math.floor(100 / 7);
console.log(count3);
