// 원소가  1, 4, 5, 7인 경우를 제외하고 출력하세요
const arr = [1, 2, 4, 3, 3, 5, 5, 6, 9, 7];

const notLog = [1, 4, 5, 7];

//arr배열을 나열
for (let num of arr) {
  //isInNotLog라는 변수를 false로 만들어 포함이 안된다는것을 표현
  let isInNotLog = false;

  //1,4,5,7 배열을 나열
  for (let notLogNum of notLog) {
    //근데 arr랑 같다면
    if (num === notLogNum) {
      // true가 되고
      isInNotLog = true;
      //빠져나가서 아래로 감
      break;
    }
  }

  // 아래로 왔는데 포함이 되니까 컨티뉴해서 다시 올라가고, 아니면 출력
  if (isInNotLog) continue;
  // 출력
  console.log(num);

  // if (!isInNotLog){
  //   console.log(num)
  // }
}
