// 자바스크립트 제어문 실습

// 조건문

// 1
const score = 100;

if (score >= 90) {
  console.log('A');
  if (score === 100) {
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

// 2
//주말이거나 일과시간 이후 = 휴식
// 주말의 일과시간 이후 = 자기개발
// 주말이 아니거나 일과시간 = 일

const isWeekend = true;
const nowTime = 9;

let isWorkingHour;

if (nowTime >= 9 && nowTime <= 18) {
  isWorkingHour = true;
} else {
  isWorkingHour = false;
}

let toDo;

if (isWeekend) {
  if (isWorkingHour) {
    toDo = '휴식';
    console.log(toDo);
  } else {
    toDo = '자기개발';
    console.log(toDo);
  }
} else {
  if (isWorkingHour) {
    toDo = '일';
    console.log(toDo);
  } else {
    toDo = '휴식';
    console.log(toDo);
  }
}

// 반복문
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9];
for (let gugu of nums) {
  console.log(`${gugu}*3 = ${gugu * 3}`);
}

console.log('----------');

const names = ['jun', 'beemo', 'ken', 'lynda'];

let index = 0;
while (index < names.length) {
  let name = names[index];
  console.log(index + 1, name);
  index++;
}

console.log('----------');

const name1 = ['jun', 'beemo', 'ken', 'lynda'];
console.log(name1.length);

console.log('----------');

const nums2 = [10, 6, 8, 5, 4, 2, 3, 11];

let minNum = nums2[0];

for (num of nums2) {
  if (minNum > num) {
    minNum = num;
  }
}

console.log(minNum);

console.log('----------');

const nums3 = [10, 6, 8, 5, 4];

const reversedNum = [];

for (i = nums3.length - 1; i > -1; i--) {
  const newValue = nums3[i];
  reversedNum.push(newValue);
}
// for (let index in nums3) {
//   let newIndex = nums3.length - 1 - index;

//   let newValue = nums3[newIndex];
//   reversedNum.push(newValue);
// }
console.log(reversedNum);
