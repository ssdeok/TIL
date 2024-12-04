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
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];

for (let gugudan in nums) {
  console.log(`3*${nums[gugudan]} = ${3 * nums[gugudan]}`);
}

console.log('-------------------');

for (let gugu of nums) {
  console.log(`3* ${gugu} = ${3 * gugu}`);
}

console.log('-------------------');

// 출석번호를 포함하여 '1번 jun', ..., '4번 lynda'의 형태로 출석을 부르시오.
const names = ['jun', 'beemo', 'ken', 'lynda'];

for (let check in names) {
  console.log(`${parseInt(check) + 1}번 ${names[check]}`);
}

console.log('-------------------');
let numbers = 1;

for (let naming of names) {
  console.log(`${numbers}번 ${naming}`);
  numbers++;
}

console.log('-------------------');

let index = 0;
while (index < names.length) {
  let name = names[index];
  console.log(index + 1, name);
  index++;
}

console.log('-------------------');

const namez = ['jun', 'beemo', 'ken'];
const ages = [18, 28, 37];
// 18살 jun
// 28살 beemo
// 37살 ken
// 을 출력하시오.

for (let i = 0; i < namez.length; i++) {
  console.log(`${ages[i]}살`, namez[i]);
}

console.log('-------------------');

//주어진 리스트의 길이를 계산하시오
const namess = ['jun', 'beemo', 'ken', 'lynda'];

console.log(namess.length);

console.log('-------------------');

// 주어진 리스트의 합계를 계산하시오
const numss = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let two = 0;
for (let one of numss) {
  two += one;
}
console.log(two);

console.log('-------------------');

// 주어진 리스트에서 최소값을 찾으시오
const numzz = [10, 6, 8, 5, 4, 2, 3, 11];
let min = 100;
for (let num of numzz) {
  if (num < min) {
    min = num;
  }
}
console.log(min);

console.log('-------------------');

//주어진 리스트의 순서를 뒤집으시오
const numm = [10, 6, 8, 5, 4];
// 결과
// const reversedNum = [4, 5, 8, 6, 10];

// numm.reverse();
// console.log(numm);

const reversedNum = [];

for (let index in nums) {
  let newindex = numm.length - 1 - index;

  let newvalue = nums[newindex];

  reversedNum.push(newvalue);
}
