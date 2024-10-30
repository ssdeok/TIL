// 자바스크립트 제어문 실습2

// 1
//40 이하의 3의 배수를 출력하시오(3단의 확장).
// for (i = 1; i <= 40; i++) {
//   if (i % 3 === 0) {
//     console.log(i);
//   }
// }
for (let num = 3; num <= 40; num += 3) {
  console.log(num);
}

// 2
// 1 ~ 100 중에 7의 배수의 개수를 출력하세요.
count = 0;
for (i = 7; i <= 100; i += 7) {
  count++;
}
console.log(count);

// 3
const arr = [1, 2, 4, 3, 3, 5, 5, 6, 9, 7];

const notLog = [1, 4, 5, 7];

for (let num2 of arr) {
  let isInNotLog = false;

  for (let notLogNum of notLog) {
    if (num2 === notLogNum) {
      isInNotLog = true;
      break;
    }
  }
  if (isInNotLog) continue;
  console.log(num2);
}

// 1 ~ 9 까지의 자연수 중 제곱한 수가 10 이상 50 이하인 자연수의 리스트를 출력해보세요.
// 이거 할 차례
