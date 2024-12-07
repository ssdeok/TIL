// 40 이하의 3의 배수를 출력하시오(3단의 확장)

for (let i = 3; i <= 40; i += 3) {
  console.log(i);
}

console.log('-------------------');

// 1 ~ 100 중에 7의 배수의 개수를 출력하세요.
let count = 0;
for (let i = 1; i <= 100; i++) {
  if (i % 7 == 0) {
    count++;
  }
}
console.log(count);

console.log('-------------------');

const arr = [1, 2, 4, 3, 3, 5, 5, 6, 9, 7];
// 원소가  1, 4, 5, 7인 경우를 제외하고 출력하세요

// 우선 이 배열을 선택한다.
// 그 중 1, 4, 5, 7을 선택하든 빼든간에 해서
// 출력을 한다.
const notlog = [1, 4, 5, 7];

for (let num of arr) {
  let isInNotLog = false;

  for (let arr2 of notlog) {
    if (num === arr2) {
      isInNotLog = true;
      break;
    }
  }
  if (isInNotLog) continue;
  console.log(num);
}

console.log('-------------------');

for (let num1 of arr) {
  if (num1 === 1 || num1 === 4 || num1 === 5 || num1 === 7) {
    continue;
  }
  console.log(num1);
}

console.log('-------------------');

// 1 ~ 9 까지의 자연수 중 제곱한 수가 10 이상 50 이하인 자연수의 리스트를 출력해보세요.
// 1~9까지의 자연수를 구한다
// 그 것들을 제곱한다
// 제곱한 것들이 10~50 사이인 것들을 구한다

let nature = [];

for (let i = 1; i < 10; i++) {
  let two = i * i;

  if (two >= 10 && two <= 50) {
    nature.push(i);
  }
}
console.log(nature);

console.log('-------------------');

// 두개의 숫자에 대해. 두 수 사이에 속한 모든 정수의 합을 구하시오.
// (ex. 2와 5를 입력받는다면 2 + 3 + 4 + 5 = 14)

const ding = 1;
const dong = 5;

let total = 0;
for (let di = ding; di <= dong; di++) {
  total += di;
}
console.log(total);

console.log('-------------------');

// 2의 배수 혹은 3의 배수를 제외하고 1~30까지 숫자를 출력하시오.
// 1 5 7 11 13 17 19 23 25 29

for (let i = 1; i <= 30; i++) {
  if (i % 2 === 0 || i % 3 === 0) continue;
  console.log(i);
}

console.log('-------------------');

// 자연수 n이 주어졌을 때, n이 소수인지 판단하시오.

let n = 11;

let isPrime = true;
for (let i = 2; i < n; i++) {
  if (n % i === 0) {
    isPrime = false;
  }
}
console.log(isPrime);

console.log('-------------------');

// 주어진 테이블의 데이터를 "people" 변수에 저장하시오.

let people = [
  {
    name: 'jun',
    age: 15,
    gender: 'M',
  },
  {
    name: 'ken',
    age: 26,
    gender: 'F',
  },
  {
    name: 'alex',
    age: '37',
    gender: null,
  },
];
console.log(people);

console.log('-------------------');

// 사람에 대한 정보를 각각 출력하시오(형식은 자유롭게)

for (let person of people) {
  // console.log(person);
  for (let key in person) {
    let value = person[key];
    console.log(key, value);
  }
}

console.log('-------------------');

// 이름이 alex인 사람에 대한 정보를 출력하시오
for (let person of people) {
  const name = person.name;
  if (name === 'alex') {
    console.log(person);
  }
}

console.log('-------------------');

// 이름이 alex인 사람의 나이를 출력하시오
for (let person of people) {
  const name1 = person.name;
  if (name1 === 'alex') {
    // const age = person.age;
    console.log(person.age);
  }
}

console.log('-------------------');

// 이름을 활용하여 각 사람의 데이터에 쉽게 접근할 수 있도록 people 변수를 수정하시오.

let people2 = {
  jun: {
    name: 'jun',
    age: 15,
    gender: 'M',
  },
  ken: {
    name: 'ken',
    age: 36,
    gender: 'F',
  },
  alex: {
    name: 'alex',
    age: 37,
    gender: null,
  },
};

console.log('-------------------');

const nums = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

// 1 ~ 9 순서대로 출력해보자
for (let num2 of nums) {
  for (let num3 of num2) {
    console.log(num3);
  }
}

// 1.  행들의 합의 값으로 리스트를 만드세요
// - [6, 15, 24]. 즉,  [1 + 2 + 3,  4 + 5 + 6, 7 + 8 + 9]

let list = [];

for (let arr of nums) {
  let sum = 0;
  for (let num of arr) {
    sum += num;
  }
  list.push(sum);
}
console.log(list);

console.log('-------------------');

let array = [];

for (let i = 0; i < n; i++) {
  let sum = 0;
  for (let j = 0; j < m; j++) {
    sum += nums[n][m];
  }
  result.push(sum);
}
console.log(array);
