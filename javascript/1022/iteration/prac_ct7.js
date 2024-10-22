//자연수 n이 주어졌을 때, n이 소수인지 판단하시오

let num = 4;
let isPrime = true;
//2~n-1을 i=2부터 17이라면 16까지 구해지게 표현
for (let i = 2; i < num; i++) {
  if (num % i === 0) {
    isPrime = false;
  }
}

console.log(isPrime);
