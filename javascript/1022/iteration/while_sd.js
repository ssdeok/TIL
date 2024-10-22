//2,4,6,8,10 출력

let num2 = 2;

while (true) {
  console.log(num2);
  num2 += 2;

  // 10일때 멈춰.
  if (num2 === 10) {
    break;
  }
}
