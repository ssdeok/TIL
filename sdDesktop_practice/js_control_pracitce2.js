// 40 이하의 3의 배수를 출력하시오(3단의 확장)

for (let i = 3; i <= 40; i += 3) {
  console.log(i);
}

console.log('-------------------');

// 1 ~ 100 중에 7의 배수의 개수를 출력하세요.
let count = 0;
for (let i = 1; i <= 100; i++) {
  if (i % 7 == 0) {
    count++;
  }
}
console.log(count);

console.log('-------------------');

const arr = [1, 2, 4, 3, 3, 5, 5, 6, 9, 7];
// 원소가  1, 4, 5, 7인 경우를 제외하고 출력하세요

for (let arr1 of arr) {
  
}
