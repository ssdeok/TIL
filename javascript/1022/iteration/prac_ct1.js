// 40이하의 3의 배수를 출력(3단의 확장)

// 1~40까지의 수 중 3의 배수

for (let i = 3; i <= 40; i = i + 3) {
  console.log(i);
}

for (let num = 1; num * 3 <= 40; num++) {
  console.log(num * 3);
}
