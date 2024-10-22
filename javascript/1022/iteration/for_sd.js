const arr = [2, 3, 5, 1, 3];

// arr가 텅 빌 때 까지 e1를 출력하고 싶어요.

// shift를 통해 arr을 제거해야한다
// arr제거를 반복문으로 만든다
// arr이 모두 제거되면 멈춘다

// const e1 = arr.shift();

// console.log(arr);
// console.log(e1);
console.log();
while (arr.length) {
  el = arr.pop();
  console.log(`el : ${el} / arr.length : ${arr.length}`);
}
