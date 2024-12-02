// 1. 다음 점수에 따라 등급을 출력하는 코드를 작성하시오.
//     - 90 이상: "A" /  80 이상: "B" /  그 외: "C"
//     - 단, 100점은 A학점과 더불어 `교수님의 총애`를, 40점 미만은 C학점과 더불어 `학사경고`를 출력하시오.
const score = 100;

if (score >= 90) {
  console.log('A');
  if (score == 100) {
    console.log('교수님의 총애');
  }
} else if (score >= 80) {
  console.log('B');
} else {
  console.log('C');
  if (score < 40) {
    console.log('학사경고');
  }
}
console.log('-------------------');
// 새싹이는 주말이거나 일과시간 이후면 휴식을 취할 수 있다. 단, 주말의 일과시간 이후에는 자기개발을 할 예정이다.
// 일과시간이 09시 ~ 18시일 때, 변수의 상태에 따라 일 / 휴식/ 자기개발을 출력하시오.
// 주말이거나 일과시간 이후 = 휴식
// 주말의 일과시간 이후 = 자기개발
// 주말이 아닌 날 = 일
// 일과시간 = 일
const isWeekend = false;
const nowTime = 18;

// 주말 일과시간
// t      t      휴식
// t      f      자기개발
// f      t      일
// f      f      휴식

let isWork;

// 9~18에는 iswork는 true
// 아닐때는 iswork는 false

if (9 <= nowTime && nowTime <= 18) {
  isWork = true;
} else {
  isWork = false;
}

let toDo;

if (isWeekend) {
  if (isWork) {
    toDo = '휴식';
    console.log(toDo);
  } else {
    toDo = '자기개발';
    console.log(toDo);
  }
} else {
  if (isWork) {
    toDo = '일';
    console.log(toDo);
  } else {
    toDo = '휴식';
    console.log(toDo);
  }
}

console.log('-------------------');
//nums가 다음과 같을 때, 구구단 3단을 출력하시오
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]

if ()