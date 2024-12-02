// money car 조합해서 False가 나오도록.False가

let money = true;
let car = true;

let result = money ^ car ? true : false;
console.log(`${result}입니다`);

// 제어문 실습

// 1번
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

// 2번

// const isWeekend = true;
// const nowTime = 19;
// const workTime = [9, 10, 11, 12, 13, 14, 15, 16, 17, 18];

// if (isWeekend == true) {
//   console.log('휴식');
//   if (isWeekend == false) {
//     console.log('자기개발');
//   }
// } else if (nowTime == nowTime) {
//   console.iog('일');
// }

// 주말이거나 일과시간 이후= 휴식
// 주말의 일과시간 이후 = 자기개발
// 일과시간 = 일
// !일과시간 == 일과이후

const isWeekend = true;
const nowTime = 19;

// 주말 일과시간
// t      t      휴식
// t      f    자기개발
// f      t    일
// f     f     휴식

let iswork;

// 9~18에는 iswork는 true
// 아닐때는 iswork는 false

if (9 <= nowtime && nowtime <= 18) {
  iswork = true;
} else {
  iswork = false;
}
