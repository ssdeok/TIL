//2의 배수 혹은 3의 배수를 제외하고 1~30까지 숫자를 출력하시오.
//  1 5 7 11 13 17 19 23 25 29

for (let i = 1; i <= 30; i++) {
  // num%2는 num을 2로 나눈 나머지가 있다
  if (!(i % 2)) continue;

  if (!(i % 3)) continue;

  console.log(i);
}

console.log('-------');

for (let num = 1; num <= 30; num++) {
  if (num % 2 === 0 || num % 3 === 0) continue;

  console.log(num);
}

console.log('-------');

for (let num1 = 1; num1 <= 30; num1++) {
  if (num1 % 2 && num1 % 3) {
    console.log(num1);
  }
}
